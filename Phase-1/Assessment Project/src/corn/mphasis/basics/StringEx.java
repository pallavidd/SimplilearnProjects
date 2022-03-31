package corn.mphasis.basics;

public class StringEx {


	public static void main(String[] args) {
		//0123456789
String s="abcdefdghd";
String s1="abc";

System.out.println("length is "+s.length());
System.out.println("fetch a desired Character at a location "+s.charAt(4));
System.out.println("fetch index of the Character "+s.indexOf('d'));
System.out.println("feach last index of the character "+s.lastIndexOf('d'));
System.out.println("convert to uppercasr "+s.toUpperCase());//lowercase
System.out.println("substring model 1 is "+s.substring(3));
System.out.println("substring model 2 is "+s.substring(3,8));
System.out.println("equals "+s.equals(s));
System.out.println(s.hashCode()+" "+s1.hashCode()+" "+(s==s1));
System.out.println("comparision of strings  "+s.compareTo(s1));

	}

}
