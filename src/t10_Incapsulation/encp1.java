package t10_Incapsulation;

public class encp1 {
	private int emp;
	
	public void set(int emp) {
		this.emp=emp;
	}
	public int get() {
		return emp;
	}
	
	public static void main(String[] args) {
		encp1 a=new encp1();
		a.set(100);
		int b=a.get();
		System.out.print(b);

	}

}
