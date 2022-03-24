import java.util.Scanner;

/*	Write a program to calculate the grade of a student. There are five
	subjects. Marks in each subject are entered from keyboard. Assign grade
	based on the following rule: 
	Total Marks >=  Grade: Ex
	90 > Total Marks >= 80 	Grade: A
	80 > Total Marks >= 70 	Grade: B
	70 > Total Marks >= 60 	Grade: C
	60 > Total Marks 		Grade: F
 */
public class Question_04 {

	public static void main(String[] args) 
	{	
		
		int Maths, English, History, Science,Marathi;
		int Total_marks;
		char grade;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the marks otained in Maths  ");
		Maths = sc.nextInt();
		System.out.println("Enter the marks otained in English  ");
		English= sc.nextInt();
		System.out.println("Enter the marks otained in History  ");
		History=sc.nextInt();
		System.out.println("Enter the marks otained in Science  ");
		Science=sc.nextInt();
		System.out.println("Enter the marks otained in Marathi  ");
		Marathi=sc.nextInt();
		Total_marks= ((Maths + English+ History+Science+Marathi )/5);
		System.out.println("Developer: D4_Pratik_Satpute_62758");
		System.out.println("Total Marks obtained: "+Total_marks);
		
		if( 90>Total_marks && Total_marks>80)
			System.out.println("Grade is A");
		
		else if (80>Total_marks && Total_marks>70)
			System.out.println("Grade is B");
			
		else if (70>Total_marks && Total_marks>60)
			System.out.println("Grade is C");
		
		else if (60>Total_marks )
			System.out.println("Grade is F");
	}

}
