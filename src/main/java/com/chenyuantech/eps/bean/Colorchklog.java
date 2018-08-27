package com.chenyuantech.eps.bean;

import java.io.Serializable;

public class Colorchklog implements Serializable {
    private String chkid;

    private String pmn01;

    private Integer pmn02;

    private Long seq;

    private String rdresult;

    private String qcresult;

    private String memo;

    private String attr;

    private String chktime;

    private String accid;

    private String name;

    private static final long serialVersionUID = 1L;

    public String getChkid() {
        return chkid;
    }

    public void setChkid(String chkid) {
        this.chkid = chkid == null ? null : chkid.trim();
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

    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    public String getRdresult() {
        return rdresult;
    }

    public void setRdresult(String rdresult) {
        this.rdresult = rdresult == null ? null : rdresult.trim();
    }

    public String getQcresult() {
        return qcresult;
    }

    public void setQcresult(String qcresult) {
        this.qcresult = qcresult == null ? null : qcresult.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr == null ? null : attr.trim();
    }

    public String getChktime() {
        return chktime;
    }

    public void setChktime(String chktime) {
        this.chktime = chktime == null ? null : chktime.trim();
    }

    public String getAccid() {
        return accid;
    }

    public void setAccid(String accid) {
        this.accid = accid == null ? null : accid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chkid=").append(chkid);
        sb.append(", pmn01=").append(pmn01);
        sb.append(", pmn02=").append(pmn02);
        sb.append(", seq=").append(seq);
        sb.append(", rdresult=").append(rdresult);
        sb.append(", qcresult=").append(qcresult);
        sb.append(", memo=").append(memo);
        sb.append(", attr=").append(attr);
        sb.append(", chktime=").append(chktime);
        sb.append(", accid=").append(accid);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}