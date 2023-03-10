package com.example.demo.crud.dao;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.example.demo.crud.entity.Students;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.websocket.Session;

@Repository
public class StudentDaoImp implements StudentDao {
	EntityManager eman;

	public StudentDaoImp(EntityManager eman) {
		super();
		this.eman = eman;
	}

	@Override
	public List<Students> getStudents() {
		Session sess = eman.unwrap(Session.class);
		Query query = ((EntityManager) sess).createQuery("from students", Students.class);
		List<Students> slist = query.getResultList();
		return slist;
	}
//getting separate student details
	
	public Students getIndividualStudent(int id)

	{
		Session sess = eman.unwrap(Session.class);
		Students s = sess.get(Students.class, id);
		return s;
	}
//deleting the complete row
	public void delStudent(int id) {
		Session sess = eman.unwrap(Session.class);
		Query query = ((EntityManager) sess).createQuery("delete from Students where id=" + id);
		query.executeUpdate();
	}

}
