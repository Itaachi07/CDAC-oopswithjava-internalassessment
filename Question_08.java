import java.util.Scanner;

/*
Write a Java Application to read the name of a student (studentName),
roll Number (rollNo) and marks (totalMarks) obtained. rollNo may be an 
alphanumeric string. Display the data as read */

class Student
{
	Scanner sc= new Scanner(System.in);
	private String studentName;
	private String rollNo;
	private double totalMarks;
	
	public Student() { }

	public Student(String studentName, String rollNo, double totalMarks) {
		super();
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.totalMarks = totalMarks;
	}
 
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}

	void accept()
	{
		System.out.println("Enter Name of Student: ");
		this.setStudentName(sc.nextLine());
		System.out.println("Enter Roll no of Student: ");
		this.setRollNo(sc.next());
		System.out.println("Enter total marks of Student: ");
		this.setTotalMarks(sc.nextInt());
		
	}
	
	void disp()
	{
		System.out.println("Name of Student: "+this.getStudentName());
		System.out.println("Roll Number of Student: "+this.getRollNo());
		System.out.println("Total marks of Student: "+this.getTotalMarks());
	}
	
	
}

public class Question_08 {

	public static void main(String[] args) 
	{
		Student st = new Student();
		st.accept();
		System.out.println("Developer: D4_Pratik_Satpute_62758");
		System.out.println("Displaying Student Data: ");
		st.disp();

	}

}
