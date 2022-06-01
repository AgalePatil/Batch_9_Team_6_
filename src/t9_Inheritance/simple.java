package t9_Inheritance;
class parrentt {
	
	void m2(){
		System.out.print("hello");
		}
}

public class simple extends parentt{
	
	void m1() {
		System.out.print("hiii");
		}

	public static void main(String[] args) {
		
			simple a=new simple();
		a.m1();
		a.m1();
		
	}
}
