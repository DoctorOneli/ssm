package org.freedom.crud.bean;

import java.util.List;

public class Institute {
    private Integer instituteId;

    private String name;
    
    private List<StuClass> stuClass;

    public Institute() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Institute(Integer instituteId, String name, List<StuClass> stuClass) {
		super();
		this.instituteId = instituteId;
		this.name = name;
		this.stuClass = stuClass;
	}

	public List<StuClass> getStuClass() {
		return stuClass;
	}

	public void setStuClass(List<StuClass> stuClass) {
		this.stuClass = stuClass;
	}

	public Integer getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(Integer instituteId) {
        this.instituteId = instituteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}