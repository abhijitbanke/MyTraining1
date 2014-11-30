package com.abhjit.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Project {

	@Id
	@GeneratedValue
	private Integer id;
	
	String projectName;
	
	Double projectCost; 
	
	@ManyToOne
	@JoinColumn(name = "student_id", nullable=false)
	Student student;
	
	@ManyToMany
	@JoinTable
	List<ProjectClient> projectClients = new ArrayList<ProjectClient>();
	
	

	public Project() {
	}
	
	public Project(String projectName,Double projectCost,Student student) {
		this.projectName = projectName;
		this. projectCost = projectCost;		
		this.student = student;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Double getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(Double projectCost) {
		this.projectCost = projectCost;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<ProjectClient> getProjectClients() {
		return projectClients;
	}

	public void setProjectClients(List<ProjectClient> projectClients) {
		this.projectClients = projectClients;
	}

	
	
}
