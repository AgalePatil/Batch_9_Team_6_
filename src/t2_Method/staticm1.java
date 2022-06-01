package t2_Method;



public class staticm1 {
	public static void m1() {
		int a=20;
	    int b=50;
	    int c=a+b;
	    System.out.println(c);
	    int d=a-b;
	    System.out.println(d);
	    int e=a*b;
	    System.out.println(e);
	    int f=a/b;
	    System.out.println(f);
	    int g=a%b;
	    System.out.println(g);
	}
	public static void main(String[] args) {
		staticm1 a=new staticm1();
		            a.m1();// first way to call static method
		            
		 staticm1.m1(); //FOR CALLING STATIC METHOD
	}

}
