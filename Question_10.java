import java.util.Arrays;
import java.util.Scanner;
public class Question_10 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Developer: D4_Pratik_Satpute_62758");
		System.out.println("Enter number of Students ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] student=new String[n];
		
		for(int i=0;i<n;i++) 
		{
			System.out.println("Enter Name for Student: "+(i+1));
			student[i]=sc.nextLine();
		}
		for(int j=0;j<n;j++) 
		{
			System.out.println("Name of Student "+(j+1)+" : " +student[j]);
		}
		
		
	}
}
