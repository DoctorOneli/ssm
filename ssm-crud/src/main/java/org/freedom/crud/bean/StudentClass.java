package org.freedom.crud.bean;

public class StudentClass {
	private Integer studentClassId;

	private Integer studentId;

	private Integer classId;

	private Student student;

	private StuClass stuClass;

	public StudentClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentClass(Integer studentClassId, Integer studentId, Integer classId, Student student,
			StuClass stuClass) {
		super();
		this.studentClassId = studentClassId;
		this.studentId = studentId;
		this.classId = classId;
		this.student = student;
		this.stuClass = stuClass;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public StuClass getStuClass() {
		return stuClass;
	}

	public void setStuClass(StuClass stuClass) {
		this.stuClass = stuClass;
	}

	public Integer getStudentClassId() {
		return studentClassId;
	}

	public void setStudentClassId(Integer studentClassId) {
		this.studentClassId = studentClassId;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}
}