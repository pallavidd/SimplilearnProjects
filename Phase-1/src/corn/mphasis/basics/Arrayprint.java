package corn.mphasis.basics;
import java.util.Scanner;

public class Arrayprint {
private static int[][] a;

@SuppressWarnings("resource")
public static void main(String[]args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("enter no of rows");
	int rows=sc.nextInt();
	System.out.println("enter no of column");
	int colum=sc.nextInt();
	@SuppressWarnings("unused")
	int row=sc.nextInt();
	for(int i=0;i<rows;i++) {
		for(int j=0;j<colum;j++) {
			//a[i][j]=sc.nextInt();
			System.out.println("enter the value of "+i+"rows and"+j+"col");
			//a[i][j]=sc.nextInt();
			

		}
			
	}
	for(int i=0;i<rows;i++) {
		for(int j=0;j<colum;j++)
		{
			//System.out.println(a[i][j]);
			
		}
	}
}

public static int[][] getA() {
	return a;
}

public static void setA(int[][] a) {
	Arrayprint.a = a;
}
}







