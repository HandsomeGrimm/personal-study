package grimm.study.model;

import java.io.Serializable;
import java.util.Date;

public class TRolePrivilege implements Serializable {
    private Integer id;

    private Integer roleId;

    private String privilegeKey;

    private Date updateTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getPrivilegeKey() {
        return privilegeKey;
    }

    public void setPrivilegeKey(String privilegeKey) {
        this.privilegeKey = privilegeKey == null ? null : privilegeKey.trim();
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