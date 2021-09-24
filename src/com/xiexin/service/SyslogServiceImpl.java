package com.xiexin.service;

import com.xiexin.bean.Syslog;
import com.xiexin.bean.SyslogExample;
import com.xiexin.dao.SyslogDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("syslogService")
public class SyslogServiceImpl implements SyslogService {
	@Autowired(required = false)
	private SyslogDAO syslogDAO;
	public long countByExample(SyslogExample example){
    	return syslogDAO.countByExample(example);
    }

	public int deleteByExample(SyslogExample example){
    	return syslogDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return syslogDAO.deleteByPrimaryKey(id);
    }

	public int insert(Syslog record){
    	return syslogDAO.insert(record);
    }

	public int insertSelective(Syslog record){
    	return syslogDAO.insertSelective(record);
    }

	public List<Syslog> selectByExample(SyslogExample example){
    	return syslogDAO.selectByExample(example);
    }

	public Syslog selectByPrimaryKey(Integer id){
    	return syslogDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Syslog record, SyslogExample example){
    	return syslogDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Syslog record, SyslogExample example){
    	return syslogDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Syslog record){
    	return syslogDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Syslog record){
    	return syslogDAO.updateByPrimaryKey(record);
    }


}
