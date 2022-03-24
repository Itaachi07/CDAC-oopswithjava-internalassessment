import java.util.Scanner;

/*Write a Java program to calculate a Factorial of a number.
 */

public class Question_02 
{
	public static void main(String[]args)
	{	
		System.out.println("Developer: D4_Pratik_Satpute_62758");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int fact=1;
		for(int i=1;i<=num; i++)
		{
			fact = fact*i;
		}
		System.out.println("The Factorial of number "+num+" is "+fact);	
	}
}
