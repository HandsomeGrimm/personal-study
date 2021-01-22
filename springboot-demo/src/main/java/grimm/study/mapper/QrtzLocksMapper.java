package grimm.study.mapper;

import grimm.study.model.QrtzLocksKey;

public interface QrtzLocksMapper {
    int deleteByPrimaryKey(QrtzLocksKey key);

    int insert(QrtzLocksKey record);

    int insertSelective(QrtzLocksKey record);
}