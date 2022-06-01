package t10_Incapsulation;

public class encp {
	private String name;//data hiding
	private String nam;
	public void setname(String name) {
		this.name=name;
		this.nam=nam;
	}
public String getname() {
return name;

}
	public static void main(String[] args) {
		encp a=new encp();
		a.setname("jaydev");
		
		
		System.out.println(a.getname());
	}

}
