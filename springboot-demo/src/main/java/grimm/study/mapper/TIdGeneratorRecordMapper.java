package grimm.study.mapper;

import grimm.study.model.TIdGeneratorRecord;
import grimm.study.model.TIdGeneratorRecordKey;

public interface TIdGeneratorRecordMapper {
    int deleteByPrimaryKey(TIdGeneratorRecordKey key);

    int insert(TIdGeneratorRecord record);

    int insertSelective(TIdGeneratorRecord record);

    TIdGeneratorRecord selectByPrimaryKey(TIdGeneratorRecordKey key);

    int updateByPrimaryKeySelective(TIdGeneratorRecord record);

    int updateByPrimaryKey(TIdGeneratorRecord record);
}