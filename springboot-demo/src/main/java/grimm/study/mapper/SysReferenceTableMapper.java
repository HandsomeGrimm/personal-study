package grimm.study.mapper;

import grimm.study.model.SysReferenceTable;
import grimm.study.model.SysReferenceTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysReferenceTableMapper {
    long countByExample(SysReferenceTableExample example);

    int deleteByExample(SysReferenceTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysReferenceTable record);

    int insertSelective(SysReferenceTable record);

    List<SysReferenceTable> selectByExample(SysReferenceTableExample example);

    SysReferenceTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysReferenceTable record, @Param("example") SysReferenceTableExample example);

    int updateByExample(@Param("record") SysReferenceTable record, @Param("example") SysReferenceTableExample example);

    int updateByPrimaryKeySelective(SysReferenceTable record);

    int updateByPrimaryKey(SysReferenceTable record);
}