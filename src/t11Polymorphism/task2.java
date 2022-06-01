package t11Polymorphism;

import java.util.Scanner;
public class task2 {
public void m1(String a,String b) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter First String:");
	a=s.nextLine(); 
	System.out.println("Enter Second string:");
	b=s.nextLine(); 
	if(a.equalsIgnoreCase(b)) {System.out.println("Both string are equal:");}
	
	else {System.out.println("Both string are not equal:");}
	System.out.println("******************************************************");
}
public void m1(int a,int b) {
	System.out.println(a);
	System.out.println(b);
	if(a==b) {System.out.println("Both A&B are equal");}
	else {System.out.println("Both A&B are not equal");}
	System.out.println("******************************************************");
}
public void m1() {
	// string reverse
	String str;
	String rev="";
	Scanner s=new Scanner(System.in);
	System.out.println("Enter String   :");
	str=s.nextLine(); 
	int len=str.length();
for(int i=len-1;i>=0;i--) {
rev=rev+str.charAt(i);
}
System.out.println("Reversed of String:"+str+ "    is  : "   +rev);
System.out.println("******************************************************");
}
public void m1(String a,int b,String c) {//String is palindrome or not
	if(a.equals(c)) {System.out.println("Given string is Palindrome");}
	else {System.out.println("Given string is not Palindrome");	}
}
	public static void main(String[] args) {
		task2 s=new task2();
		s.m1(null, null);
		s.m1(5, 6);
		s.m1();
		s.m1("NAN", 0, "NAN");
		}}
