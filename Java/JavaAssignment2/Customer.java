
public class Customer {
	private String name;
	private String add;
	private String mobno;
	public Customer(String name, String add, String mobno) {
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
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	

}
