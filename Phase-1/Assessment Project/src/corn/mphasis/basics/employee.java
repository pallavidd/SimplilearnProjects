package corn.mphasis.basics;

import java.util.Scanner;

public class employee {
	//public static void main(String[]args) { 
		  
	private float salary, hours;
	
	public void employeeDetail() {
		salary = 0;
		hours = 0;
	}
	
	public void getInfo(String n, float sal, float hr) {
		salary = sal;
		hours = hr;
	}
	
	public float AddSal() {
		if(salary<500) {
			salary = salary + 10;
		}
		return salary;
	}
	
	public float AddWork() {
		if(hours > 6) {
			salary = salary + 5;
		}
		return salary;
	}
}

class Testemployee {
	float salary;
	
	public Testemployee(float sal) {
		salary = sal;
	}
	
	public void printSal() {
		System.out.println("Salary : " + salary);
	}
}

class employees
{
	@SuppressWarnings("resource")
	public static void main (String[] args)
	{
		employee emp = new employee();
		
		/* taking input of employee details */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter salary");
		float salary = sc.nextFloat();
		System.out.println("Enter no. of hours of work");
		float hours = sc.nextFloat();
		
		/* calling methods of EmployeeDetail class */
		emp.getInfo(name, salary, hours);
		salary = emp.AddSal();
		salary = emp.AddWork();
		
		Testemployee test = new Testemployee(salary);  /* pass salary obtained from the methods of the EmployeeDetail class as parameter */
		test.printSal();  /* calling method of TestEmployee class to print final salary */
	}
}
