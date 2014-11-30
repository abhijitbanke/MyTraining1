package com.abhjit.Service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhjit.model.Project;
import com.abhjit.model.ProjectClient;
import com.abhjit.model.Role;
import com.abhjit.model.Student;
import com.abhjit.repository.ProjectClientRepository;
import com.abhjit.repository.ProjectRepository;
import com.abhjit.repository.RoleRepository;
import com.abhjit.repository.StudentRepository;


@Transactional
@Service
public class InitDBService {

	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	ProjectRepository projectRepository;
	
	@Autowired
	ProjectClientRepository projectClientRepository;
	
	@PostConstruct
	public void init(){
		List<Role> list = new ArrayList<Role>();
		for(int i = 0; i < 10 ; i++ ){
		Role role1 = new Role("ROLE_L"+i+"_USER");
		roleRepository.save(role1);
		list.add(role1);
		}	
		
		List<Student> studentList = new ArrayList<Student>();
		for(int i = 0 ; i < 10 ; i++){
			Student student1 = new Student("student"+i,"LOGIN-ID"+i,"123","student"+i+"@gmail.com");
			student1.getRoles().add(list.get(i));
			student1.getRoles().add(list.get( (i+1) > 9 ? 0 : i+1 ));	
			studentRepository.save(student1);
			studentList.add(student1);
		}
		
		
		for(int i = 0 ; i < 10 ; i++){
		
		Project project1 = new Project("PREJECT"+i, 3000.0 + i,studentList.get(i));
		projectRepository.save(project1);
		
		
		Project project2 = new Project("PREJECT"+i+"-"+i, 5000.0+i,studentList.get((i + 1 ) > 9 ? 0 : i+1));
		projectRepository.save(project2);
		
		ProjectClient projectClient1 = new ProjectClient("Client"+i); 
		projectClient1.getProjects().add(project1);
		projectClient1.getProjects().add(project2);
		projectClientRepository.save(projectClient1);
		
		}
	}
	
	
}
