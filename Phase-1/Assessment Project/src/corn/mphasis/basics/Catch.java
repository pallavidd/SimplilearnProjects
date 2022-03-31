package corn.mphasis.basics;

public class Catch {
public static void main(String[]args) {
	System.out.println("hi");
	try {
		int b[]= {2,3,4,5,6};
		b[7]=50;
		int a=50/0;
	}
	catch(Exception e) {
		System.out.println(e);
		
	}
	finally {
		System.out.println("finally block exicuted");
		
	}
	System.out.println("hello");
	
}
}
