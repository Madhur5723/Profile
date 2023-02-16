package Exception;
import java.util.*;
public class Runsperover {

	public static void main(String[] args) {
		System.out.println("Enter the number of overs : ");
		Scanner sc=new Scanner(System.in);
		int over=sc.nextInt();
		int runs[];
		
		try {
			runs=new int[over];		
		}
		catch(Exception e)
		{
			System.out.println(e.getClass().getName());
			return;
		}
		
		System.out.println("Enter the number of runs for each over :");
		for(int i=0;i<over;i++)
			runs[i]=sc.nextInt();
		
		System.out.println("Enter the over number: ");
		
		try {
			int num=sc.nextInt();
			System.out.println("Runs scored in "+num+"rd over : "+runs[num-1]);
		}
		catch(Exception e)
		{
			System.out.println(e.getClass().getName());
		
		}
		
		
		
		
		
	}
	
	
	
}
