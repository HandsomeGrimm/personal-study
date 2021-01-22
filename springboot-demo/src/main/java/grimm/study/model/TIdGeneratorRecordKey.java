package grimm.study.model;

import java.io.Serializable;

public class TIdGeneratorRecordKey implements Serializable {
    private Integer generatorId;

    private Integer year;

    private Integer month;

    private Integer day;

    private static final long serialVersionUID = 1L;

    public Integer getGeneratorId() {
        return generatorId;
    }

    public void setGeneratorId(Integer generatorId) {
        this.generatorId = generatorId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
}