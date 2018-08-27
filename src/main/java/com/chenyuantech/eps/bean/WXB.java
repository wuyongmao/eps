package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WXB implements Serializable {
    private String WXB05;

    private String WXB01;

    private Integer WXB02;

    private String WXB03;

    private String WXB04;

    private String WXB06;

    private String WXB07;

    private BigDecimal WXB08;

    private BigDecimal WXB09;

    private Integer WXB10;

    private Date WXB11;

    private Date WXB12;

    private String WXB13;

    private String WXB14;

    private String WXB15;

    private BigDecimal WXB16;

    private static final long serialVersionUID = 1L;

    public String getWXB05() {
        return WXB05;
    }

    public void setWXB05(String WXB05) {
        this.WXB05 = WXB05 == null ? null : WXB05.trim();
    }

    public String getWXB01() {
        return WXB01;
    }

    public void setWXB01(String WXB01) {
        this.WXB01 = WXB01 == null ? null : WXB01.trim();
    }

    public Integer getWXB02() {
        return WXB02;
    }

    public void setWXB02(Integer WXB02) {
        this.WXB02 = WXB02;
    }

    public String getWXB03() {
        return WXB03;
    }

    public void setWXB03(String WXB03) {
        this.WXB03 = WXB03 == null ? null : WXB03.trim();
    }

    public String getWXB04() {
        return WXB04;
    }

    public void setWXB04(String WXB04) {
        this.WXB04 = WXB04 == null ? null : WXB04.trim();
    }

    public String getWXB06() {
        return WXB06;
    }

    public void setWXB06(String WXB06) {
        this.WXB06 = WXB06 == null ? null : WXB06.trim();
    }

    public String getWXB07() {
        return WXB07;
    }

    public void setWXB07(String WXB07) {
        this.WXB07 = WXB07 == null ? null : WXB07.trim();
    }

    public BigDecimal getWXB08() {
        return WXB08;
    }

    public void setWXB08(BigDecimal WXB08) {
        this.WXB08 = WXB08;
    }

    public BigDecimal getWXB09() {
        return WXB09;
    }

    public void setWXB09(BigDecimal WXB09) {
        this.WXB09 = WXB09;
    }

    public Integer getWXB10() {
        return WXB10;
    }

    public void setWXB10(Integer WXB10) {
        this.WXB10 = WXB10;
    }

    public Date getWXB11() {
        return WXB11;
    }

    public void setWXB11(Date WXB11) {
        this.WXB11 = WXB11;
    }

    public Date getWXB12() {
        return WXB12;
    }

    public void setWXB12(Date WXB12) {
        this.WXB12 = WXB12;
    }

    public String getWXB13() {
        return WXB13;
    }

    public void setWXB13(String WXB13) {
        this.WXB13 = WXB13 == null ? null : WXB13.trim();
    }

    public String getWXB14() {
        return WXB14;
    }

    public void setWXB14(String WXB14) {
        this.WXB14 = WXB14 == null ? null : WXB14.trim();
    }

    public String getWXB15() {
        return WXB15;
    }

    public void setWXB15(String WXB15) {
        this.WXB15 = WXB15 == null ? null : WXB15.trim();
    }

    public BigDecimal getWXB16() {
        return WXB16;
    }

    public void setWXB16(BigDecimal WXB16) {
        this.WXB16 = WXB16;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", WXB05=").append(WXB05);
        sb.append(", WXB01=").append(WXB01);
        sb.append(", WXB02=").append(WXB02);
        sb.append(", WXB03=").append(WXB03);
        sb.append(", WXB04=").append(WXB04);
        sb.append(", WXB06=").append(WXB06);
        sb.append(", WXB07=").append(WXB07);
        sb.append(", WXB08=").append(WXB08);
        sb.append(", WXB09=").append(WXB09);
        sb.append(", WXB10=").append(WXB10);
        sb.append(", WXB11=").append(WXB11);
        sb.append(", WXB12=").append(WXB12);
        sb.append(", WXB13=").append(WXB13);
        sb.append(", WXB14=").append(WXB14);
        sb.append(", WXB15=").append(WXB15);
        sb.append(", WXB16=").append(WXB16);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}