package org.freedom.crud.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.freedom.crud.bean.StudentClass;
import org.freedom.crud.bean.StudentClassExample;

public interface StudentClassMapper {
	long countByExample(StudentClassExample example);

	int deleteByExample(StudentClassExample example);

	int deleteByPrimaryKey(Integer studentClassId);

	int insert(StudentClass record);

	int insertSelective(StudentClass record);

	List<StudentClass> selectByExample(StudentClassExample example);

	List<StudentClass> selectAllByExample(StudentClassExample example);

	StudentClass selectByPrimaryKey(Integer studentClassId);

	int updateByExampleSelective(@Param("record") StudentClass record, @Param("example") StudentClassExample example);

	int updateByExample(@Param("record") StudentClass record, @Param("example") StudentClassExample example);

	int updateByPrimaryKeySelective(StudentClass record);

	int updateByPrimaryKey(StudentClass record);
}