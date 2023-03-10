package newyear.laptop;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class laptop1 {
	@Id
	int l_id;
	String l_name;
	int L_cost;

	@Override
	public String toString() {
		return "laptop1 [l_id=" + l_id + ", l_name=" + l_name + ", L_cost=" + L_cost + "]";
	}

	public laptop1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public laptop1(int l_id, String l_name, int l_cost) {
		super();
		this.l_id = l_id;
		this.l_name = l_name;
		this.L_cost = l_cost;
	}

	public int getL_id() {
		return l_id;
	}

	public void setL_id(int l_id) {
		this.l_id = l_id;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public int getL_cost() {
		return L_cost;
	}

	public void setL_cost(int l_cost) {
		this.L_cost = l_cost;
	}

}
