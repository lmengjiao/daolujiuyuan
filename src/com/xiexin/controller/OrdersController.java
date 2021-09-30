package com.xiexin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiexin.bean.Orders;
import com.xiexin.bean.OrdersExample;
import com.xiexin.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.JedisPool;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*") //*是来自所有的域名请求 也可以细化 解决跨域
public class OrdersController{
@Autowired(required = false)
private OrdersService ordersService;
@Autowired
    private JedisPool jedisPool;

@RequestMapping("/addOrders")
public Map addOrders(HttpServletRequest request,Orders orders){
    Map codeMap=new HashMap();
    System.out.println("访问成功");
    System.out.println("orders = " + orders);
    String phoneNumber = (String) request.getAttribute("phoneNumber");
    System.out.println("phoneNumber = " + phoneNumber);
    orders.setPhone(phoneNumber);
    orders.setCreatetime(new Date());
    orders.setStatus("已接单");
        int i = ordersService.insertSelective(orders);
        if (i == 1) {
            codeMap.put("code", 0);
            codeMap.put("msg", "您的提交已经收到 请安心等待 我们讲电话联系您");
            return codeMap;
            //当顾客点多次提交 学名叫做Ajax重复提交
            //第一次提交完毕 将提交按钮变为不可点击状态 提交2字变为已提交订单 请稍等 （前端）
            //n次提交（防黑客 点击速度比较快） 返回亲 我知道您很急 订单已经接收了 稍等（后端）
            //思路 先查询该手机号有没有订单状态在redis 有了就返回给前端  没有就返回新增
        } else {
            codeMap.put("code", 40001);
            codeMap.put("msg", "由于网络故障，未能添加成功，请再次提交");
            return codeMap;
        }
    }


//增
// 后端订单增加 -- 针对layui的 针对前端传 json序列化的
@RequestMapping("/insert")
public Map insert(@RequestBody Orders orders) { // orders 对象传参, 规则: 前端属性要和后台的属性一致!!!
    Map map = new HashMap();
    Boolean phoneNumber = jedisPool.getResource().exists("phoneNumber");
        int i = ordersService.insertSelective(orders);
        if (i > 0) {
            map.put("code", 200);
            map.put("msg", "添加成功");
            return map;
        } else {
            map.put("code", 400);
            map.put("msg", "添加失败,检查网络再来一次");
            return map;
        }

}


// 删
// 删除订单  根据 主键 id 删除
@RequestMapping("/deleteById")
public Map deleteById(@RequestParam(value = "id") Integer id) {
Map responseMap = new HashMap();
int i = ordersService.deleteByPrimaryKey(id);
if (i > 0) {
responseMap.put("code", 200);
responseMap.put("msg", "删除成功");
return responseMap;
} else {
responseMap.put("code", 400);
responseMap.put("msg", "删除失败");
return responseMap;
}
}

// 批量删除
@RequestMapping("/deleteBatch")
public Map deleteBatch(@RequestParam(value = "idList[]") List<Integer> idList) {
    for (Integer integer : idList) {
    this.deleteById(integer);
    }
    Map responseMap = new HashMap();
    responseMap.put("code", 200);
    responseMap.put("msg", "删除成功");
    return responseMap;
    }


// 改
    // 修改订单
    @RequestMapping("/update")
    public Map update(@RequestBody Orders  orders) {
    Map map = new HashMap();
    int i = ordersService.updateByPrimaryKeySelective( orders);
    if (i > 0) {
    map.put("code", 200);
    map.put("msg", "修改成功");
    return map;
    } else {
    map.put("code", 400);
    map.put("msg", "修改失败,检查网络再来一次");
    return map;
    }
    }

// 查--未分页
    // 全查
    @RequestMapping("/selectAll")
    public Map selectAll(){
    List<Orders> orderss =  ordersService.selectByExample(null);
        Map responseMap = new HashMap();
        responseMap.put("code", 0);
        responseMap.put("msg", "查询成功");
        responseMap.put("orderss", orderss);
        return responseMap;
        }

// 查-- 查询+自身对象的查询 + 分页
// 分页查询
    @RequestMapping("/selectAllByPage")
    public Map selectAllByPage(Orders orders, @RequestParam(value = "page", defaultValue = "1", required = true) Integer page,
    @RequestParam(value = "limit", required = true) Integer pageSize) {
    // 调用service 层   , 适用于 单表!!!
    PageHelper.startPage(page, pageSize);
    OrdersExample example = new OrdersExample();
    OrdersExample.Criteria criteria = example.createCriteria();

//    if (null!=orders.getYYYYYYYY()&&!"".equals(orders.getYYYYYYY())){
//         criteria.andPhoneEqualTo(orders.getPhone());   // 1
//    }

    List<Orders> orderssList = ordersService.selectByExample(example);
        PageInfo pageInfo = new PageInfo(orderssList);
        long total = pageInfo.getTotal();
        Map responseMap = new HashMap();
        responseMap.put("code", 0);
        responseMap.put("msg", "查询成功");
        responseMap.put("pageInfo", pageInfo);
        responseMap.put("count", total);
        return responseMap;
        }




    }
