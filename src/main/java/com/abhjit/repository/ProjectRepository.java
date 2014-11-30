package com.abhjit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhjit.model.Project;
import com.abhjit.model.Student;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

	public List<Project> findByStudent(Student student);
}
