package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SHD implements Serializable {
    private String SHD01;

    private String SHD02;

    private String SHD03;

    private String SHD04;

    private Date SHD05;

    private BigDecimal SHD06;

    private String SHD07;

    private String SHD08;

    private String SHD09;

    private static final long serialVersionUID = 1L;

    public String getSHD01() {
        return SHD01;
    }

    public void setSHD01(String SHD01) {
        this.SHD01 = SHD01 == null ? null : SHD01.trim();
    }

    public String getSHD02() {
        return SHD02;
    }

    public void setSHD02(String SHD02) {
        this.SHD02 = SHD02 == null ? null : SHD02.trim();
    }

    public String getSHD03() {
        return SHD03;
    }

    public void setSHD03(String SHD03) {
        this.SHD03 = SHD03 == null ? null : SHD03.trim();
    }

    public String getSHD04() {
        return SHD04;
    }

    public void setSHD04(String SHD04) {
        this.SHD04 = SHD04 == null ? null : SHD04.trim();
    }

    public Date getSHD05() {
        return SHD05;
    }

    public void setSHD05(Date SHD05) {
        this.SHD05 = SHD05;
    }

    public BigDecimal getSHD06() {
        return SHD06;
    }

    public void setSHD06(BigDecimal SHD06) {
        this.SHD06 = SHD06;
    }

    public String getSHD07() {
        return SHD07;
    }

    public void setSHD07(String SHD07) {
        this.SHD07 = SHD07 == null ? null : SHD07.trim();
    }

    public String getSHD08() {
        return SHD08;
    }

    public void setSHD08(String SHD08) {
        this.SHD08 = SHD08 == null ? null : SHD08.trim();
    }

    public String getSHD09() {
        return SHD09;
    }

    public void setSHD09(String SHD09) {
        this.SHD09 = SHD09 == null ? null : SHD09.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", SHD01=").append(SHD01);
        sb.append(", SHD02=").append(SHD02);
        sb.append(", SHD03=").append(SHD03);
        sb.append(", SHD04=").append(SHD04);
        sb.append(", SHD05=").append(SHD05);
        sb.append(", SHD06=").append(SHD06);
        sb.append(", SHD07=").append(SHD07);
        sb.append(", SHD08=").append(SHD08);
        sb.append(", SHD09=").append(SHD09);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}