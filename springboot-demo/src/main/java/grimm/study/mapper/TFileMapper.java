package grimm.study.mapper;

import grimm.study.model.TFile;

public interface TFileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TFile record);

    int insertSelective(TFile record);

    TFile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TFile record);

    int updateByPrimaryKey(TFile record);
}