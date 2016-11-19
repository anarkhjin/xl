package com.anan.huotui.po;

public class TbShop {
    private Long sid;

    private String sname;

    private String saccount;

    private String saddress;

    private String sprivince;

    private String scity;

    private String sarea;

    private String linkname;

    private String linktele;

    private String token;

    private String uuid;

    private String logo;

    private String jingdu;

    private String weidu;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSaccount() {
        return saccount;
    }

    public void setSaccount(String saccount) {
        this.saccount = saccount == null ? null : saccount.trim();
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress == null ? null : saddress.trim();
    }

    public String getSprivince() {
        return sprivince;
    }

    public void setSprivince(String sprivince) {
        this.sprivince = sprivince == null ? null : sprivince.trim();
    }

    public String getScity() {
        return scity;
    }

    public void setScity(String scity) {
        this.scity = scity == null ? null : scity.trim();
    }

    public String getSarea() {
        return sarea;
    }

    public void setSarea(String sarea) {
        this.sarea = sarea == null ? null : sarea.trim();
    }

    public String getLinkname() {
        return linkname;
    }

    public void setLinkname(String linkname) {
        this.linkname = linkname == null ? null : linkname.trim();
    }

    public String getLinktele() {
        return linktele;
    }

    public void setLinktele(String linktele) {
        this.linktele = linktele == null ? null : linktele.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getJingdu() {
        return jingdu;
    }

    public void setJingdu(String jingdu) {
        this.jingdu = jingdu == null ? null : jingdu.trim();
    }

    public String getWeidu() {
        return weidu;
    }

    public void setWeidu(String weidu) {
        this.weidu = weidu == null ? null : weidu.trim();
    }
}