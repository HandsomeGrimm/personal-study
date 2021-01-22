package grimm.study.mapper;

import grimm.study.model.QrtzBlobTriggers;
import grimm.study.model.QrtzBlobTriggersKey;

public interface QrtzBlobTriggersMapper {
    int deleteByPrimaryKey(QrtzBlobTriggersKey key);

    int insert(QrtzBlobTriggers record);

    int insertSelective(QrtzBlobTriggers record);

    QrtzBlobTriggers selectByPrimaryKey(QrtzBlobTriggersKey key);

    int updateByPrimaryKeySelective(QrtzBlobTriggers record);

    int updateByPrimaryKeyWithBLOBs(QrtzBlobTriggers record);
}