package newyear.kumar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	int i_d;
	String name;
	@OneToOne
	bike b;

	public Student(int i_d, String name, bike b) {
		super();
		this.i_d = i_d;
		this.name = name;
		this.b= b;
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

	public bike getB() {
		return b;
	}

	public void setB(bike b) {
		this.b = b;
	}
}
