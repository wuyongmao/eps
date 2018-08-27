package com.chenyuantech.eps.bean;

import java.io.Serializable;
import java.util.Date;

public class IMA implements Serializable {
    private String IMA01;

    private String IMA02;

    private String TA_IMA01;

    private String IMA63;

    private String TC_TQA03;

    private Date IMAUD13;

    private Date IMADATE;

    private static final long serialVersionUID = 1L;

    public String getIMA01() {
        return IMA01;
    }

    public void setIMA01(String IMA01) {
        this.IMA01 = IMA01 == null ? null : IMA01.trim();
    }

    public String getIMA02() {
        return IMA02;
    }

    public void setIMA02(String IMA02) {
        this.IMA02 = IMA02 == null ? null : IMA02.trim();
    }

    public String getTA_IMA01() {
        return TA_IMA01;
    }

    public void setTA_IMA01(String TA_IMA01) {
        this.TA_IMA01 = TA_IMA01 == null ? null : TA_IMA01.trim();
    }

    public String getIMA63() {
        return IMA63;
    }

    public void setIMA63(String IMA63) {
        this.IMA63 = IMA63 == null ? null : IMA63.trim();
    }

    public String getTC_TQA03() {
        return TC_TQA03;
    }

    public void setTC_TQA03(String TC_TQA03) {
        this.TC_TQA03 = TC_TQA03 == null ? null : TC_TQA03.trim();
    }

    public Date getIMAUD13() {
        return IMAUD13;
    }

    public void setIMAUD13(Date IMAUD13) {
        this.IMAUD13 = IMAUD13;
    }

    public Date getIMADATE() {
        return IMADATE;
    }

    public void setIMADATE(Date IMADATE) {
        this.IMADATE = IMADATE;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", IMA01=").append(IMA01);
        sb.append(", IMA02=").append(IMA02);
        sb.append(", TA_IMA01=").append(TA_IMA01);
        sb.append(", IMA63=").append(IMA63);
        sb.append(", TC_TQA03=").append(TC_TQA03);
        sb.append(", IMAUD13=").append(IMAUD13);
        sb.append(", IMADATE=").append(IMADATE);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}