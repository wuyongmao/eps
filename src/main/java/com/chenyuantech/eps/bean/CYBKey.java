package com.chenyuantech.eps.bean;

import java.io.Serializable;

public class CYBKey implements Serializable {
    private String CYB01;

    private Integer CYB02;

    private static final long serialVersionUID = 1L;

    public String getCYB01() {
        return CYB01;
    }

    public void setCYB01(String CYB01) {
        this.CYB01 = CYB01 == null ? null : CYB01.trim();
    }

    public Integer getCYB02() {
        return CYB02;
    }

    public void setCYB02(Integer CYB02) {
        this.CYB02 = CYB02;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", CYB01=").append(CYB01);
        sb.append(", CYB02=").append(CYB02);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}