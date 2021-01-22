package grimm.study.mapper;

import grimm.study.model.QrtzTriggers;
import grimm.study.model.QrtzTriggersKey;

public interface QrtzTriggersMapper {
    int deleteByPrimaryKey(QrtzTriggersKey key);

    int insert(QrtzTriggers record);

    int insertSelective(QrtzTriggers record);

    QrtzTriggers selectByPrimaryKey(QrtzTriggersKey key);

    int updateByPrimaryKeySelective(QrtzTriggers record);

    int updateByPrimaryKeyWithBLOBs(QrtzTriggers record);

    int updateByPrimaryKey(QrtzTriggers record);
}