package com.abhjit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhjit.model.Project;
import com.abhjit.model.ProjectClient;

@Repository
public interface ProjectClientRepository extends JpaRepository<ProjectClient, Integer> {
	
	public List<ProjectClient> findByProjects(List<Project> projectList);
}
