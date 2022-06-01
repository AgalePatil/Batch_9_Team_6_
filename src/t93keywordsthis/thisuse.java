package t93keywordsthis;

public class thisuse {
	int a;
	public void m1(int a) {this.a=a;}
	public void m2() {System.out.println(a);}
	public static void main(String[] args) {
		thisuse t=new thisuse();
		t.m1(101);
		t.m2();

	}

}
