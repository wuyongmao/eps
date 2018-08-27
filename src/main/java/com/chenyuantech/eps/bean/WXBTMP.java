package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WXBTMP implements Serializable {
    private String WID;

    private String WXB04;

    private String WXB05;

    private String WXB06;

    private BigDecimal WXB08;

    private BigDecimal WXB09;

    private String WXB14;

    private String WXB15;

    private Date WDATE;

    private String WSIZE;

    private String WTR;

    private String WXB05T;

    private Integer WXB10;

    private static final long serialVersionUID = 1L;

    public String getWID() {
        return WID;
    }

    public void setWID(String WID) {
        this.WID = WID == null ? null : WID.trim();
    }

    public String getWXB04() {
        return WXB04;
    }

    public void setWXB04(String WXB04) {
        this.WXB04 = WXB04 == null ? null : WXB04.trim();
    }

    public String getWXB05() {
        return WXB05;
    }

    public void setWXB05(String WXB05) {
        this.WXB05 = WXB05 == null ? null : WXB05.trim();
    }

    public String getWXB06() {
        return WXB06;
    }

    public void setWXB06(String WXB06) {
        this.WXB06 = WXB06 == null ? null : WXB06.trim();
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

    public Date getWDATE() {
        return WDATE;
    }

    public void setWDATE(Date WDATE) {
        this.WDATE = WDATE;
    }

    public String getWSIZE() {
        return WSIZE;
    }

    public void setWSIZE(String WSIZE) {
        this.WSIZE = WSIZE == null ? null : WSIZE.trim();
    }

    public String getWTR() {
        return WTR;
    }

    public void setWTR(String WTR) {
        this.WTR = WTR == null ? null : WTR.trim();
    }

    public String getWXB05T() {
        return WXB05T;
    }

    public void setWXB05T(String WXB05T) {
        this.WXB05T = WXB05T == null ? null : WXB05T.trim();
    }

    public Integer getWXB10() {
        return WXB10;
    }

    public void setWXB10(Integer WXB10) {
        this.WXB10 = WXB10;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", WID=").append(WID);
        sb.append(", WXB04=").append(WXB04);
        sb.append(", WXB05=").append(WXB05);
        sb.append(", WXB06=").append(WXB06);
        sb.append(", WXB08=").append(WXB08);
        sb.append(", WXB09=").append(WXB09);
        sb.append(", WXB14=").append(WXB14);
        sb.append(", WXB15=").append(WXB15);
        sb.append(", WDATE=").append(WDATE);
        sb.append(", WSIZE=").append(WSIZE);
        sb.append(", WTR=").append(WTR);
        sb.append(", WXB05T=").append(WXB05T);
        sb.append(", WXB10=").append(WXB10);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}