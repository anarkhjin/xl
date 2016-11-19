package com.anan.huotui.po;

public class TbOrder {
    private Long oid;

    private Long uid;

    private Integer state;

    private Integer yunfei;

    private Integer priceindeed;

    private Integer priceall;

    private String privince;

    private String city;

    private String area;

    private String address;

    private String linkman;

    private String linktel;

    private Integer youhui;

    private Boolean huoyun;

    private Long qid;

    private String goodslist;

    private String tips;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getYunfei() {
        return yunfei;
    }

    public void setYunfei(Integer yunfei) {
        this.yunfei = yunfei;
    }

    public Integer getPriceindeed() {
        return priceindeed;
    }

    public void setPriceindeed(Integer priceindeed) {
        this.priceindeed = priceindeed;
    }

    public Integer getPriceall() {
        return priceall;
    }

    public void setPriceall(Integer priceall) {
        this.priceall = priceall;
    }

    public String getPrivince() {
        return privince;
    }

    public void setPrivince(String privince) {
        this.privince = privince == null ? null : privince.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getLinktel() {
        return linktel;
    }

    public void setLinktel(String linktel) {
        this.linktel = linktel == null ? null : linktel.trim();
    }

    public Integer getYouhui() {
        return youhui;
    }

    public void setYouhui(Integer youhui) {
        this.youhui = youhui;
    }

    public Boolean getHuoyun() {
        return huoyun;
    }

    public void setHuoyun(Boolean huoyun) {
        this.huoyun = huoyun;
    }

    public Long getQid() {
        return qid;
    }

    public void setQid(Long qid) {
        this.qid = qid;
    }

    public String getGoodslist() {
        return goodslist;
    }

    public void setGoodslist(String goodslist) {
        this.goodslist = goodslist == null ? null : goodslist.trim();
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips == null ? null : tips.trim();
    }
}