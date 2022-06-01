package t11Polymorphism;

public class ovrloading {

	
	public static void get() {
		
		
		System.out.println("NO Argument");	
	}

	public static void get(int a) {
		System.out.println("Integer argument ");	
	}

	public static void get(String a) {
		System.out.println("String argument ");	
	}
	public static void get(String a,int b) {
		System.out.println("String+integer argument ");	
	}
	
	
	public static void main(String[] args) {
		
		ovrloading driver=new ovrloading();
		driver.get();
		driver.get(10);
		driver.get("hiii");
		driver.get("hello", 010);
		
		
	}

}
