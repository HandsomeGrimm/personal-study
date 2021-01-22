package grimm.study.mapper;

import grimm.study.model.QrtzSchedulerState;
import grimm.study.model.QrtzSchedulerStateKey;

public interface QrtzSchedulerStateMapper {
    int deleteByPrimaryKey(QrtzSchedulerStateKey key);

    int insert(QrtzSchedulerState record);

    int insertSelective(QrtzSchedulerState record);

    QrtzSchedulerState selectByPrimaryKey(QrtzSchedulerStateKey key);

    int updateByPrimaryKeySelective(QrtzSchedulerState record);

    int updateByPrimaryKey(QrtzSchedulerState record);
}