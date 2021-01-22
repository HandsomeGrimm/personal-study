package grimm.study.mapper;

import grimm.study.model.QrtzSimpropTriggers;
import grimm.study.model.QrtzSimpropTriggersKey;

public interface QrtzSimpropTriggersMapper {
    int deleteByPrimaryKey(QrtzSimpropTriggersKey key);

    int insert(QrtzSimpropTriggers record);

    int insertSelective(QrtzSimpropTriggers record);

    QrtzSimpropTriggers selectByPrimaryKey(QrtzSimpropTriggersKey key);

    int updateByPrimaryKeySelective(QrtzSimpropTriggers record);

    int updateByPrimaryKey(QrtzSimpropTriggers record);
}