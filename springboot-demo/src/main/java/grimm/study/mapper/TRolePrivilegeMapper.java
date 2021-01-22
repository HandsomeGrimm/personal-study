package grimm.study.mapper;

import grimm.study.model.TRolePrivilege;

public interface TRolePrivilegeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TRolePrivilege record);

    int insertSelective(TRolePrivilege record);

    TRolePrivilege selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TRolePrivilege record);

    int updateByPrimaryKey(TRolePrivilege record);
}