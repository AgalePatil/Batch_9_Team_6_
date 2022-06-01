package t11Polymorphism;

public class first {

	public void m1( int a,String name) {
		System.out.println("First one is executed");
	}
	
	public void m1(int a,int b) {
		System.out.println("Second one is executed");
	}
	
	
	public static void main(String[] args) {
		first s=new first();
		s.m1(2,5);
		System.out.println();
		s.m1(0, null);

	}

}
