package grimm.study.model;

import java.io.Serializable;

public class QrtzLocksKey implements Serializable {
    private String schedName;

    private String lockName;

    private static final long serialVersionUID = 1L;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName == null ? null : schedName.trim();
    }

    public String getLockName() {
        return lockName;
    }

    public void setLockName(String lockName) {
        this.lockName = lockName == null ? null : lockName.trim();
    }
}