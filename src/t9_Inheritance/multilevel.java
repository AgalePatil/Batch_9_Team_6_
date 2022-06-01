package t9_Inheritance;
 class a{
	 static void m1() {System.out.println(" I am a class method");}
 }
class b extends a{
	static void m2() {System.out.println(" I am b class method");}
}
class c extends b{
	static void m3() {System.out.println(" I am c class method");}
}


class d extends c{
	static void m4() {System.out.println(" I am d class method");}
}

class e extends d{
	static void m5() {System.out.println(" I am e class method");}
}

class f extends e{
	static void m6() {System.out.println(" I am f class method");}
}

public class multilevel extends f {

	public static void main(String[] args) {
		
		multilevel s=new multilevel();

		
		multilevel.m1();
		multilevel.m2();
		multilevel.m3();
		multilevel.m4();
		multilevel.m5();
		multilevel.m6();
	}

}
