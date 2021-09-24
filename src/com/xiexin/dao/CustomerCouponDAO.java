package com.xiexin.dao;

import com.xiexin.bean.CustomerCoupon;
import com.xiexin.bean.CustomerCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerCouponDAO {
    long countByExample(CustomerCouponExample example);

    int deleteByExample(CustomerCouponExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerCoupon record);

    int insertSelective(CustomerCoupon record);

    List<CustomerCoupon> selectByExample(CustomerCouponExample example);

    CustomerCoupon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerCoupon record, @Param("example") CustomerCouponExample example);

    int updateByExample(@Param("record") CustomerCoupon record, @Param("example") CustomerCouponExample example);

    int updateByPrimaryKeySelective(CustomerCoupon record);

    int updateByPrimaryKey(CustomerCoupon record);
}