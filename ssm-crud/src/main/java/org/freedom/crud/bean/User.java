package org.freedom.crud.bean;

import javax.validation.constraints.Pattern;

public class User {
	private Integer uid;

	@Pattern(regexp="(^[a-z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,6})",message="姓名由2到5个字符或6到16为英文和数字的组合")
	private String userName;

	@Pattern(regexp="^[0-9_-]{10,12}$",message="学号由10到12位数字组合")
	private String stuNo;

	private String phone;

	private Integer classId;

	private StuClass stuClass;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer uid, String userName, String stuNo, String phone, Integer classId) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.stuNo = stuNo;
		this.phone = phone;
		this.classId = classId;
	}

	public StuClass getStuClass() {
		return stuClass;
	}

	public void setStuClass(StuClass stuClass) {
		this.stuClass = stuClass;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo == null ? null : stuNo.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}
}