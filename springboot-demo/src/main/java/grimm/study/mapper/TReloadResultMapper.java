package grimm.study.mapper;

import grimm.study.model.TReloadResult;

public interface TReloadResultMapper {
    int insert(TReloadResult record);

    int insertSelective(TReloadResult record);
}