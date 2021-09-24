package com.xiexin.service;

import com.xiexin.bean.Syslog;
import com.xiexin.bean.SyslogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SyslogService {
   
    long countByExample(SyslogExample example);

    int deleteByExample(SyslogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Syslog record);

    int insertSelective(Syslog record);

    List<Syslog> selectByExample(SyslogExample example);

    Syslog selectByPrimaryKey(Integer id);
  
    int updateByExampleSelective(@Param("record") Syslog record, @Param("example") SyslogExample example);

    int updateByExample(@Param("record") Syslog record, @Param("example") SyslogExample example);

    int updateByPrimaryKeySelective(Syslog record);

    int updateByPrimaryKey(Syslog record);

}
