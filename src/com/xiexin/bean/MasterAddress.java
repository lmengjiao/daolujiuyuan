package com.xiexin.bean;

import java.io.Serializable;

/**
 * master_address
 * @author 
 */
public class MasterAddress implements Serializable {
    /**
     * 地址主键
     */
    private Integer id;

    /**
     * 纬度
     */
    private String lng;

    /**
     * 经度
     */
    private String lat;

    /**
     * 技师外键
     */
    private String mid;

    /**
     * 状态：0在忙，1空闲，2请假
     */
    private String status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}