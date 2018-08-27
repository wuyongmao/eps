package com.chenyuantech.eps.bean;

import java.io.Serializable;

public class Allkind implements Serializable {
    private String uuid;

    private Integer kindid;

    private String kindpid;

    private String kindno;

    private String kindname;

    private String status;

    private String bz;

    private static final long serialVersionUID = 1L;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getKindid() {
        return kindid;
    }

    public void setKindid(Integer kindid) {
        this.kindid = kindid;
    }

    public String getKindpid() {
        return kindpid;
    }

    public void setKindpid(String kindpid) {
        this.kindpid = kindpid == null ? null : kindpid.trim();
    }

    public String getKindno() {
        return kindno;
    }

    public void setKindno(String kindno) {
        this.kindno = kindno == null ? null : kindno.trim();
    }

    public String getKindname() {
        return kindname;
    }

    public void setKindname(String kindname) {
        this.kindname = kindname == null ? null : kindname.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }
}