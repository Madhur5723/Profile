package Exception;
import java.util.*;
public class Runrate
{
	public static void main(String[] args) 
{
	System.out.println("Enter the total runs scored");
	Scanner sc = new Scanner(System.in);
	int overs=0,runs=0;
	
	try {
		runs=sc.nextInt();
	}
	catch(Exception e) 
	{
		System.out.println(e.getClass().getName());
		}
	System.out.println("Enter the total overs faced");
	try {
		overs=sc.nextInt();
	}
	catch(Exception e){
		System.out.println(e.getClass().getName());
		}
	float runRate=0;
	try {
		
		runRate=(runs/overs);
		System.out.println("Current runrate is:" +(double)(runRate*100)/100);
		}
	catch(Exception e) {
		System.out.println(e.getClass().getName());
		}
	}
 }
