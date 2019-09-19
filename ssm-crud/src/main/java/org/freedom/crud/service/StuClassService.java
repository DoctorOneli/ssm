package org.freedom.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.freedom.crud.bean.Course;
import org.freedom.crud.bean.StuClass;
import org.freedom.crud.bean.StuClassExample;
import org.freedom.crud.dao.StuClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuClassService {

	@Autowired
	StuClassMapper stuClassMapper;

	public List<diyCourse> getCourse()
	{
		 
		List<Course> courses= stuClassMapper.selectWithCourseByExample(null).get(0).getCourse();
		List<diyCourse> all=new ArrayList<diyCourse>();
		
		for (int i = 1; i <= 7; i++) {
			List<Course> temp=new ArrayList<Course>();
			all.add(new diyCourse(i, temp));
		}
		
		Integer day=1;
		for (Course course : courses) {
		   all.get(course.getDay()-1).getCourses().add(course);
		}
		
		return all;
		
	}

	class diyCourse {
		Integer dayId;
		List<Course> courses;

		public diyCourse() {
			super();
			// TODO Auto-generated constructor stub
		}

		public diyCourse(Integer dayId, List<Course> courses) {
			super();
			this.dayId = dayId;
			this.courses = courses;
		}

		public Integer getDayId() {
			return dayId;
		}

		public void setDayId(Integer dayId) {
			this.dayId = dayId;
		}

		public List<Course> getCourses() {
			return courses;
		}

		public void setCourses(List<Course> courses) {
			this.courses = courses;
		}
	}

}
