package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class WXBSIZE extends WXBSIZEKey implements Serializable {
    private BigDecimal TC_RVBS16;

    private BigDecimal TC_RVBS17;

    private BigDecimal TC_RVBS04;

    private String TC_RVBS06;

    private static final long serialVersionUID = 1L;

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
        sb.append(", TC_RVBS16=").append(TC_RVBS16);
        sb.append(", TC_RVBS17=").append(TC_RVBS17);
        sb.append(", TC_RVBS04=").append(TC_RVBS04);
        sb.append(", TC_RVBS06=").append(TC_RVBS06);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}