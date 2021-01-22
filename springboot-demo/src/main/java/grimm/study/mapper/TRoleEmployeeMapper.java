package grimm.study.mapper;

import grimm.study.model.TRoleEmployee;

public interface TRoleEmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TRoleEmployee record);

    int insertSelective(TRoleEmployee record);

    TRoleEmployee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TRoleEmployee record);

    int updateByPrimaryKey(TRoleEmployee record);
}