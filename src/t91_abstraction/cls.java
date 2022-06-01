package t91_abstraction;
interface it1{
	public abstract void m1();
	public static int a=1;
	default void m2() {System.out.println("hii i am m2()");}
	public static void m3() {System.out.println("hii i am m3()");}
	private void m4() {System.out.println("hii i am m4()");}	
}

public class cls implements it1 {
	public void m1() {
		System.out.println("hii i am m1()");
		
	}

	public static void main(String[] args) {
		 it1 c=new cls();
		 c.m1();
		 c.m2();
		 it1.m3();
		 System.out.println(it1.a);
	}
	
	

}
