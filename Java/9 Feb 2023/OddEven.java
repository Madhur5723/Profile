import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
	    if(n<0)
	    {
	    	System.out.println("Invalid Input");
	    }
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println("Enter your "+(i+1)+ " elements values");
	    	a[i]=sc.nextInt();
	    	if(a[i]<0)
	    	{
	    		System.out.println("INVALID INPUTS");
	    		return;
	    	}
	    	
	    }
	    int oddsum=0;
	    int evensum=0;
	    for(int i:a)
	    {
	    	if(i%2==0)
	    	{
	    		evensum+=i;
	    	}
	    	if(i%2!=0)
	    	{
	    		oddsum +=i;
	    	}
	    }
	    if(evensum>oddsum)
	    {
	    	System.out.println("Evensum is greater than oddsum:"+evensum);
	    }
	    else
	    {
	    	System.out.println("oddsum is greater than evensum:"+oddsum);

	    }
	  

	}

}
