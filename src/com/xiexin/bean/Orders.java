package com.xiexin.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * orders
 * @author 
 */
public class Orders implements Serializable {
    /**
     * 订单主键
     */
    private Integer id;

    /**
     * 下订单手机号
     */
    private String phone;

    /**
     * 接订单技师
     */
    private Integer mid;

    /**
     * 订单纬度
     */
    private String lng;

    /**
     * 订单经度
     */
    private String lat;

    /**
     * 下订单时间
     */
    private Date createtime;

    /**
     * 接单时间
     */
    private Date updtetime;

    /**
     * 完成订单时间
     */
    private Date endtime;

    /**
     * 救援内容
     */
    private String contents;

    /**
     * 状态：0刚下单，1已接单，2已到达正在修，3已完成，4已评价
     */
    private String status;

    /**
     * 救援地址
     */
    private String address;

    /**
     * 附带内容
     */
    private String attached;

    /**
     * 金额
     */
    private String cost;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdtetime() {
        return updtetime;
    }

    public void setUpdtetime(Date updtetime) {
        this.updtetime = updtetime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAttached() {
        return attached;
    }

    public void setAttached(String attached) {
        this.attached = attached;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}