package grimm.study.model;

import java.io.Serializable;

public class TUserOperateLogWithBLOBs extends TUserOperateLog implements Serializable {
    private String param;

    private String failReason;

    private static final long serialVersionUID = 1L;

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }
}