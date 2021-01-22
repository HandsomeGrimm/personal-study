package grimm.study.mapper;

import grimm.study.model.QrtzCronTriggers;
import grimm.study.model.QrtzCronTriggersKey;

public interface QrtzCronTriggersMapper {
    int deleteByPrimaryKey(QrtzCronTriggersKey key);

    int insert(QrtzCronTriggers record);

    int insertSelective(QrtzCronTriggers record);

    QrtzCronTriggers selectByPrimaryKey(QrtzCronTriggersKey key);

    int updateByPrimaryKeySelective(QrtzCronTriggers record);

    int updateByPrimaryKey(QrtzCronTriggers record);
}