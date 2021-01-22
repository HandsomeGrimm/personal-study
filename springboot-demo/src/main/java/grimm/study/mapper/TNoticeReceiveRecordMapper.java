package grimm.study.mapper;

import grimm.study.model.TNoticeReceiveRecord;

public interface TNoticeReceiveRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TNoticeReceiveRecord record);

    int insertSelective(TNoticeReceiveRecord record);

    TNoticeReceiveRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TNoticeReceiveRecord record);

    int updateByPrimaryKey(TNoticeReceiveRecord record);
}