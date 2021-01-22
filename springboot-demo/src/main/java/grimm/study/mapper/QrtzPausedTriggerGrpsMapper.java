package grimm.study.mapper;

import grimm.study.model.QrtzPausedTriggerGrpsKey;

public interface QrtzPausedTriggerGrpsMapper {
    int deleteByPrimaryKey(QrtzPausedTriggerGrpsKey key);

    int insert(QrtzPausedTriggerGrpsKey record);

    int insertSelective(QrtzPausedTriggerGrpsKey record);
}