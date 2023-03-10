package newyear.avi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class skill {
	@Id
	int s_id;
	String s_name;
	@ManyToOne
	fresher f;

	public skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public skill(int s_id, String s_name, fresher f) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.f = f;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public fresher getF() {
		return f;
	}

	public void setF(fresher f) {
		this.f = f;
	}

	
}
