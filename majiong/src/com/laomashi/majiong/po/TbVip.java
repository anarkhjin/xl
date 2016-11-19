package com.laomashi.majiong.po;

import java.util.Date;

public class TbVip {
    private Long vipid;

    private Date creattime;

    private Date deadtime;

    private String password;

    private String content;

    private String qq;

    private String mobile;

    private Short vtimes;

    private String orderno;

    public Long getVipid() {
        return vipid;
    }

    public void setVipid(Long vipid) {
        this.vipid = vipid;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Date getDeadtime() {
        return deadtime;
    }

    public void setDeadtime(Date deadtime) {
        this.deadtime = deadtime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Short getVtimes() {
        return vtimes;
    }

    public void setVtimes(Short vtimes) {
        this.vtimes = vtimes;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }
}