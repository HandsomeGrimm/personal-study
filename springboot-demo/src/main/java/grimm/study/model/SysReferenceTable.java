package grimm.study.model;

import java.io.Serializable;
import java.util.Date;

public class SysReferenceTable implements Serializable {
    private Integer id;

    private String referenceTypeName;

    private Byte referenceTypeId;

    private String referenceName;

    private String referenceCode;

    private String referenceValue;

    private String remark;

    private Integer orderSeq;

    private Integer deleteFlag;

    private Integer lastCommitUserid;

    private Date lastCommitTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReferenceTypeName() {
        return referenceTypeName;
    }

    public void setReferenceTypeName(String referenceTypeName) {
        this.referenceTypeName = referenceTypeName == null ? null : referenceTypeName.trim();
    }

    public Byte getReferenceTypeId() {
        return referenceTypeId;
    }

    public void setReferenceTypeId(Byte referenceTypeId) {
        this.referenceTypeId = referenceTypeId;
    }

    public String getReferenceName() {
        return referenceName;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName == null ? null : referenceName.trim();
    }

    public String getReferenceCode() {
        return referenceCode;
    }

    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode == null ? null : referenceCode.trim();
    }

    public String getReferenceValue() {
        return referenceValue;
    }

    public void setReferenceValue(String referenceValue) {
        this.referenceValue = referenceValue == null ? null : referenceValue.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getOrderSeq() {
        return orderSeq;
    }

    public void setOrderSeq(Integer orderSeq) {
        this.orderSeq = orderSeq;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getLastCommitUserid() {
        return lastCommitUserid;
    }

    public void setLastCommitUserid(Integer lastCommitUserid) {
        this.lastCommitUserid = lastCommitUserid;
    }

    public Date getLastCommitTime() {
        return lastCommitTime;
    }

    public void setLastCommitTime(Date lastCommitTime) {
        this.lastCommitTime = lastCommitTime;
    }
}