
public class Employee {
	private String name;
	private String add;
	private int mobno;
	public Employee(String name, String add, int mobno) {
		super();
		this.name = name;
		this.add = add;
		this.mobno = mobno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}

	
}
