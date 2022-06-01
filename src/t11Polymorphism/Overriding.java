package t11Polymorphism;
class firstt {
	public void m1() {
		System.out.println("This is first class");
	}
}
class second extends firstt{public void m1() {System.out.println("This is second class");}}
class third extends second{public void m1() {System.out.println("This is Third class");}}

public class Overriding extends third {
	public void m1() {System.out.println("This is final class class");}

	public static void main(String[] args) {
		
		Overriding a=new Overriding();
		a.m1();
		third b=new third();
		b.m1();
		second c=new second();
		c.m1();
		firstt d=new firstt();
	}

}
