package com.grooveguang.bean;

import java.util.Date;

public class MallProductSkuInfo {
    private Integer shpYs;

    private Integer shpBb;

    private Integer skuId;

    private String shpMsh;

    private String shpLb;

    private Integer ppId;

    private String shpzZhl;

    private String shpChc;

    private Date chjshj;

    public Integer getShpYs() {
        return shpYs;
    }

    public void setShpYs(Integer shpYs) {
        this.shpYs = shpYs;
    }

    public Integer getShpBb() {
        return shpBb;
    }

    public void setShpBb(Integer shpBb) {
        this.shpBb = shpBb;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getShpMsh() {
        return shpMsh;
    }

    public void setShpMsh(String shpMsh) {
        this.shpMsh = shpMsh == null ? null : shpMsh.trim();
    }

    public String getShpLb() {
        return shpLb;
    }

    public void setShpLb(String shpLb) {
        this.shpLb = shpLb == null ? null : shpLb.trim();
    }

    public Integer getPpId() {
        return ppId;
    }

    public void setPpId(Integer ppId) {
        this.ppId = ppId;
    }

    public String getShpzZhl() {
        return shpzZhl;
    }

    public void setShpzZhl(String shpzZhl) {
        this.shpzZhl = shpzZhl == null ? null : shpzZhl.trim();
    }

    public String getShpChc() {
        return shpChc;
    }

    public void setShpChc(String shpChc) {
        this.shpChc = shpChc == null ? null : shpChc.trim();
    }

    public Date getChjshj() {
        return chjshj;
    }

    public void setChjshj(Date chjshj) {
        this.chjshj = chjshj;
    }
}