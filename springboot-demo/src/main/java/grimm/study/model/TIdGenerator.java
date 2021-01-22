package grimm.study.model;

import java.io.Serializable;
import java.util.Date;

public class TIdGenerator implements Serializable {
    private Integer id;

    private String keyName;

    private String ruleFormat;

    private String ruleType;

    private Integer initNumber;

    private Integer lastNumber;

    private String remark;

    private Date updateTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName == null ? null : keyName.trim();
    }

    public String getRuleFormat() {
        return ruleFormat;
    }

    public void setRuleFormat(String ruleFormat) {
        this.ruleFormat = ruleFormat == null ? null : ruleFormat.trim();
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType == null ? null : ruleType.trim();
    }

    public Integer getInitNumber() {
        return initNumber;
    }

    public void setInitNumber(Integer initNumber) {
        this.initNumber = initNumber;
    }

    public Integer getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(Integer lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}