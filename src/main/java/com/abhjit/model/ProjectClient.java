package com.abhjit.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class ProjectClient {

	@Id
	@GeneratedValue
	private Integer id;
	
	String clientName;
	
	@ManyToMany
	@JoinTable
	List<Project> projects = new ArrayList<Project>();

	public ProjectClient() {
		
	}
	
	public ProjectClient(String clientName) {
		this.clientName = clientName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
}
