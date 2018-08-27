package com.chenyuantech.eps.bean;

import java.io.Serializable;

public class WXBSIZEKey implements Serializable {
    private String WXB05;

    private String TC_RVBS01;

    private Integer TC_RVBS02;

    private String TC_RVBS03;

    private static final long serialVersionUID = 1L;

    public String getWXB05() {
        return WXB05;
    }

    public void setWXB05(String WXB05) {
        this.WXB05 = WXB05 == null ? null : WXB05.trim();
    }

    public String getTC_RVBS01() {
        return TC_RVBS01;
    }

    public void setTC_RVBS01(String TC_RVBS01) {
        this.TC_RVBS01 = TC_RVBS01 == null ? null : TC_RVBS01.trim();
    }

    public Integer getTC_RVBS02() {
        return TC_RVBS02;
    }

    public void setTC_RVBS02(Integer TC_RVBS02) {
        this.TC_RVBS02 = TC_RVBS02;
    }

    public String getTC_RVBS03() {
        return TC_RVBS03;
    }

    public void setTC_RVBS03(String TC_RVBS03) {
        this.TC_RVBS03 = TC_RVBS03 == null ? null : TC_RVBS03.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", WXB05=").append(WXB05);
        sb.append(", TC_RVBS01=").append(TC_RVBS01);
        sb.append(", TC_RVBS02=").append(TC_RVBS02);
        sb.append(", TC_RVBS03=").append(TC_RVBS03);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}