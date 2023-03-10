package newyear.avi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class fresher {

	@Id
	int f_id;
	String f_name;
	@OneToMany
	List<skill> skills;

	public fresher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public fresher(int f_id, String f_name, List<skill> skills) {
		super();
		this.f_id = f_id;
		this.f_name = f_name;
		this.skills = skills;
	}

	public int getF_id() {
		return f_id;
	}

	public void setF_id(int f_id) {
		this.f_id = f_id;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public List<skill> getSkills() {
		return skills;
	}

	public void setSkills(List<skill> skills) {
		this.skills = skills;
	}

	
}
