package com.chenyuantech.eps.bean;

import java.io.Serializable;

public class Chgreason implements Serializable {
    private String chgid;

    private String reason;

    private String reasondesc;

    private String gs;

    private String status;

    private static final long serialVersionUID = 1L;

    public String getChgid() {
        return chgid;
    }

    public void setChgid(String chgid) {
        this.chgid = chgid == null ? null : chgid.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getReasondesc() {
        return reasondesc;
    }

    public void setReasondesc(String reasondesc) {
        this.reasondesc = reasondesc == null ? null : reasondesc.trim();
    }

    public String getGs() {
        return gs;
    }

    public void setGs(String gs) {
        this.gs = gs == null ? null : gs.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}