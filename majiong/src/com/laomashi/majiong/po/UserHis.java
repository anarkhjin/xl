package com.laomashi.majiong.po;

import java.util.Date;

public class UserHis {
    private Long hisid;

    private Long uid;

    private Short jiesuan;

    private String day;

    private Integer zhanxian;

    private Integer dianji;

    private Integer weidianji;

    private Date creattime;

    public Long getHisid() {
        return hisid;
    }

    public void setHisid(Long hisid) {
        this.hisid = hisid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Short getJiesuan() {
        return jiesuan;
    }

    public void setJiesuan(Short jiesuan) {
        this.jiesuan = jiesuan;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    public Integer getZhanxian() {
        return zhanxian;
    }

    public void setZhanxian(Integer zhanxian) {
        this.zhanxian = zhanxian;
    }

    public Integer getDianji() {
        return dianji;
    }

    public void setDianji(Integer dianji) {
        this.dianji = dianji;
    }

    public Integer getWeidianji() {
        return weidianji;
    }

    public void setWeidianji(Integer weidianji) {
        this.weidianji = weidianji;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }
}