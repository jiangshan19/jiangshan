package com.pojo;

public class Wl {
    private Integer id;

    private String bh;

    private String zt;

    private String sj;

    private String jmember;

    private String fmember;

    private String hf;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh == null ? null : bh.trim();
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt == null ? null : zt.trim();
    }

    public String getSj() {
        return sj;
    }

    public void setSj(String sj) {
        this.sj = sj == null ? null : sj.trim();
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

    public String getHf() {
        return hf;
    }

    public void setHf(String hf) {
        this.hf = hf == null ? null : hf.trim();
    }
}