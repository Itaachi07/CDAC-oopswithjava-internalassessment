import java.util.Scanner;

/*Write a user-defined function to display the letters present in the given string in 
reverse order. The function neither try to modify given string nor return it. Hint: Use 
recursion to display characters in reverse order*/
public class Question_14 
{
	void reverse()
	{
		String str2="";
		System.out.println("Enter word to reverse ");
		Scanner sc=new Scanner (System.in);
		String str1 =sc.next();
		int n = str1.length();
		for(int i=n-1;i>=0;i--)
			{
			str2 = str2+ str1.charAt(i);
			}
		System.out.println("The reversed string : "+str2);
	}

	public static void main(String[]rgs)
	{
		System.out.println("Developer: D4_Pratik_Satpute_62758");
		Question_14 pal = new Question_14();
		pal.reverse();
	}

}
