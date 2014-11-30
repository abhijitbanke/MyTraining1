package com.abhjit.webui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.abhjit.Service.StudentService;
import com.abhjit.model.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@ModelAttribute("student")
	public Student doConstruct(){
		return new Student();
	}
	
	@RequestMapping("/students")
	public String students(Model model){
		model.addAttribute("users", studentService.findAll());
		return "students";
	}
	
	@RequestMapping("/students/{id}")
	public String studentDetails(Model model, @PathVariable int id){
		model.addAttribute("student", studentService.findById(id));
		return "student-details";
	}
	
	@RequestMapping("/student-registration")
	public String showRegistration(){
		
		return "student-registration";
	}
	
	@RequestMapping(value="/student-registration", method= RequestMethod.POST)
	public String doRegistration(@ModelAttribute("student")Student student){
		studentService.save(student);
		return "student-registration";
	}
}
