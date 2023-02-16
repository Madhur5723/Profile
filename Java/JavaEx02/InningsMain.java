import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
	    String s1 = "First";
	  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Teamname");
		String teamname=sc.nextLine();
		System.out.println("Enter the inningsname");
		String inningsname=sc.nextLine();
		System.out.println("Enter the runs");
		int runs=sc.nextInt();
		Innings in=new Innings(teamname, inningsname, runs);
		System.out.println("Teamname:"+in.getTeamname());
		System.out.println("Inningsname"+in.getInningsname());
		System.out.println("Runs:"+in.getRuns());
		if (inningsname.equals(s1))
		{
			
			System.out.println("Need "+(runs+1) +" to Win");
			
		}
		else 
		{
			System.out.println("Match Ended");
		}
		
		

	}

}
