import java.util.Scanner;

public class Question_06 {
	static Scanner sc=new Scanner(System.in);
	public static void accept(int arr1[][])
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
	}
	
	public static void display(int arr1[][])
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void multiply(int arr[][],int arr1[][])
	{
		int mul[][]=new int[arr.length][arr1[0].length];
		if(arr[0].length==arr1.length)
		{
			for(int i=0;i<arr.length;i++)
			{
			  for(int j=0;j<arr1[0].length;j++)
			  {	int add=0;
				for(int k=0;k<arr[0].length;k++)
				{
					add=add+(arr[i][k]*arr1[k][j]);
					mul[i][j]=add;
				}
			  }	
			}
			
		 display(mul);	
		}
		else
			System.out.println("Multiplication of matrix can not be done");
	}
	
	

	public static void main(String[] args) {
		System.out.println("Developer: D4_Pratik_Satpute_62758");
		System.out.println("Enter Rows n Columns of First array");
		int [][] arr1=new int[sc.nextInt()][sc.nextInt()];
		System.out.println("Enter Rows n Columns of Second array");
		int [][]arr2=new int[sc.nextInt()][sc.nextInt()];
		System.out.println("Enter Elements for Arr1");
		accept(arr1);
		System.out.println("Enter Elements for Arr2");
		accept(arr2);
		System.out.println("Displaying First Array");
		display(arr1);
		System.out.println("Displaying Second Array");
		display(arr2);
		System.out.println("Multiplied Matrix");
		System.out.println("Developer: D4_Pratik_Satpute_62758");
		multiply(arr1,arr2);
	}

}
