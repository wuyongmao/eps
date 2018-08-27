package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class WXBSIZETMP implements Serializable {
    private String WXB05T;

    private String WXB05;

    private String TC_RVBS01;

    private Integer TC_RVBS02;

    private String TC_RVBS03;

    private BigDecimal TC_RVBS16;

    private BigDecimal TC_RVBS17;

    private BigDecimal TC_RVBS04;

    private String TC_RVBS06;

    private static final long serialVersionUID = 1L;

    public String getWXB05T() {
        return WXB05T;
    }

    public void setWXB05T(String WXB05T) {
        this.WXB05T = WXB05T == null ? null : WXB05T.trim();
    }

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

    public BigDecimal getTC_RVBS16() {
        return TC_RVBS16;
    }

    public void setTC_RVBS16(BigDecimal TC_RVBS16) {
        this.TC_RVBS16 = TC_RVBS16;
    }

    public BigDecimal getTC_RVBS17() {
        return TC_RVBS17;
    }

    public void setTC_RVBS17(BigDecimal TC_RVBS17) {
        this.TC_RVBS17 = TC_RVBS17;
    }

    public BigDecimal getTC_RVBS04() {
        return TC_RVBS04;
    }

    public void setTC_RVBS04(BigDecimal TC_RVBS04) {
        this.TC_RVBS04 = TC_RVBS04;
    }

    public String getTC_RVBS06() {
        return TC_RVBS06;
    }

    public void setTC_RVBS06(String TC_RVBS06) {
        this.TC_RVBS06 = TC_RVBS06 == null ? null : TC_RVBS06.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", WXB05T=").append(WXB05T);
        sb.append(", WXB05=").append(WXB05);
        sb.append(", TC_RVBS01=").append(TC_RVBS01);
        sb.append(", TC_RVBS02=").append(TC_RVBS02);
        sb.append(", TC_RVBS03=").append(TC_RVBS03);
        sb.append(", TC_RVBS16=").append(TC_RVBS16);
        sb.append(", TC_RVBS17=").append(TC_RVBS17);
        sb.append(", TC_RVBS04=").append(TC_RVBS04);
        sb.append(", TC_RVBS06=").append(TC_RVBS06);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}