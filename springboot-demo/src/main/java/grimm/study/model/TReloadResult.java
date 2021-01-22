package grimm.study.model;

import java.io.Serializable;
import java.util.Date;

public class TReloadResult implements Serializable {
    private String tag;

    private String identification;

    private String args;

    private Byte result;

    private Date createTime;

    private String exception;

    private static final long serialVersionUID = 1L;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification == null ? null : identification.trim();
    }

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args == null ? null : args.trim();
    }

    public Byte getResult() {
        return result;
    }

    public void setResult(Byte result) {
        this.result = result;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception == null ? null : exception.trim();
    }
}