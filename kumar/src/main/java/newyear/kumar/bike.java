package newyear.kumar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class bike {
	@Id
	int i_d;
	String name;
	@OneToOne
	Student st;

	public bike() {
		super();
	}

	public bike(int i_d, String name, Student st) {
		super();
		this.i_d = i_d;
		this.name = name;
		this.st=st;
	}

	public int getI_d() {
		return i_d;
	}

	public void setI_d(int i_d) {
		this.i_d = i_d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getSt() {
		return st;
	}

	public void setSt(Student st) {
		this.st = st;
	}
}
