package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CYB extends CYBKey implements Serializable {
    private BigDecimal CYB03;

    private BigDecimal CYB04;

    private Date CYB05;

    private String CYB06;

    private String CYB07;

    private String CYB08;

    private BigDecimal CYB09;

    private static final long serialVersionUID = 1L;

    public BigDecimal getCYB03() {
        return CYB03;
    }

    public void setCYB03(BigDecimal CYB03) {
        this.CYB03 = CYB03;
    }

    public BigDecimal getCYB04() {
        return CYB04;
    }

    public void setCYB04(BigDecimal CYB04) {
        this.CYB04 = CYB04;
    }

    public Date getCYB05() {
        return CYB05;
    }

    public void setCYB05(Date CYB05) {
        this.CYB05 = CYB05;
    }

    public String getCYB06() {
        return CYB06;
    }

    public void setCYB06(String CYB06) {
        this.CYB06 = CYB06 == null ? null : CYB06.trim();
    }

    public String getCYB07() {
        return CYB07;
    }

    public void setCYB07(String CYB07) {
        this.CYB07 = CYB07 == null ? null : CYB07.trim();
    }

    public String getCYB08() {
        return CYB08;
    }

    public void setCYB08(String CYB08) {
        this.CYB08 = CYB08 == null ? null : CYB08.trim();
    }

    public BigDecimal getCYB09() {
        return CYB09;
    }

    public void setCYB09(BigDecimal CYB09) {
        this.CYB09 = CYB09;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", CYB03=").append(CYB03);
        sb.append(", CYB04=").append(CYB04);
        sb.append(", CYB05=").append(CYB05);
        sb.append(", CYB06=").append(CYB06);
        sb.append(", CYB07=").append(CYB07);
        sb.append(", CYB08=").append(CYB08);
        sb.append(", CYB09=").append(CYB09);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}