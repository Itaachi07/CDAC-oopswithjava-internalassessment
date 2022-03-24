import java.util.Scanner;

/*	Write a Java program to calculate Fibonacci Series up to n numbers */

public class Question_3 
{
	public static void main(String[]args)
	{
	int n1=0 , n2=1,n3, i=0, n;
	System.out.println("Developer: D4_Pratik_Satpute_62758");
	System.out.println("Enter the number");
	Scanner sc= new Scanner(System.in);
	n = sc.nextInt();
	System.out.print(n1+" "+n2);
	for(i=2; i<n;++i)
		{
		 n3= n2+n1;
		 System.out.print(" "+n3);
		 n1=n2;
		 n2=n3;
		 
		}
	}
}
