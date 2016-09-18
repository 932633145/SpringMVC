package com.yjw.andy.model;

import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class UserInfo {
	
    private Integer id;
    @Size(min=3, max=30) @NotEmpty
    private String uname;
    @Size(min=3, max=30) @NotEmpty
    private Integer unumber;
    
    private List<CourseInfo> courseInfos;  
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public Integer getUnumber() {
        return unumber;
    }

    public void setUnumber(Integer unumber) {
        this.unumber = unumber;
    }
    public List<CourseInfo> getCourseInfos() {  
        return courseInfos;  
    }  
  
}