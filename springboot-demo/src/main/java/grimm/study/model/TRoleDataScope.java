package grimm.study.model;

import java.io.Serializable;
import java.util.Date;

public class TRoleDataScope implements Serializable {
    private Integer id;

    private Integer dataScopeType;

    private Integer viewType;

    private Integer roleId;

    private Date updateTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDataScopeType() {
        return dataScopeType;
    }

    public void setDataScopeType(Integer dataScopeType) {
        this.dataScopeType = dataScopeType;
    }

    public Integer getViewType() {
        return viewType;
    }

    public void setViewType(Integer viewType) {
        this.viewType = viewType;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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