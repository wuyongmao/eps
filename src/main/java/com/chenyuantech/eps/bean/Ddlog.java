package com.chenyuantech.eps.bean;

import java.io.Serializable;

public class Ddlog implements Serializable {
    private String ddid;

    private String requirementdd;

    private String replydd;

    private String status;

    @Override
	public String toString() {
		return "Ddlog [ddid=" + ddid + ", requirementdd=" + requirementdd + ", replydd=" + replydd + ", status="
				+ status + ", accid=" + accid + ", launchtime=" + launchtime + ", chgid=" + chgid + ", memo=" + memo
				+ ", pmn01=" + pmn01 + ", pmn02=" + pmn02 + "]";
	}

	private String accid;

    private String launchtime;

    private String chgid;

    private String memo;

    private String pmn01;

    private Integer pmn02;

    private static final long serialVersionUID = 1L;

    public String getDdid() {
        return ddid;
    }

    public void setDdid(String ddid) {
        this.ddid = ddid == null ? null : ddid.trim();
    }

    public String getRequirementdd() {
        return requirementdd;
    }

    public void setRequirementdd(String requirementdd) {
        this.requirementdd = requirementdd == null ? null : requirementdd.trim();
    }

    public String getReplydd() {
        return replydd;
    }

    public void setReplydd(String replydd) {
        this.replydd = replydd == null ? null : replydd.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAccid() {
        return accid;
    }

    public void setAccid(String accid) {
        this.accid = accid == null ? null : accid.trim();
    }

    public String getLaunchtime() {
        return launchtime;
    }

    public void setLaunchtime(String launchtime) {
        this.launchtime = launchtime == null ? null : launchtime.trim();
    }

    public String getChgid() {
        return chgid;
    }

    public void setChgid(String chgid) {
        this.chgid = chgid == null ? null : chgid.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getPmn01() {
        return pmn01;
    }

    public void setPmn01(String pmn01) {
        this.pmn01 = pmn01 == null ? null : pmn01.trim();
    }

    public Integer getPmn02() {
        return pmn02;
    }

    public void setPmn02(Integer pmn02) {
        this.pmn02 = pmn02;
    }
}