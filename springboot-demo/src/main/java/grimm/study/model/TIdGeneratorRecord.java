package grimm.study.model;

import java.io.Serializable;

public class TIdGeneratorRecord extends TIdGeneratorRecordKey implements Serializable {
    private Integer lastNumber;

    private static final long serialVersionUID = 1L;

    public Integer getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(Integer lastNumber) {
        this.lastNumber = lastNumber;
    }
}