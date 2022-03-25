
import java.util.Scanner;
class Employee
	{
		private String name1;
		private String name2;
		private double salary;
		private double raise;
		public Employee(String name1,String name2, double salary, double raise)
		{
			this.name1=name1;
			this.name2=name2;
			if(salary>0) 
				{
				  this.salary=salary;
				}
			this.raise=raise;
		}

		public String getName1() {
			return name1;
		}

		public void setName1(String name1) {
			this.name1 = name1;
		}

		public String getName2() {
			return name2;
		}

		public void setName2(String name2) {
			this.name2 = name2;
		}

		public double getSalary() {
			
			return salary;
		}

		public void setSalary(double salary) {
			if(this.salary>0) 
			{
			  this.salary=salary;
			}
		
		}
		void disp()
		{
			System.out.println("First name: " +this.name1+ "  Last name: "+this.name2+ "   Salary: "+this.salary);
		}
		void raise() 
		{
			
			if (this.salary>0)
				{this.salary= this.salary*1.1 ;
			System.out.println("\t Salary of " +this.name1+ " "+this.name2+" after raise: " +this.salary );}
			else
			{
				System.out.println("No raise for "+this.name1+ " " +this.name2);
			}
			//System.out.println("Salary of " +this.name1+ " " Last name: "+this.name2+ "   Salary: "+this.salary);
			System.out.println("\t Yearly salary of "+this.name1+ " is " +this.salary*12);
		}
	}
public class EmployeeTest {

	public static void main(String[] args) {
		System.out.println("Developer: D4_Pratik_Satpute_62758");
		Scanner sc= new Scanner(System.in);
		Employee e1=new Employee("Pratik", "Satpute", 10000, 0);
		Employee e2= new Employee("Ash","Lee",15000, 0);
		e1.disp();
		e1.raise();
		e2.disp();	
		e2.raise();

	}

}
