package com.anan.huotui.po;

public class TbQuan {
    private Long qid;

    private Long uid;

    private Integer price;

    private Byte isuse;

    private Integer lowprice;

    public Long getQid() {
        return qid;
    }

    public void setQid(Long qid) {
        this.qid = qid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Byte getIsuse() {
        return isuse;
    }

    public void setIsuse(Byte isuse) {
        this.isuse = isuse;
    }

    public Integer getLowprice() {
        return lowprice;
    }

    public void setLowprice(Integer lowprice) {
        this.lowprice = lowprice;
    }
}