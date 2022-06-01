package t91_abstraction;
abstract class fruit{

	abstract void taste();
	public void m1() {
		System.out.println("i am method M1");
		}
}
class apple extends fruit {

	//@Override
	void taste() {
		
		System.out.println("Taste is little sweet TO");
	}}


public class mango
extends fruit {

	//@Override
	void taste() {
		
		System.out.println("Taste is little sweet");}
	public static void main(String[] args) {
		fruit apple=new apple();
		fruit mango= new mango();
		mango.taste();
		apple.taste();
		mango.m1();

	}

}
