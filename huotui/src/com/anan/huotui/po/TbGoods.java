package com.anan.huotui.po;

public class TbGoods {
    private Long gid;

    private Long sid;

    private Long cateId;

    private String goodsName;

    private Integer price;

    private Integer trueprice;

    private Integer standar;

    private Integer truestandar;

    private String weight;

    private String uuid;

    private Short state;

    private Short num;

    private Integer yunfei;

    private String yunfeiText;

    private String discrible;

    private String img;
    
    public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Long getCateId() {
        return cateId;
    }

    public void setCateId(Long cateId) {
        this.cateId = cateId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTrueprice() {
        return trueprice;
    }

    public void setTrueprice(Integer trueprice) {
        this.trueprice = trueprice;
    }

    public Integer getStandar() {
        return standar;
    }

    public void setStandar(Integer standar) {
        this.standar = standar;
    }

    public Integer getTruestandar() {
        return truestandar;
    }

    public void setTruestandar(Integer truestandar) {
        this.truestandar = truestandar;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Short getNum() {
        return num;
    }

    public void setNum(Short num) {
        this.num = num;
    }

    public Integer getYunfei() {
        return yunfei;
    }

    public void setYunfei(Integer yunfei) {
        this.yunfei = yunfei;
    }

    public String getYunfeiText() {
        return yunfeiText;
    }

    public void setYunfeiText(String yunfeiText) {
        this.yunfeiText = yunfeiText == null ? null : yunfeiText.trim();
    }

    public String getDiscrible() {
        return discrible;
    }

    public void setDiscrible(String discrible) {
        this.discrible = discrible == null ? null : discrible.trim();
    }
}