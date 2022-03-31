package corn.mphasis.basics;

public class Student {
@SuppressWarnings("unused")
private int sid;
@SuppressWarnings("unused")
private String sname;

public Student(int i, String string) {
		// TODO Auto-generated constructor stub
	
int sid = 0;
String sname = null;
this.sid=sid;
this.sname=sname;
return;
}




public static void main(String[] args) {
Student s1=new Student(1,"sandip");
Student s2=new Student(1,"nitasha");
Student s3=new Student(1,"savita");
Student s[]=new Student[3];
s[0]=s1;
s[1]=s2;
s[2]=s3;
for(Student ss:s){
	System.out.println(ss);
	
		




}
}
}

