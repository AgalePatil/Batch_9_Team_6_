package t10_Incapsulation;

public class e {
private char A;
public void get(char A) {this.A=A;}
public char set() {return A;}	public static void main(String[] args) {
		// TODO Auto-generated method stub
e s=new e();
s.get('b');
System.out.println(s.set());
	}
public char getA() {
	return A;
}
public void setA(char a) {
	A = a;
}

}
