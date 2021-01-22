package grimm.study.model;

import java.io.Serializable;

public class QrtzCronTriggers extends QrtzCronTriggersKey implements Serializable {
    private String cronExpression;

    private String timeZoneId;

    private static final long serialVersionUID = 1L;

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression == null ? null : cronExpression.trim();
    }

    public String getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId == null ? null : timeZoneId.trim();
    }
}