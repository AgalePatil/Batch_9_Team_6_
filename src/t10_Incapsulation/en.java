package t10_Incapsulation;

public class en {

	private int a;
	public void set(int a) {this.a=a;}
	public int get() {
		return a;
	}
	public static void main(String[] args) {
		en s=new en();
		s.set(10);
		System.out.println(s.get());
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}

}
