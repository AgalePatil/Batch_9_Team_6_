package t91_abstraction;
interface it2{void methodm1();}
interface it3{void methodm2();}

public class interfacei implements it2,it3{

	public static void main(String[] args) {
		interfacei s=new interfacei();
		s.methodm1();
		s.methodm2();

	}

	@Override
	public void methodm2() {
		System.out.println("Hello iam methodm2");
	}

	@Override
	public void methodm1() {
		System.out.println("Hello iam methodm1");
	}

}
