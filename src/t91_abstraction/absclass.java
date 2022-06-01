package t91_abstraction;
abstract class animal{
	void legs() {}
	
	abstract void sound();	
	abstract void eat();	
}
class dog extends animal {

	@Override
	void sound() {
		System.out.println("Bow Bow");		
	}

	@Override
	void eat() {
	System.out.println("meat eating");
	}

}
class cow extends animal{

	@Override
	void sound() {
		System.out.println("OOOO.....OOOO");	
	}

	@Override
	void eat() {
		System.out.println("grass  eating");
		
	}	
}
public class absclass {

	public static void main(String[] args) {
		dog d=new dog();   d.eat(); d.sound();d.legs();	
		cow c=new cow();    c.eat(); c.sound();c.legs();	
	
	}

}
