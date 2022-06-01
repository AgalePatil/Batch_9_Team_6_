package t10_Incapsulation;

public class bank {
	private int a;
	private void m1() {System.out.println(" I am m1");}
public static void main (String[]args) {
	
	bank s=new bank();
	s.setA(100);
	s.getA();
}
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
	System.out.println(a);
}
}
