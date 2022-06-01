package t10_Incapsulation;

public class encps {
	private int a;
	public void seta(int a) {
		this.a=a;
		}
	public int  geta() { return a;
		
		}

	public static void main(String[] args) {
	encps s=new encps();
           s.seta(532);
           System.out.println(s.geta());
	

	}

}
