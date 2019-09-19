package org.freedom.crud.service;

import java.util.List;

import org.freedom.crud.bean.StudentClass;
import org.freedom.crud.dao.StudentClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	StudentClassMapper studentClassMapper;
	
	/**
	 * 查询学生，班级
	 * @return
	 */
	public List<StudentClass> getStudentClass()
	{
		return studentClassMapper.selectAllByExample(null);
	}
}
