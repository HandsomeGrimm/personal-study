package grimm.study.mapper;

import grimm.study.model.TSystemConfig;

public interface TSystemConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TSystemConfig record);

    int insertSelective(TSystemConfig record);

    TSystemConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TSystemConfig record);

    int updateByPrimaryKeyWithBLOBs(TSystemConfig record);

    int updateByPrimaryKey(TSystemConfig record);
}