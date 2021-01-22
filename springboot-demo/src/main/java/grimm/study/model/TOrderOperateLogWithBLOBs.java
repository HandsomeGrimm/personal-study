package grimm.study.model;

import java.io.Serializable;

public class TOrderOperateLogWithBLOBs extends TOrderOperateLog implements Serializable {
    private String operateContent;

    private String operateRemark;

    private String extData;

    private static final long serialVersionUID = 1L;

    public String getOperateContent() {
        return operateContent;
    }

    public void setOperateContent(String operateContent) {
        this.operateContent = operateContent == null ? null : operateContent.trim();
    }

    public String getOperateRemark() {
        return operateRemark;
    }

    public void setOperateRemark(String operateRemark) {
        this.operateRemark = operateRemark == null ? null : operateRemark.trim();
    }

    public String getExtData() {
        return extData;
    }

    public void setExtData(String extData) {
        this.extData = extData == null ? null : extData.trim();
    }
}