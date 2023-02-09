
public class Employee{
	private String name;
	private String add;
	private String mobno;
	public Employee(String name, String add, String mobno) {
		this.name = name;
		this.add = add;
		this.mobno = mobno;
	}
	public Employee(String name, String add, int mobno) {
		// TODO Auto-generated constructor stub
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
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	

}
