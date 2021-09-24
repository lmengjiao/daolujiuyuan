package com.xiexin.service;

import com.xiexin.bean.MasterAddress;
import com.xiexin.bean.MasterAddressExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MasterAddressService {
   
    long countByExample(MasterAddressExample example);

    int deleteByExample(MasterAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MasterAddress record);

    int insertSelective(MasterAddress record);

    List<MasterAddress> selectByExample(MasterAddressExample example);

    MasterAddress selectByPrimaryKey(Integer id);
  
    int updateByExampleSelective(@Param("record") MasterAddress record, @Param("example") MasterAddressExample example);

    int updateByExample(@Param("record") MasterAddress record, @Param("example") MasterAddressExample example);

    int updateByPrimaryKeySelective(MasterAddress record);

    int updateByPrimaryKey(MasterAddress record);

}
