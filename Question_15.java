import java.util.Scanner;

/* Write a function to check if string is palindrome. The Function should 
return True or False. You may use built-in functions, if required*/
public class Question_15 {
	public static void main(String[]args)
	{	
		String str2="";
		System.out.println("Enter the word to check for Palindrome ");
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
		
		
		
		/*String str2="";
		System.out.println("Enter the word to check for Palindrome ");
		Scanner sc=new Scanner (System.in);
		String str1 =sc.next();
		int n = str1.length();
		for(int i=n-1;i>=0;i--)
			{
			str2 = str2+ str1.charAt(i);
			}
		if(str1.equalsIgnoreCase(str2)) 
		{
			System.out.println("The word "+str1+ " is Palindrome");
		}
		else 
			System.out.println("The word is "+str1+ " not Palindrome");
		*/
	}

}
