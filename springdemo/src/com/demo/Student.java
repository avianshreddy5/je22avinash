package com.demo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	// TODO Auto-generated method stub
	List<String> skills;
	Set<String> mobiles;
	Map<String, Float> marks;

	@Override
	public String toString() {
		return "Student [skills=" + skills + ", mobiles=" + mobiles + ", marks=" + marks + ", getSkills()="
				+ getSkills() + ", getMobiles()=" + getMobiles() + ", getMarks()=" + getMarks() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(List<String> skills, Set<String> mobiles, Map<String, Float> marks) {
		super();
		this.skills = skills;
		this.mobiles = mobiles;
		this.marks = marks;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Set<String> getMobiles() {
		return mobiles;
	}

	public void setMobiles(Set<String> mobiles) {
		this.mobiles = mobiles;
	}

	public Map<String, Float> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Float> marks) {
		this.marks = marks;
	}

}
