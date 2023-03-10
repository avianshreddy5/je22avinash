package com.example.crud.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.crud.dao.StudentDao;
import com.example.demo.crud.entity.Students;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	StudentDao sd;

	
	@Autowired
	public StudentRestController(StudentDao sd) {
		super();
		this.sd = sd;
	}

	@GetMapping(value = "/Students") // localhost:9095/api/Students
	public List<Students> getStudents() {
		return sd.getStudents();
	}

	@GetMapping(value = "/oneStudent/{id}")
	public Students getIndividualStudent(@PathVariable int id) {
		return ((StudentRestController) sd).getIndividualStudent(id);
	}
	@Transactional
	@GetMapping(value="/delStudents/{id}")
	public void delStudent(@PathVariable int id)
	{
		((StudentRestController) sd).delStudent(id);
	}
}
