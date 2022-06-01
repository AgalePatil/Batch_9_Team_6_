package t3_Operator;

public class operator {
   public void arth(){
	int a=1,b=2;
	int c=a+b;
	int d=a-b;
	int e=a*b;
	int f=a%b;
	int g=a/b;
	System.out.println(a+"     "+b+"      "+c+"     "+d+"       "+e+"   "+f+"   "+g);
	}

	public static void main(String[] args) {
	operator a=new operator();
	a.arth();

	}

}
