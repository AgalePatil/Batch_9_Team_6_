package t5_loopingstatement;

public class dowhile {

	public static void main(String[] args) {
		int fact=1;
		int num=5;
		int i=1;
	
		do {
		fact=fact*i;
		i++;
		
		}
		while(i<=num);
		System.out.println(fact);
	}
}
