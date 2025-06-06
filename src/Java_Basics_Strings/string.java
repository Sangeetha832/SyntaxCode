package Java_Basics_Strings;

public class string {
public static void main(String[] args) {
	String a = new String("name");
	String b = new String("name");
	String e = "name";
	String c = b;
	System.out.println(b==e);
	System.out.println(a==b);
	System.out.println(a.equals(b));
	String d = a.concat(" first");
	System.out.println(c==b);
	System.out.println(c.equals(b));
	
	int i = 2;
	int j = 3;
	System.out.println(i==j);
	System.out.println(a);
	System.out.println(d);
}
}
