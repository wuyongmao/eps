package com.chenyuantech.eps.bean;

import java.io.Serializable;

public class Rights implements Serializable {
    private String rightsid;

    private Long accid;

    private String rightlist;

    private static final long serialVersionUID = 1L;

    public String getRightsid() {
        return rightsid;
    }

    public void setRightsid(String rightsid) {
        this.rightsid = rightsid == null ? null : rightsid.trim();
    }

    public Long getAccid() {
        return accid;
    }

    public void setAccid(Long accid) {
        this.accid = accid;
    }

    public String getRightlist() {
        return rightlist;
    }

    public void setRightlist(String rightlist) {
        this.rightlist = rightlist == null ? null : rightlist.trim();
    }
}