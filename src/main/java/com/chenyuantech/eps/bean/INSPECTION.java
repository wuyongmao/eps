package com.chenyuantech.eps.bean;

import java.io.Serializable;

public class INSPECTION implements Serializable {
    private String REGULATIONID;

    private String DELLOTMIN;

    private String DELLOTMAX;

    private String SAMPLES;

    private String AC;

    private String RE;

    private String INPUTTER;

    private String INPUTDATE;

    private String CONFIRM;

    private static final long serialVersionUID = 1L;

    public String getREGULATIONID() {
        return REGULATIONID;
    }

    public void setREGULATIONID(String REGULATIONID) {
        this.REGULATIONID = REGULATIONID == null ? null : REGULATIONID.trim();
    }

    public String getDELLOTMIN() {
        return DELLOTMIN;
    }

    public void setDELLOTMIN(String DELLOTMIN) {
        this.DELLOTMIN = DELLOTMIN == null ? null : DELLOTMIN.trim();
    }

    public String getDELLOTMAX() {
        return DELLOTMAX;
    }

    public void setDELLOTMAX(String DELLOTMAX) {
        this.DELLOTMAX = DELLOTMAX == null ? null : DELLOTMAX.trim();
    }

    public String getSAMPLES() {
        return SAMPLES;
    }

    public void setSAMPLES(String SAMPLES) {
        this.SAMPLES = SAMPLES == null ? null : SAMPLES.trim();
    }

    public String getAC() {
        return AC;
    }

    public void setAC(String AC) {
        this.AC = AC == null ? null : AC.trim();
    }

    public String getRE() {
        return RE;
    }

    public void setRE(String RE) {
        this.RE = RE == null ? null : RE.trim();
    }

    public String getINPUTTER() {
        return INPUTTER;
    }

    public void setINPUTTER(String INPUTTER) {
        this.INPUTTER = INPUTTER == null ? null : INPUTTER.trim();
    }

    public String getINPUTDATE() {
        return INPUTDATE;
    }

    public void setINPUTDATE(String INPUTDATE) {
        this.INPUTDATE = INPUTDATE == null ? null : INPUTDATE.trim();
    }

    public String getCONFIRM() {
        return CONFIRM;
    }

    public void setCONFIRM(String CONFIRM) {
        this.CONFIRM = CONFIRM == null ? null : CONFIRM.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", REGULATIONID=").append(REGULATIONID);
        sb.append(", DELLOTMIN=").append(DELLOTMIN);
        sb.append(", DELLOTMAX=").append(DELLOTMAX);
        sb.append(", SAMPLES=").append(SAMPLES);
        sb.append(", AC=").append(AC);
        sb.append(", RE=").append(RE);
        sb.append(", INPUTTER=").append(INPUTTER);
        sb.append(", INPUTDATE=").append(INPUTDATE);
        sb.append(", CONFIRM=").append(CONFIRM);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}