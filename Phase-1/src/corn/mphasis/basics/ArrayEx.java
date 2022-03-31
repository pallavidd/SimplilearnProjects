package corn.mphasis.basics;

import java.util.Scanner;

public class ArrayEx {

	private static String empname;
	private static long empsalary;
	private static String emplocation;
	private static int empmob;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int empno;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of empno");
		empno=sc.nextInt();
		System.out.println("enter the values of empname");
		empname=sc.next();
		
		
		System.out.println("enter the values of empsalary");
		empsalary=sc.nextInt();
		System.out.println("enter the values of emplocation");
		emplocation=sc.next();
		System.out.println("enter the values of empmob");
		empmob=sc.nextInt();
		
		
		System.out.println(empno+" "+empname+"salary"+"location+"+"mob+");
		// TODO Auto-generated method stub

	}

}
