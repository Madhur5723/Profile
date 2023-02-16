package Exception;
import java.util.*;

public class PlayerAge {

	  String name;
	    int age;

	    public PlayerAge(String name, int age) throws CustomException {
	        if (age < 19) {
	            throw new CustomException("CustomException: InvalidAgeRangeException");
	        }
	        this.name = name;
	        this.age = age;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the player's name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter the player's age: ");
	        int age = sc.nextInt();

	        try {
	            PlayerAge player = new PlayerAge(name, age);
	            System.out.println("Player's Name: " + player.name);
	            System.out.println("Player's Age: " + player.age);
	        } catch (CustomException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	
	
}
