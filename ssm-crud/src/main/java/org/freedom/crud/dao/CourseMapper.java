package org.freedom.crud.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.freedom.crud.bean.Course;
import org.freedom.crud.bean.CourseExample;

public interface CourseMapper {
    long countByExample(CourseExample example);

    int deleteByExample(CourseExample example);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByExample(CourseExample example);

    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);
}