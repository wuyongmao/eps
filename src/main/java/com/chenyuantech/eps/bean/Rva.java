package com.chenyuantech.eps.bean;

import java.io.Serializable;

public class Rva implements Serializable {
    private String rva01;

    private String rva02;

    private String rva06;

    private String rva32;

    private String rvaconf;

    private String rvauser;

    private String rvaoriu;

    private String ruamodu;

    private static final long serialVersionUID = 1L;

    public String getRva01() {
        return rva01;
    }

    public void setRva01(String rva01) {
        this.rva01 = rva01 == null ? null : rva01.trim();
    }

    public String getRva02() {
        return rva02;
    }

    public void setRva02(String rva02) {
        this.rva02 = rva02 == null ? null : rva02.trim();
    }

    public String getRva06() {
        return rva06;
    }

    public void setRva06(String rva06) {
        this.rva06 = rva06 == null ? null : rva06.trim();
    }

    public String getRva32() {
        return rva32;
    }

    public void setRva32(String rva32) {
        this.rva32 = rva32 == null ? null : rva32.trim();
    }

    public String getRvaconf() {
        return rvaconf;
    }

    public void setRvaconf(String rvaconf) {
        this.rvaconf = rvaconf == null ? null : rvaconf.trim();
    }

    public String getRvauser() {
        return rvauser;
    }

    public void setRvauser(String rvauser) {
        this.rvauser = rvauser == null ? null : rvauser.trim();
    }

    public String getRvaoriu() {
        return rvaoriu;
    }

    public void setRvaoriu(String rvaoriu) {
        this.rvaoriu = rvaoriu == null ? null : rvaoriu.trim();
    }

    public String getRuamodu() {
        return ruamodu;
    }

    public void setRuamodu(String ruamodu) {
        this.ruamodu = ruamodu == null ? null : ruamodu.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rva01=").append(rva01);
        sb.append(", rva02=").append(rva02);
        sb.append(", rva06=").append(rva06);
        sb.append(", rva32=").append(rva32);
        sb.append(", rvaconf=").append(rvaconf);
        sb.append(", rvauser=").append(rvauser);
        sb.append(", rvaoriu=").append(rvaoriu);
        sb.append(", ruamodu=").append(ruamodu);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}