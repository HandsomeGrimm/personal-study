package grimm.study.mapper;

import grimm.study.model.QrtzFiredTriggers;
import grimm.study.model.QrtzFiredTriggersKey;

public interface QrtzFiredTriggersMapper {
    int deleteByPrimaryKey(QrtzFiredTriggersKey key);

    int insert(QrtzFiredTriggers record);

    int insertSelective(QrtzFiredTriggers record);

    QrtzFiredTriggers selectByPrimaryKey(QrtzFiredTriggersKey key);

    int updateByPrimaryKeySelective(QrtzFiredTriggers record);

    int updateByPrimaryKey(QrtzFiredTriggers record);
}