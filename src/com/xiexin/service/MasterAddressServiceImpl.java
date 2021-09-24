package com.xiexin.service;

import com.xiexin.bean.MasterAddress;
import com.xiexin.bean.MasterAddressExample;
import com.xiexin.dao.MasterAddressDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("masterAddressService")
public class MasterAddressServiceImpl implements MasterAddressService {
	@Autowired(required = false)
	private MasterAddressDAO masterAddressDAO;
	public long countByExample(MasterAddressExample example){
    	return masterAddressDAO.countByExample(example);
    }

	public int deleteByExample(MasterAddressExample example){
    	return masterAddressDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return masterAddressDAO.deleteByPrimaryKey(id);
    }

	public int insert(MasterAddress record){
    	return masterAddressDAO.insert(record);
    }

	public int insertSelective(MasterAddress record){
    	return masterAddressDAO.insertSelective(record);
    }

	public List<MasterAddress> selectByExample(MasterAddressExample example){
    	return masterAddressDAO.selectByExample(example);
    }

	public MasterAddress selectByPrimaryKey(Integer id){
    	return masterAddressDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(MasterAddress record, MasterAddressExample example){
    	return masterAddressDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(MasterAddress record, MasterAddressExample example){
    	return masterAddressDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(MasterAddress record){
    	return masterAddressDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(MasterAddress record){
    	return masterAddressDAO.updateByPrimaryKey(record);
    }


}
