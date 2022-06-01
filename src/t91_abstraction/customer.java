package t91_abstraction;
interface vehical{
	String name="TVS";//when we declared any variablesby default it consider as a public static final
	int speed=100;//public static final
	void start();//by default consider method as apublic abstract
	void stop();	
}

public class customer implements vehical {

	

	@Override
	public void start() {
		System.out.println("Start():Insert Key and pressss start button");
		
	}

	@Override
	public void stop() {
		System.out.println("stop():Exit key");
		
	}
	
public class cust implements vehical {

		@Override
		public void start() {
			System.out.println("Start():Insert Key and prss start button");
			
		}

		@Override
		public void stop() {
			System.out.println("stop():Exit key");
			
		}		
	}
	
	
	
	

public static void main(String[] args){
vehical c=new customer();
		c.start();          c.stop();
		System.out.println(name);
		System.out.println(speed);
	}
}
