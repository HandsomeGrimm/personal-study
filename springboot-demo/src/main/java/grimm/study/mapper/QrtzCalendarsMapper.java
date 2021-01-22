package grimm.study.mapper;

import grimm.study.model.QrtzCalendars;
import grimm.study.model.QrtzCalendarsKey;

public interface QrtzCalendarsMapper {
    int deleteByPrimaryKey(QrtzCalendarsKey key);

    int insert(QrtzCalendars record);

    int insertSelective(QrtzCalendars record);

    QrtzCalendars selectByPrimaryKey(QrtzCalendarsKey key);

    int updateByPrimaryKeySelective(QrtzCalendars record);

    int updateByPrimaryKeyWithBLOBs(QrtzCalendars record);
}