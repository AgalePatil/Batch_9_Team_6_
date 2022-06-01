package t4_Conditionalstatement;

import java.util.Scanner;

public class else_if {

	public static void main(String[] args) {
		int marks;
		System.out.print("ENTER YOUR MARKS:");
		Scanner s=new Scanner(System.in);
         marks=s.nextInt();
         if(marks>=50&&marks<60) {
        	 System.out.print("YOU ARE PASSED WITH GRADE'D'");
         }
         
         else if(marks>=60&&marks<70) {
        	 System.out.print("YOU ARE PASSED WITH GRADE'C'"); 
         }
         
         else if(marks>=70&&marks<80) {
        	 System.out.print("YOU ARE PASSED WITH GRADE'B'"); 
         }
         
         else if(marks>=80&&marks<90) {
        	 System.out.print("YOU ARE PASSED WITH GRADE'A'");
         }
         
         else if(marks>=90&&marks<=100) {
        	 System.out.print("YOU ARE PASSED WITH GRADE'A+'");	 
         }
         else {
        	 System.out.print("YOU ARE FAIL"); 
         }
	}
}
