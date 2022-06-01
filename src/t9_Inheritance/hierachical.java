package t9_Inheritance;

 class can{
	
	void m1() {System.out.println("I am can class method");}
}
 class child1 extends can{void m2() {System.out.println("I am can child 1 method");}}

public class hierachical extends can {
	

	public static void main(String[] args) {
		hierachical g=new hierachical();
		
		g.m1();
		child1 d=new child1();
		d.m1();
		d.m2();
		
	}

}
