package com.example.demo.crud.dao;

import java.util.List;

import com.example.demo.crud.entity.Students;

public interface StudentDao {
	List<Students> getStudents();

	Students getIndividualStudent(int id);

	void delStudent(int id);

}
