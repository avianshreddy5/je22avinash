package com.p;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
	int t_id;
	String name;
	String subject;

	public Teacher(int t_id, String name, String subject) {
		super();
		this.t_id = t_id;
		this.name = name;
		this.subject = subject;
	}
}
