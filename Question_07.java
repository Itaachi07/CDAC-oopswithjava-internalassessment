/*Write a java program to accept a number from user using command line argument and display its table.
 */
public class Question_07 
{
	public static void main(String[]args)
	 {
		 System.out.println("Developer: D4_Pratik_Satpute_62758");
		 System.out.println("Enter the Number");
		 int n=Integer.parseInt(args[0]);
		 int i, a;
		 System.out.println("Table is");
		 for(i=1; i<=10; i++)
		 {
			 a=n*i;
			 System.out.println(a);
		 }
		 
	 }

}
