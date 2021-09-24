package com.xiexin.service;

import com.xiexin.bean.Coupon;
import com.xiexin.bean.CouponExample;
import com.xiexin.dao.CouponDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("couponService")
public class CouponServiceImpl implements CouponService{
	@Autowired(required = false)
	private CouponDAO couponDAO;
	public long countByExample(CouponExample example){
    	return couponDAO.countByExample(example);
    }

	public int deleteByExample(CouponExample example){
    	return couponDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return couponDAO.deleteByPrimaryKey(id);
    }

	public int insert(Coupon record){
    	return couponDAO.insert(record);
    }

	public int insertSelective(Coupon record){
    	return couponDAO.insertSelective(record);
    }

	public List<Coupon> selectByExample(CouponExample example){
    	return couponDAO.selectByExample(example);
    }

	public Coupon selectByPrimaryKey(Integer id){
    	return couponDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Coupon record, CouponExample example){
    	return couponDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Coupon record, CouponExample example){
    	return couponDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Coupon record){
    	return couponDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Coupon record){
    	return couponDAO.updateByPrimaryKey(record);
    }


}
