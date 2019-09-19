package org.freedom.crud.bean;

public class Course {
    private Integer courseId;

    private String name;

    private String time;

    private Integer day;

    private String week;

    private Integer classId;

    
    public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(Integer courseId, String name, String time, Integer day, String week, Integer classId) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.time = time;
		this.day = day;
		this.week = week;
		this.classId = classId;
	}

 

    public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week == null ? null : week.trim();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}