package com.abhjit.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String studentName;
	
	private String loginId;
	
	private String password;
	
	private String email; 
	
	@ManyToMany
	@JoinTable
	List<Role> roles = new ArrayList<Role>();
	
	@OneToMany(mappedBy = "student")
	List<Project> projects = new ArrayList<Project>();
	
	public Student() {
	}

	public Student(String studentName,String loginId, String password,String email) {
		this.studentName = studentName;
		this.loginId = loginId;
		this.password = password;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer studentId) {
		this.id = studentId;
	}

	@Column(name="stu_name",length=50 )
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
}
