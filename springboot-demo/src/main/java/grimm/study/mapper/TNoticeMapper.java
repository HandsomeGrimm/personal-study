package grimm.study.mapper;

import grimm.study.model.TNotice;

public interface TNoticeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TNotice record);

    int insertSelective(TNotice record);

    TNotice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TNotice record);

    int updateByPrimaryKeyWithBLOBs(TNotice record);

    int updateByPrimaryKey(TNotice record);
}