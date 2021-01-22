package grimm.study.mapper;

import grimm.study.model.THeartBeatRecord;

public interface THeartBeatRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(THeartBeatRecord record);

    int insertSelective(THeartBeatRecord record);

    THeartBeatRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(THeartBeatRecord record);

    int updateByPrimaryKey(THeartBeatRecord record);
}