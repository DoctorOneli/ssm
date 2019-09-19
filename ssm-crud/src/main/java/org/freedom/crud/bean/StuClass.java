package org.freedom.crud.bean;

import java.util.List;

public class StuClass {
	private Integer classId;

	private String className;

	private Integer instituteId;

	private List<Course> course;

	public StuClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StuClass(Integer classId, String className, Integer instituteId, List<Course> course) {
		super();
		this.classId = classId;
		this.className = className;
		this.instituteId = instituteId;
		this.course = course;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className == null ? null : className.trim();
	}

	public Integer getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(Integer instituteId) {
		this.instituteId = instituteId;
	}
}