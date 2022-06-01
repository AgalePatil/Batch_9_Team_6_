package t93keywordsthis;

public class thisuse3 {
	thisuse3() {
		System.out.println("I AM NON PARAMETer CONSTRUCTOR");
	}
	thisuse3(int a){
		this();
		System.out.println("I AM PARAMETRIZED CONSTRUCTOR");
	}
	public static void main(String[] args) {
		thisuse3 s=new thisuse3(032356);
	}

}
