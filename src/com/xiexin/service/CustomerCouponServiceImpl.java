package com.xiexin.service;

import com.xiexin.bean.CustomerCoupon;
import com.xiexin.bean.CustomerCouponExample;
import com.xiexin.dao.CustomerCouponDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerCouponService")
public class CustomerCouponServiceImpl implements CustomerCouponService{
	@Autowired(required = false)
	private CustomerCouponDAO customerCouponDAO;
	public long countByExample(CustomerCouponExample example){
    	return customerCouponDAO.countByExample(example);
    }

	public int deleteByExample(CustomerCouponExample example){
    	return customerCouponDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return customerCouponDAO.deleteByPrimaryKey(id);
    }

	public int insert(CustomerCoupon record){
    	return customerCouponDAO.insert(record);
    }

	public int insertSelective(CustomerCoupon record){
    	return customerCouponDAO.insertSelective(record);
    }

	public List<CustomerCoupon> selectByExample(CustomerCouponExample example){
    	return customerCouponDAO.selectByExample(example);
    }

	public CustomerCoupon selectByPrimaryKey(Integer id){
    	return customerCouponDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(CustomerCoupon record, CustomerCouponExample example){
    	return customerCouponDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(CustomerCoupon record, CustomerCouponExample example){
    	return customerCouponDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(CustomerCoupon record){
    	return customerCouponDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(CustomerCoupon record){
    	return customerCouponDAO.updateByPrimaryKey(record);
    }


}
