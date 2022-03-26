import java.util.Scanner;

/* Write a function to check if string is palindrome. The Function should 
return True or False. You may use built-in functions, if required*/
public class Question_15 
	{

	 void palindrome()
	{
		String str2="";
		System.out.println("Enter word to check for palindrome ");
		Scanner sc=new Scanner (System.in);
		String str1 =sc.next();
		int n = str1.length();
		for(int i=n-1;i>=0;i--)
			{
			str2 = str2+ str1.charAt(i);
			}
		if(str1.equalsIgnoreCase(str2)) 
		{
			System.out.println("True");
		}
		else 
			System.out.println("False");
		
	}
	public static void main(String[]args)
	{	
		System.out.println("Developer: D4_Pratik_Satpute_62758");
		Question_15 pal = new Question_15();
		pal.palindrome();
	}
	}
	


