package com.dipam.springDemoWeb1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dipam.springDemoWeb1.model.Student;
import com.dipam.springDemoWeb1.service.StudentService;

@RestController
public class StudentController {
	private StudentService ss;

	public StudentService getSs() {
		return ss;
	}

	@Autowired
	public void setSs(StudentService ss) {
		this.ss = ss;
	}
	
	@PostMapping("student")
	public String addStudent(@RequestBody Student s) {
		ss.add(s);
		return "Student added";
	}
	@GetMapping("students")
	public List<Student> getAll(){
		return ss.get();
	}
	@PutMapping("student")
	public String updateStudent(@RequestBody Student s) {
		ss.update(s);
		return "Student updated";
	}
	@DeleteMapping("student/{r}")
	public String deleteStudent(@PathVariable int r) {
		ss.delete(r);
		return "Student deleted";
	}
}
