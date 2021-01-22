package grimm.study.mapper;

import grimm.study.model.QrtzJobDetails;
import grimm.study.model.QrtzJobDetailsKey;

public interface QrtzJobDetailsMapper {
    int deleteByPrimaryKey(QrtzJobDetailsKey key);

    int insert(QrtzJobDetails record);

    int insertSelective(QrtzJobDetails record);

    QrtzJobDetails selectByPrimaryKey(QrtzJobDetailsKey key);

    int updateByPrimaryKeySelective(QrtzJobDetails record);

    int updateByPrimaryKeyWithBLOBs(QrtzJobDetails record);

    int updateByPrimaryKey(QrtzJobDetails record);
}