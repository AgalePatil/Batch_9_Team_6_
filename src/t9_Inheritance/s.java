package t9_Inheritance;
class v1{
	v1(){ 
		System.out.println("Hello i am clss v1 constructor");
	}
	v1(int z){ 
		System.out.println("Hello i am clss v1 argu constructor");
	}
	
}
class v extends v1{
	v(){ 
		System.out.println("Hello i am clss v constructor");
	}
	v(int z){ 
		System.out.println("Hello i am clss v argu constructor");
	}
	
}
public  class s extends v {
         s() {System.out.println("Hello"); }
         s(int a) {System.out.println("Hiii");}
         s(int b,int bh) {System.out.println("TATA");}
         s(int c,int d,int f) {System.out.println("BYE BYE");}  

	public static void main(String[] args) {
		s d=new s();
		s E=new s(10);
		s F=new s(10,20);
		s T=new s(10,10,10);
		
		}
}
