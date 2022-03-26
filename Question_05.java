import java.util.Scanner;
public class Question_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Developer: D4_Pratik_Satpute_62758");
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter the Character: ");
		ch =sc.next().charAt(0);
		//char java.lang.String.charAt(int index)
		if( ch >=65  && ch <=90)
			{
				System.out.println("Charcter is Uppercase");
			}
		else if(ch>= 97 && ch<=122)
		{
			System.out.println("Character is lowercase");
		}
		else if(ch>=48 && ch<=57) {
			System.out.println("Entered input is digit");
		}else
			System.out.println("other");
	}

}
