package t11Polymorphism;

import java.util.Scanner;
public class task1 {
	//use 3 methods for overloading
	public void arth(int a,int b,int c) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=s.nextInt();
		System.out.println("Enter the value of b:");
		b=s.nextInt();
		c=a+b;
		System.out.println("Addition is : "+c);
		System.out.println("******************************************************");
	}
	public void arth(float a1,int b,int c) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of b:");
		b=s.nextInt();
		System.out.println("Enter the value of c:");
		c=s.nextInt();
		a1=b-c;
		System.out.println("Substraction is  : "+c);
		System.out.println("******************************************************");
	}
	public void arth(long a,int b,int c) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of b:");
		b=s.nextInt();
		System.out.println("Enter the value of c:");
		c=s.nextInt();
		a=b%c;
		System.out.println(a);
		if(b%c==0) {System.out.println("Even number");}
		else {System.out.println("Odd number");}
	}
public static void main(String[] args) {
		task1 s=new task1();
		s.arth(0, 0, 0);
		s.arth(2.1f, 0, 0);
		s.arth(100000l, 0, 0);
}}
