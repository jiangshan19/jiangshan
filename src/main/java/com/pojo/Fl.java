package com.pojo;

/**
 * 分类实体类
 */
public class Fl {
    private Integer id;

    private String mc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc == null ? null : mc.trim();
    }
}