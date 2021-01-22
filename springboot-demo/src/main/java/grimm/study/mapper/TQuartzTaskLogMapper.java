package grimm.study.mapper;

import grimm.study.model.TQuartzTaskLog;

public interface TQuartzTaskLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TQuartzTaskLog record);

    int insertSelective(TQuartzTaskLog record);

    TQuartzTaskLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TQuartzTaskLog record);

    int updateByPrimaryKeyWithBLOBs(TQuartzTaskLog record);

    int updateByPrimaryKey(TQuartzTaskLog record);
}