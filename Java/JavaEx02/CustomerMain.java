import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	 	String name=sc.nextLine();
	 	String add=sc.nextLine();
	 	String mobno=sc.nextLine();
		System.out.println("Enter the details"+name+","+add+","+mobno);

	 	Customer em=new Customer(name, add, mobno);
		System.out.println("Customer name"+em.getName());
		System.out.println("Customer add"+em.getAdd());
		System.out.println("Customer mobileno"+em.getMobno()); 
		

	}

}
