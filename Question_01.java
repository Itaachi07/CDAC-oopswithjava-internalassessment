/*Write a program to input n numbers on command line argument and
 calculate maximum of them
 */
public class Question_01 
{public static void main(String[] args) 
{	
	 System.out.println("Developer: D4_Pratik_Satpute_62758");
	 double Maximum = Double.parseDouble(args[0]);
	 // input 50 63 75 35 88 13
	System.out.println("Number of arguments = " +args.length); 
	
	for(int i =1; i< args.length; i++)
	
	{
		if(Double.parseDouble(args[i]) > Maximum )
		{
			Maximum = Double.parseDouble(args[i]);
		}
	}
		System.out.println("Maximum number is : "+ Maximum);
}
}
