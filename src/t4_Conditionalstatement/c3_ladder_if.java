package t4_Conditionalstatement;

import java.util.Scanner;

public class c3_ladder_if {
	public static void main(String[] args) {
		int a;
		 System.out.println("Enter A number:");
		Scanner s=new Scanner(System.in);
                 a=s.nextInt();
            if(a%2==0)    { System.out.println("IS An Even number:");} 
            else if(a%2!=0) {System.out.println(a);}
            else if(a==2) {System.out.println(a);}
            else {System.out.println("IS A ODD number:");}
                 
                 
	}
}
