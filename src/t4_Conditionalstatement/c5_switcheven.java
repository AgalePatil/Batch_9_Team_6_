package t4_Conditionalstatement;

import java.util.Scanner;

public class c5_switcheven {

	public static void main(String[] args) {
		int pwd;
		Scanner s=new Scanner(System.in);
        pwd=s.nextInt();

		
		
		
		switch (pwd) {
		case 1432:System.out.println(pwd);
          break;
          
		case 1465:System.out.println(pwd);
        break;
        
		case 1234:System.out.println("Password is correct"+pwd);
        break;
        
          
          
		case 1243:System.out.println(pwd);
        break;
        
          
		case 1123:System.out.println(pwd);
        break;
        default:System.out.println("Wrong password");
          break;
          
          
          
          
          
          
		}
	}

}
