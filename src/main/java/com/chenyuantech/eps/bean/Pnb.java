package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Pnb implements Serializable {
    private String pnb01;

    private Integer pnb02;

    private Integer pnb03;

    private BigDecimal pnb20b;

    private BigDecimal pnb20a;

    private String pnasendd;

    private static final long serialVersionUID = 1L;

    public String getPnb01() {
        return pnb01;
    }

    public void setPnb01(String pnb01) {
        this.pnb01 = pnb01 == null ? null : pnb01.trim();
    }

    public Integer getPnb02() {
        return pnb02;
    }

    public void setPnb02(Integer pnb02) {
        this.pnb02 = pnb02;
    }

    public Integer getPnb03() {
        return pnb03;
    }

    public void setPnb03(Integer pnb03) {
        this.pnb03 = pnb03;
    }

    public BigDecimal getPnb20b() {
        return pnb20b;
    }

    public void setPnb20b(BigDecimal pnb20b) {
        this.pnb20b = pnb20b;
    }

    public BigDecimal getPnb20a() {
        return pnb20a;
    }

    public void setPnb20a(BigDecimal pnb20a) {
        this.pnb20a = pnb20a;
    }

    public String getPnasendd() {
        return pnasendd;
    }

    public void setPnasendd(String pnasendd) {
        this.pnasendd = pnasendd == null ? null : pnasendd.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pnb01=").append(pnb01);
        sb.append(", pnb02=").append(pnb02);
        sb.append(", pnb03=").append(pnb03);
        sb.append(", pnb20b=").append(pnb20b);
        sb.append(", pnb20a=").append(pnb20a);
        sb.append(", pnasendd=").append(pnasendd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}