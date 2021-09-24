package com.xiexin.service;

import com.xiexin.bean.Master;
import com.xiexin.bean.MasterExample;
import com.xiexin.dao.MasterDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("masterService")
public class MasterServiceImpl implements MasterService{
	@Autowired(required = false)
	private MasterDAO masterDAO;
	public long countByExample(MasterExample example){
    	return masterDAO.countByExample(example);
    }

	public int deleteByExample(MasterExample example){
    	return masterDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return masterDAO.deleteByPrimaryKey(id);
    }

	public int insert(Master record){
    	return masterDAO.insert(record);
    }

	public int insertSelective(Master record){
    	return masterDAO.insertSelective(record);
    }

	public List<Master> selectByExample(MasterExample example){
    	return masterDAO.selectByExample(example);
    }

	public Master selectByPrimaryKey(Integer id){
    	return masterDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Master record, MasterExample example){
    	return masterDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Master record, MasterExample example){
    	return masterDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Master record){
    	return masterDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Master record){
    	return masterDAO.updateByPrimaryKey(record);
    }


}
