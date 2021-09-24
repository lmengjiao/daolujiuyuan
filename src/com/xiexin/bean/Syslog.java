package com.xiexin.bean;

import java.io.Serializable;

/**
 * syslog
 * @author 
 */
public class Syslog implements Serializable {
    private Integer id;

    /**
     * 用户名
     */
    private String userid;

    /**
     * 模块
     */
    private String module;

    /**
     * 方法
     */
    private String method;

    /**
     * 执行时间
     */
    private String responseDate;

    /**
     * IP地址
     */
    private String ip;

    /**
     * 访问时间
     */
    private String dates;

    /**
     * 提交结果
     */
    private String commit;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(String responseDate) {
        this.responseDate = responseDate;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }
}