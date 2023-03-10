package newyear.manytomany;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Subjects {
	@Id
	int s_id;
	String S_name;
	@ManyToMany
	List<Trainer> trainer;//[pu,ay,deep]

	public Subjects() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subjects(int s_id, String s_name, List<Trainer> trainer) {
		super();
		this.s_id = s_id;
		S_name = s_name;
		this.trainer = trainer;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return S_name;
	}

	public void setS_name(String s_name) {
		S_name = s_name;
	}

	public List<Trainer> getTrainer() {
		return trainer;
	}

	public void setTrainer(List<Trainer> trainer) {
		this.trainer = trainer;
	}

}
