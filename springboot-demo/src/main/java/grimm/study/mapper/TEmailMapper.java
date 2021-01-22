package grimm.study.mapper;

import grimm.study.model.TEmail;

public interface TEmailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TEmail record);

    int insertSelective(TEmail record);

    TEmail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TEmail record);

    int updateByPrimaryKeyWithBLOBs(TEmail record);

    int updateByPrimaryKey(TEmail record);
}