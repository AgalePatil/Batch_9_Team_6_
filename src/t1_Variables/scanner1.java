package t1_Variables;

import java.util.Scanner;

public class scanner1 {

	public static void main(String[] args) {
		int a,b,c;
		System.out.print("Enter two Numbers:");
		Scanner s=new Scanner(System.in);
		
	a=s.nextInt();
	b=s.nextInt();
	c=a+b;
	System.out.print("The Addition of two nember is:"+c);
	
	}

}
