import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	 	
	 	System.out.println("Enter the name");
	 	String name=sc.nextLine();
	 	System.out.println("Enter the Address");
	 	String add=sc.nextLine();
	 	System.out.println("Enter the mobile no");
	 	String mobno=sc.nextLine();
	 	Employee em=new Employee(name, add, mobno);
		System.out.println("Employee name"+em.getName());
		System.out.println("Employee add"+em.getAdd());
		System.out.println("Employee mobileno"+em.getMobno());
	

	}

}
