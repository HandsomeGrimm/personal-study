package grimm.study.mapper;

import grimm.study.model.TUserLoginLog;

public interface TUserLoginLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUserLoginLog record);

    int insertSelective(TUserLoginLog record);

    TUserLoginLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUserLoginLog record);

    int updateByPrimaryKey(TUserLoginLog record);
}