import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
	 	
	 	System.out.println("Enter the name");
	 	String name=sc.next();
	 	System.out.println("Enter the Address");
	 	String add=sc.next();
	 	System.out.println("Enter the mobile no");
	 	int mobno=sc.nextInt();
		Employee em=new Employee(name,add,mobno);
		System.out.println("Employee name"+em.getName());
		System.out.println("Employee add"+em.getAdd());
		System.out.println("Employee mobileno"+em.getMobno());
	

	}

}
