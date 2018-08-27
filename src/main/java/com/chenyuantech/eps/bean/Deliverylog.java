package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Deliverylog implements Serializable {
    private String delid;

    private String dlvid;

    private String accid;

    private String dlvdate;

    private Integer pmn02;

    private String pmn01;

    @Override
	public String toString() {
		return "Deliverylog [delid=" + delid + ", dlvid=" + dlvid + ", accid=" + accid + ", dlvdate=" + dlvdate
				+ ", pmn02=" + pmn02 + ", pmn01=" + pmn01 + ", num=" + num + ", yshl=" + yshl + ", wshl=" + wshl + "]";
	}

	private BigDecimal num;

    private BigDecimal yshl;

    private BigDecimal wshl;

    private static final long serialVersionUID = 1L;

    public String getDelid() {
        return delid;
    }

    public void setDelid(String delid) {
        this.delid = delid == null ? null : delid.trim();
    }

    public String getDlvid() {
        return dlvid;
    }

    public void setDlvid(String dlvid) {
        this.dlvid = dlvid == null ? null : dlvid.trim();
    }

    public String getAccid() {
        return accid;
    }

    public void setAccid(String accid) {
        this.accid = accid == null ? null : accid.trim();
    }

    public String getDlvdate() {
        return dlvdate;
    }

    public void setDlvdate(String dlvdate) {
        this.dlvdate = dlvdate == null ? null : dlvdate.trim();
    }

    public Integer getPmn02() {
        return pmn02;
    }

    public void setPmn02(Integer pmn02) {
        this.pmn02 = pmn02;
    }

    public String getPmn01() {
        return pmn01;
    }

    public void setPmn01(String pmn01) {
        this.pmn01 = pmn01 == null ? null : pmn01.trim();
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public BigDecimal getYshl() {
        return yshl;
    }

    public void setYshl(BigDecimal yshl) {
        this.yshl = yshl;
    }

    public BigDecimal getWshl() {
        return wshl;
    }

    public void setWshl(BigDecimal wshl) {
        this.wshl = wshl;
    }
}