package grimm.study.model;

import java.io.Serializable;
import java.util.Date;

public class TQuartzTaskLog implements Serializable {
    private Integer id;

    private Integer taskId;

    private String taskName;

    private String taskParams;

    private Byte processStatus;

    private Long processDuration;

    private String ipAddress;

    private Date updateTime;

    private Date createTime;

    private String processLog;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public String getTaskParams() {
        return taskParams;
    }

    public void setTaskParams(String taskParams) {
        this.taskParams = taskParams == null ? null : taskParams.trim();
    }

    public Byte getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(Byte processStatus) {
        this.processStatus = processStatus;
    }

    public Long getProcessDuration() {
        return processDuration;
    }

    public void setProcessDuration(Long processDuration) {
        this.processDuration = processDuration;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
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

    public String getProcessLog() {
        return processLog;
    }

    public void setProcessLog(String processLog) {
        this.processLog = processLog == null ? null : processLog.trim();
    }
}