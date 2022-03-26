import java.util.Arrays;
public class Question_13 {
	public static void main(String[] args)
	{
		System.out.println("Developer: D4_Pratik_Satpute_62758");
		String[] arr1 = {"a","d","x","n","b"};
		String[] arr2 = {"c","b","a","d","z"};
		
		for (int i=0; i<arr1.length-1;i++)
		{
			for(int j=0; j<arr2.length ; j++)
			{	
				if(arr1[i].equals(arr2[j]))
				{
					System.out.println("The duplicate elements are :"+arr1[i]);
					break;
				}
			}
		}
	}
}
