package com.dipam.springDemoWeb1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dipam.springDemoWeb1.model.Student;
import com.dipam.springDemoWeb1.repo.StudentRepo;

@Service
public class StudentService {

	private StudentRepo sr;
	
	public StudentRepo getSr() {
		return sr;
	}

	@Autowired
	public void setSr(StudentRepo sr) {
		this.sr = sr;
	}

	public void add(Student s) {
		sr.save(s);
	}

	public List<Student> get() {
		return sr.findAll();
	}

	public void update(Student s) {
		if(sr.existsById(s.getRoll())) {
			sr.save(s);
		}
	}

	public void delete(int r) {
		if(sr.existsById(r)) {
			sr.deleteById(r);
		}
	}

}
