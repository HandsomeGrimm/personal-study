package grimm.study.mapper;

import grimm.study.model.TUserOperateLog;
import grimm.study.model.TUserOperateLogWithBLOBs;

public interface TUserOperateLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUserOperateLogWithBLOBs record);

    int insertSelective(TUserOperateLogWithBLOBs record);

    TUserOperateLogWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUserOperateLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TUserOperateLogWithBLOBs record);

    int updateByPrimaryKey(TUserOperateLog record);
}