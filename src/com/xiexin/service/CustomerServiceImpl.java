package com.xiexin.service;

import com.xiexin.bean.Customer;
import com.xiexin.bean.CustomerExample;
import com.xiexin.dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
	@Autowired(required = false)
	private CustomerDAO customerDAO;
	public long countByExample(CustomerExample example){
    	return customerDAO.countByExample(example);
    }

	public int deleteByExample(CustomerExample example){
    	return customerDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return customerDAO.deleteByPrimaryKey(id);
    }

	public int insert(Customer record){
    	return customerDAO.insert(record);
    }

	public int insertSelective(Customer record){
    	return customerDAO.insertSelective(record);
    }

	public List<Customer> selectByExample(CustomerExample example){
    	return customerDAO.selectByExample(example);
    }

	public Customer selectByPrimaryKey(Integer id){
    	return customerDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Customer record, CustomerExample example){
    	return customerDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Customer record, CustomerExample example){
    	return customerDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Customer record){
    	return customerDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Customer record){
    	return customerDAO.updateByPrimaryKey(record);
    }


}
