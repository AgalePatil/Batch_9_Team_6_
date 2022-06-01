package t5_loopingstatement;

import java.util.Scanner;

public class factwhile {

	public static void main(String[] args) {
		int num;
		System.out.print("ENTER YOUR number:");
		Scanner s=new Scanner(System.in);
         num=s.nextInt();
         int fact=1;
         int i=1;
         while(i<=num) {
        	 fact=fact*i;
        	 i++;
        	 System.out.print("      "+fact);
         }
	}

}
