package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Rvb implements Serializable {
    private String rvb01;

    private Integer rvb02;

    private Integer rvb03;

    private String rvb04;

    private BigDecimal rvb07;

    private BigDecimal pmn20;

    private BigDecimal rvb29;

    private BigDecimal pmn5055;

    private String rvb38;

    private BigDecimal rvb30;

    private Integer jindu;

    private String rvb36;

    private String flag;

    private String rvb39;

    private BigDecimal rvv17;

    private static final long serialVersionUID = 1L;

    public String getRvb01() {
        return rvb01;
    }

    public void setRvb01(String rvb01) {
        this.rvb01 = rvb01 == null ? null : rvb01.trim();
    }

    public Integer getRvb02() {
        return rvb02;
    }

    public void setRvb02(Integer rvb02) {
        this.rvb02 = rvb02;
    }

    public Integer getRvb03() {
        return rvb03;
    }

    public void setRvb03(Integer rvb03) {
        this.rvb03 = rvb03;
    }

    public String getRvb04() {
        return rvb04;
    }

    public void setRvb04(String rvb04) {
        this.rvb04 = rvb04 == null ? null : rvb04.trim();
    }

    public BigDecimal getRvb07() {
        return rvb07;
    }

    public void setRvb07(BigDecimal rvb07) {
        this.rvb07 = rvb07;
    }

    public BigDecimal getPmn20() {
        return pmn20;
    }

    public void setPmn20(BigDecimal pmn20) {
        this.pmn20 = pmn20;
    }

    public BigDecimal getRvb29() {
        return rvb29;
    }

    public void setRvb29(BigDecimal rvb29) {
        this.rvb29 = rvb29;
    }

    public BigDecimal getPmn5055() {
        return pmn5055;
    }

    public void setPmn5055(BigDecimal pmn5055) {
        this.pmn5055 = pmn5055;
    }

    public String getRvb38() {
        return rvb38;
    }

    public void setRvb38(String rvb38) {
        this.rvb38 = rvb38 == null ? null : rvb38.trim();
    }

    public BigDecimal getRvb30() {
        return rvb30;
    }

    public void setRvb30(BigDecimal rvb30) {
        this.rvb30 = rvb30;
    }

    public Integer getJindu() {
        return jindu;
    }

    public void setJindu(Integer jindu) {
        this.jindu = jindu;
    }

    public String getRvb36() {
        return rvb36;
    }

    public void setRvb36(String rvb36) {
        this.rvb36 = rvb36 == null ? null : rvb36.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getRvb39() {
        return rvb39;
    }

    public void setRvb39(String rvb39) {
        this.rvb39 = rvb39 == null ? null : rvb39.trim();
    }

    public BigDecimal getRvv17() {
        return rvv17;
    }

    public void setRvv17(BigDecimal rvv17) {
        this.rvv17 = rvv17;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rvb01=").append(rvb01);
        sb.append(", rvb02=").append(rvb02);
        sb.append(", rvb03=").append(rvb03);
        sb.append(", rvb04=").append(rvb04);
        sb.append(", rvb07=").append(rvb07);
        sb.append(", pmn20=").append(pmn20);
        sb.append(", rvb29=").append(rvb29);
        sb.append(", pmn5055=").append(pmn5055);
        sb.append(", rvb38=").append(rvb38);
        sb.append(", rvb30=").append(rvb30);
        sb.append(", jindu=").append(jindu);
        sb.append(", rvb36=").append(rvb36);
        sb.append(", flag=").append(flag);
        sb.append(", rvb39=").append(rvb39);
        sb.append(", rvv17=").append(rvv17);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}