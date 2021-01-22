package grimm.study.model;

import java.io.Serializable;
import java.util.Date;

public class TUserLoginLog implements Serializable {
    private Integer id;

    private Integer userId;

    private String userName;

    private String remoteIp;

    private Integer remotePort;

    private String remoteBrowser;

    private String remoteOs;

    private Byte loginStatus;

    private Date updateTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getRemoteIp() {
        return remoteIp;
    }

    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp == null ? null : remoteIp.trim();
    }

    public Integer getRemotePort() {
        return remotePort;
    }

    public void setRemotePort(Integer remotePort) {
        this.remotePort = remotePort;
    }

    public String getRemoteBrowser() {
        return remoteBrowser;
    }

    public void setRemoteBrowser(String remoteBrowser) {
        this.remoteBrowser = remoteBrowser == null ? null : remoteBrowser.trim();
    }

    public String getRemoteOs() {
        return remoteOs;
    }

    public void setRemoteOs(String remoteOs) {
        this.remoteOs = remoteOs == null ? null : remoteOs.trim();
    }

    public Byte getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Byte loginStatus) {
        this.loginStatus = loginStatus;
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