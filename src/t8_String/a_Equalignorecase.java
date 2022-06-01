package t8_String;

public class a_Equalignorecase {

	public static void main(String[] args) {
		String a="Jerry";
		String b="JeRry";
		System.out.println(a.equalsIgnoreCase(b));
		if(a.equalsIgnoreCase(b)) {
			System.out.print("True");
			}
		else {
			System.out.print("false");
			}
	}

}
