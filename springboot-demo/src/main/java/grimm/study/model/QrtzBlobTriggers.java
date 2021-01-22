package grimm.study.model;

import java.io.Serializable;

public class QrtzBlobTriggers extends QrtzBlobTriggersKey implements Serializable {
    private byte[] blobData;

    private static final long serialVersionUID = 1L;

    public byte[] getBlobData() {
        return blobData;
    }

    public void setBlobData(byte[] blobData) {
        this.blobData = blobData;
    }
}