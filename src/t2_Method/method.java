package t2_Method;

public class method {
	public void m1() {System.out.println("Hii i am method m1");}//instance method
	public static void m2() {System.out.println("Hii i am method m2");
	}//static method

	public static void main(String[] args) {
	
	}
public static void call(){
	method s=new method();
	s.m1();
	s.m2();
	method.m2();
	
}
}
