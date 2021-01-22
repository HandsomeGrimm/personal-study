package grimm.study.mapper;

import grimm.study.model.TPrivilege;

public interface TPrivilegeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TPrivilege record);

    int insertSelective(TPrivilege record);

    TPrivilege selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TPrivilege record);

    int updateByPrimaryKeyWithBLOBs(TPrivilege record);

    int updateByPrimaryKey(TPrivilege record);
}