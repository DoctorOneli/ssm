package org.freedom.crud.bean;

public class Student {
    private Integer studentId;

    private String name;

    public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}

	public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}