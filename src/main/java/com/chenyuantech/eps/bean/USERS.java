package com.chenyuantech.eps.bean;

import java.io.Serializable;

public class USERS implements Serializable {
    private String ACCID;

    private String NAME;

    private String PWD;

    private String PMMUD02;

    private String QQ;

    private String EMAIL;

    private String WECHAT;

    private String TEL;

    private String HP;

    private String ACC;

    private String DEPT;

    private String ORG;

    private String CHGTIME;

    private String STATUS;

    private String ROLE;

    private static final long serialVersionUID = 1L;

    public String getACCID() {
        return ACCID;
    }

    public void setACCID(String ACCID) {
        this.ACCID = ACCID == null ? null : ACCID.trim();
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getPWD() {
        return PWD;
    }

    public void setPWD(String PWD) {
        this.PWD = PWD == null ? null : PWD.trim();
    }

    public String getPMMUD02() {
        return PMMUD02;
    }

    public void setPMMUD02(String PMMUD02) {
        this.PMMUD02 = PMMUD02 == null ? null : PMMUD02.trim();
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ == null ? null : QQ.trim();
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL == null ? null : EMAIL.trim();
    }

    public String getWECHAT() {
        return WECHAT;
    }

    public void setWECHAT(String WECHAT) {
        this.WECHAT = WECHAT == null ? null : WECHAT.trim();
    }

    public String getTEL() {
        return TEL;
    }

    public void setTEL(String TEL) {
        this.TEL = TEL == null ? null : TEL.trim();
    }

    public String getHP() {
        return HP;
    }

    public void setHP(String HP) {
        this.HP = HP == null ? null : HP.trim();
    }

    public String getACC() {
        return ACC;
    }

    public void setACC(String ACC) {
        this.ACC = ACC == null ? null : ACC.trim();
    }

    public String getDEPT() {
        return DEPT;
    }

    public void setDEPT(String DEPT) {
        this.DEPT = DEPT == null ? null : DEPT.trim();
    }

    public String getORG() {
        return ORG;
    }

    public void setORG(String ORG) {
        this.ORG = ORG == null ? null : ORG.trim();
    }

    public String getCHGTIME() {
        return CHGTIME;
    }

    public void setCHGTIME(String CHGTIME) {
        this.CHGTIME = CHGTIME == null ? null : CHGTIME.trim();
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS == null ? null : STATUS.trim();
    }

    public String getROLE() {
        return ROLE;
    }

    public void setROLE(String ROLE) {
        this.ROLE = ROLE == null ? null : ROLE.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ACCID=").append(ACCID);
        sb.append(", NAME=").append(NAME);
        sb.append(", PWD=").append(PWD);
        sb.append(", PMMUD02=").append(PMMUD02);
        sb.append(", QQ=").append(QQ);
        sb.append(", EMAIL=").append(EMAIL);
        sb.append(", WECHAT=").append(WECHAT);
        sb.append(", TEL=").append(TEL);
        sb.append(", HP=").append(HP);
        sb.append(", ACC=").append(ACC);
        sb.append(", DEPT=").append(DEPT);
        sb.append(", ORG=").append(ORG);
        sb.append(", CHGTIME=").append(CHGTIME);
        sb.append(", STATUS=").append(STATUS);
        sb.append(", ROLE=").append(ROLE);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}