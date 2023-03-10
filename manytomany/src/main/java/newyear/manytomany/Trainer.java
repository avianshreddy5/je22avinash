package newyear.manytomany;

import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Trainer {
	@Id
	int t_id;
	String s_name;
	@ManyToMany
	List<Subjects> sub;

	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trainer(int t_id, String s_name, List<Subjects> sub) {
		super();
		this.t_id = t_id;
		this.s_name = s_name;
		this.sub = sub;
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public List<Subjects> getSub() {
		return sub;
	}

	public void setSub(List<Subjects> sub) {
		this.sub = sub;
	}

}
