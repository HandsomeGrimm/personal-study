package grimm.study.mapper;

import grimm.study.model.TPeony;

public interface TPeonyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TPeony record);

    int insertSelective(TPeony record);

    TPeony selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TPeony record);

    int updateByPrimaryKeyWithBLOBs(TPeony record);

    int updateByPrimaryKey(TPeony record);
}