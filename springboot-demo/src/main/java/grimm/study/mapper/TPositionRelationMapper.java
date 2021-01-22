package grimm.study.mapper;

import grimm.study.model.TPositionRelation;

public interface TPositionRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TPositionRelation record);

    int insertSelective(TPositionRelation record);

    TPositionRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TPositionRelation record);

    int updateByPrimaryKey(TPositionRelation record);
}