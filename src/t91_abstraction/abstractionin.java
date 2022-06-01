package t91_abstraction;

interface it11{
	void m1();
	int a=1;
	default void m2() {System.out.println("Hello iam m2");}
	private void m4() {System.out.println("Hello iam m4");}
	}



public class abstractionin implements it11 {

	@Override
	public void m1() {
		System.out.println("Hello iam m1");
		
	}

	public static void main(String[] args) {
		it11 s=new abstractionin();
		s.m1();
		s.m2();
		System.out.println(it11.a);
		
	}

}
