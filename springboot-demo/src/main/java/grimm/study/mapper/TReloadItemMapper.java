package grimm.study.mapper;

import grimm.study.model.TReloadItem;

public interface TReloadItemMapper {
    int deleteByPrimaryKey(String tag);

    int insert(TReloadItem record);

    int insertSelective(TReloadItem record);

    TReloadItem selectByPrimaryKey(String tag);

    int updateByPrimaryKeySelective(TReloadItem record);

    int updateByPrimaryKey(TReloadItem record);
}