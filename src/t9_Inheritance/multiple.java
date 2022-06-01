package t9_Inheritance;

class pan{void m1(){System.out.println("m1");}}
class pan2 {void m1(){System.out.println("m1");}}

public class multiple extends pan{
	
	//public class multiple extends pan2{}

	public static void main(String[] args) {
		multiple s=new multiple();
		s.m1();
	}

}
