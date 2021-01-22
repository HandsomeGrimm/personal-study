package grimm.study.mapper;

import grimm.study.model.TRoleDataScope;

public interface TRoleDataScopeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TRoleDataScope record);

    int insertSelective(TRoleDataScope record);

    TRoleDataScope selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TRoleDataScope record);

    int updateByPrimaryKey(TRoleDataScope record);
}