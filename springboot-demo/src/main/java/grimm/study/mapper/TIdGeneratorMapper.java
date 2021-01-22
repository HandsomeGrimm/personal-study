package grimm.study.mapper;

import grimm.study.model.TIdGenerator;

public interface TIdGeneratorMapper {
    int insert(TIdGenerator record);

    int insertSelective(TIdGenerator record);
}