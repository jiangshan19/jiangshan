package com.pojo;

public class Jd {
    private Integer id;

    private String bt;

    private String bz;

    private String url;

    private String jmember;

    private String fmember;

    private String sj;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBt() {
        return bt;
    }

    public void setBt(String bt) {
        this.bt = bt == null ? null : bt.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getJmember() {
        return jmember;
    }

    public void setJmember(String jmember) {
        this.jmember = jmember == null ? null : jmember.trim();
    }

    public String getFmember() {
        return fmember;
    }

    public void setFmember(String fmember) {
        this.fmember = fmember == null ? null : fmember.trim();
    }

    public String getSj() {
        return sj;
    }

    public void setSj(String sj) {
        this.sj = sj == null ? null : sj.trim();
    }
}