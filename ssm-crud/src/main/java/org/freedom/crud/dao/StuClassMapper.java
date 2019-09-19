package org.freedom.crud.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.freedom.crud.bean.StuClass;
import org.freedom.crud.bean.StuClassExample;

public interface StuClassMapper {
    long countByExample(StuClassExample example);

    int deleteByExample(StuClassExample example);

    int deleteByPrimaryKey(Integer classId);

    int insert(StuClass record);

    int insertSelective(StuClass record);

    List<StuClass> selectByExample(StuClassExample example);
    
    List<StuClass> selectWithCourseByExample(StuClassExample example);

    StuClass selectByPrimaryKey(Integer classId);

    int updateByExampleSelective(@Param("record") StuClass record, @Param("example") StuClassExample example);

    int updateByExample(@Param("record") StuClass record, @Param("example") StuClassExample example);

    int updateByPrimaryKeySelective(StuClass record);

    int updateByPrimaryKey(StuClass record);
}