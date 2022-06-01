package t7_Constructor;

public class parametrizedconstructor {
	String s;int a;
	parametrizedconstructor(String s,int a){
		this.s=s;
		this.a=a;
	}
	public static void main(String[] args) {
		
		parametrizedconstructor e1=new parametrizedconstructor("Ankush",101);
		System.out.println(e1.s+"        "+e1.a);
	
	parametrizedconstructor e2=new parametrizedconstructor("Ankus",2147483647);
	System.out.println(e2.s+"        "+e2.a);
	}
}
