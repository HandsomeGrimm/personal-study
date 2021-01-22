package grimm.study.model;

import java.io.Serializable;
import java.util.Date;

public class THeartBeatRecord implements Serializable {
    private Integer id;

    private String projectPath;

    private String serverIp;

    private Integer processNo;

    private Date processStartTime;

    private Date heartBeatTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectPath() {
        return projectPath;
    }

    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath == null ? null : projectPath.trim();
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp == null ? null : serverIp.trim();
    }

    public Integer getProcessNo() {
        return processNo;
    }

    public void setProcessNo(Integer processNo) {
        this.processNo = processNo;
    }

    public Date getProcessStartTime() {
        return processStartTime;
    }

    public void setProcessStartTime(Date processStartTime) {
        this.processStartTime = processStartTime;
    }

    public Date getHeartBeatTime() {
        return heartBeatTime;
    }

    public void setHeartBeatTime(Date heartBeatTime) {
        this.heartBeatTime = heartBeatTime;
    }
}