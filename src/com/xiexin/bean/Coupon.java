package com.xiexin.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * coupon
 * @author 
 */
public class Coupon implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 优惠券名称
     */
    private String name;

    /**
     * 开始时间
     */
    private Date begin;

    /**
     * 结束时间
     */
    private Date end;

    /**
     * 打折百分比 例如：90就是打9折
     */
    private String discount;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否已经删除
     */
    private String del;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }
}