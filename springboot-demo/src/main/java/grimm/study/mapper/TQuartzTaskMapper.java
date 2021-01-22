package grimm.study.mapper;

import grimm.study.model.TQuartzTask;

public interface TQuartzTaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TQuartzTask record);

    int insertSelective(TQuartzTask record);

    TQuartzTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TQuartzTask record);

    int updateByPrimaryKey(TQuartzTask record);
}