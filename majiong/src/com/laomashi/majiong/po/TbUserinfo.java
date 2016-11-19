package com.laomashi.majiong.po;

import java.util.Date;

public class TbUserinfo {
    private Long uinfoid;

    private Long uid;

    private Short sex;

    private Date birthday;

    private String telephone;

    private String qq;

    private String realname;

    private String address;

    private String sysrole;

    private String status;

    public Long getUinfoid() {
        return uinfoid;
    }

    public void setUinfoid(Long uinfoid) {
        this.uinfoid = uinfoid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getSysrole() {
        return sysrole;
    }

    public void setSysrole(String sysrole) {
        this.sysrole = sysrole == null ? null : sysrole.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}