package com.xiexin.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * customer_coupon
 * @author 
 */
public class CustomerCoupon implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 客户外键
     */
    private Integer customerId;

    /**
     * 优惠券外键
     */
    private Integer couponId;

    /**
     * 新增时间
     */
    private Date addtime;

    /**
     * 状态：0 未使用， 1已使用
     */
    private String status;

    /**
     * 删除：0 未删除， 1 已删除
     */
    private String del;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }
}