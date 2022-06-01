package t91_abstraction;

interface programming{
	
	public void developer();
	
	}

interface program extends programming {
	public void developr();
	
	}

class C implements programming{

	@Override
	public

	void developer() {
		System.out.println("C Language developed by DENIS RITCHE");
		
	}
	class java1 implements programming{
		

		@Override
		public void developer() {
			System.out.println("JAVA Language developed by JAMES GAUSLING");
			
		}
	}
	class C_PLUS_PLUS implements programming{

		@Override
		public void developer() {
			System.out.println("C++ Language developed by BJARNE STROUSTRUP");
			
		}
		
	}
	 class html implements programming {
		@Override
		public void developer() {
			System.out.println("HTML Language developed by TIM BERNERS LEE");
			
		}
	}

}

public class interfacee  {

	public static void main(String[] args) {
	
		abs1 a=new abs1();
		
	}

}
