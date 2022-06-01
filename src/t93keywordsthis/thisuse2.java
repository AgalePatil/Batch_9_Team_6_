package t93keywordsthis;

public record thisuse2() {
	public void m1() {
		this.m2();
		System.out.println("hi am method m1");
		
	}
	public void m2() {System.out.println("hi am method m2");}

	public static void main(String[] args) {
		thisuse2 t=new thisuse2();
		t.m1();
		
		
	}

}
