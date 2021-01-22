package grimm.study.mapper;

import grimm.study.model.QrtzSimpleTriggers;
import grimm.study.model.QrtzSimpleTriggersKey;

public interface QrtzSimpleTriggersMapper {
    int deleteByPrimaryKey(QrtzSimpleTriggersKey key);

    int insert(QrtzSimpleTriggers record);

    int insertSelective(QrtzSimpleTriggers record);

    QrtzSimpleTriggers selectByPrimaryKey(QrtzSimpleTriggersKey key);

    int updateByPrimaryKeySelective(QrtzSimpleTriggers record);

    int updateByPrimaryKey(QrtzSimpleTriggers record);
}