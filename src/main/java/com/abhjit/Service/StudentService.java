package com.abhjit.Service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhjit.model.Project;
import com.abhjit.model.ProjectClient;
import com.abhjit.model.Student;
import com.abhjit.repository.ProjectClientRepository;
import com.abhjit.repository.ProjectRepository;
import com.abhjit.repository.StudentRepository;

@Service
@Transactional
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	ProjectRepository projectRepository;
	
	@Autowired
	ProjectClientRepository projectClientRepository;
	
	public List<Student> findAll(){
		return studentRepository.findAll();
	}

	public Student findById(int id) {
		Student student = studentRepository.findOne(id);
		List<Project> projects = projectRepository.findByStudent(student);
		for (Project project : projects) {
			List<Project> projectList = new ArrayList<Project>();
			projectList.add(project);
			List<ProjectClient> projectClients = projectClientRepository.findByProjects(projectList);
			project.setProjectClients(projectClients);
		}
		student.setProjects(projects);
		return student;		
	}

	public void save(Student student) {
		studentRepository.save(student);
	}
}
