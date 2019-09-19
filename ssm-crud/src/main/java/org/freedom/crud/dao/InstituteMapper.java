package org.freedom.crud.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.freedom.crud.bean.Institute;
import org.freedom.crud.bean.InstituteExample;

public interface InstituteMapper {
    long countByExample(InstituteExample example);

    int deleteByExample(InstituteExample example);

    int deleteByPrimaryKey(Integer instituteId);

    int insert(Institute record);

    int insertSelective(Institute record);

    List<Institute> selectByExample(InstituteExample example);

    Institute selectByPrimaryKey(Integer instituteId);

    int updateByExampleSelective(@Param("record") Institute record, @Param("example") InstituteExample example);

    int updateByExample(@Param("record") Institute record, @Param("example") InstituteExample example);

    int updateByPrimaryKeySelective(Institute record);

    int updateByPrimaryKey(Institute record);
}