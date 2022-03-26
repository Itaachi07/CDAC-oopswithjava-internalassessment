import java.util.Scanner;

/*Write a user-defined function to reverse the letters present in the given 
string and return. Hint: Strings in Java are immutable. You can use 
StringBuilder or StringBuffer.*/
public class Question_12 
{
	void fun()
	{
		System.out.println("Enter the String to reverse it ");
		Scanner sc=new Scanner(System.in);
		String str = sc.next();		
		StringBuffer sb = new StringBuffer(str);
		sb = sb.reverse();	
		System.out.println(sb);
	}
	public static void main(String[]args)
	{	
		
		System.out.println("Developer: D4_Pratik_Satpute_62758");
		Question_12 re = new Question_12();
		re.fun();
	}
	
}
