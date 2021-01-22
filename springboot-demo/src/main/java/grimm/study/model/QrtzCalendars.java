package grimm.study.model;

import java.io.Serializable;

public class QrtzCalendars extends QrtzCalendarsKey implements Serializable {
    private byte[] calendar;

    private static final long serialVersionUID = 1L;

    public byte[] getCalendar() {
        return calendar;
    }

    public void setCalendar(byte[] calendar) {
        this.calendar = calendar;
    }
}