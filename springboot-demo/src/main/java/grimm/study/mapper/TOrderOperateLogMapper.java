package grimm.study.mapper;

import grimm.study.model.TOrderOperateLog;
import grimm.study.model.TOrderOperateLogWithBLOBs;

public interface TOrderOperateLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TOrderOperateLogWithBLOBs record);

    int insertSelective(TOrderOperateLogWithBLOBs record);

    TOrderOperateLogWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TOrderOperateLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TOrderOperateLogWithBLOBs record);

    int updateByPrimaryKey(TOrderOperateLog record);
}