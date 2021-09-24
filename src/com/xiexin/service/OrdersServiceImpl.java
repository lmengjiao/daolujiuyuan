package com.xiexin.service;

import com.xiexin.bean.Orders;
import com.xiexin.bean.OrdersExample;
import com.xiexin.dao.OrdersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ordersService")
public class OrdersServiceImpl implements OrdersService{
	@Autowired(required = false)
	private OrdersDAO ordersDAO;
	public long countByExample(OrdersExample example){
    	return ordersDAO.countByExample(example);
    }

	public int deleteByExample(OrdersExample example){
    	return ordersDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return ordersDAO.deleteByPrimaryKey(id);
    }

	public int insert(Orders record){
    	return ordersDAO.insert(record);
    }

	public int insertSelective(Orders record){
    	return ordersDAO.insertSelective(record);
    }

	public List<Orders> selectByExample(OrdersExample example){
    	return ordersDAO.selectByExample(example);
    }

	public Orders selectByPrimaryKey(Integer id){
    	return ordersDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Orders record, OrdersExample example){
    	return ordersDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Orders record, OrdersExample example){
    	return ordersDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Orders record){
    	return ordersDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Orders record){
    	return ordersDAO.updateByPrimaryKey(record);
    }


}
