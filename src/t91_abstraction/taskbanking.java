package t91_abstraction;
abstract class bank {
	abstract void doc();
	abstract void ROI();
	public void m1() {}
}
	class SBI extends bank{
		void doc() {
            System.out.println("Documents required for oppening account in SBI bank:");
			System.out.println("1)Adhar card 2)pan card 3)voter id 4)2 passport size photo 5)Electricity bill");	
		}

		void ROI() {
			System.out.println(" ROI For SBI: 5%");
			System.out.println("***********************************************************************");
		}
	}
class AXIS extends SBI{
	void doc() {
		 System.out.println("Documents required for oppening account in AXIS bank:");
			System.out.println("1)Adhar card 2)pan card 3)voter id 4)2 passport size photo 5)Electricity bill");
	}
	void ROI() {
		System.out.println(" ROI For AXIs: 6%");
		System.out.println("***********************************************************************");
	}
}
class ICICI extends AXIS {
	void doc() {
		 System.out.println("Documents required for oppening account in ICICI bank:");
			System.out.println("1)Adhar card 2)pan card 3)voter id 4)2 passport size photo 5)Electricity bill");
	}
	void ROI() {
		System.out.println(" ROI For ICICI: 5%");
		System.out.println("***********************************************************************");
	}
	}
class KOTAK extends ICICI{
	void doc() {
		 System.out.println("Documents required for oppening account in SBI bank:");
			System.out.println("1)Adhar card 2)pan card 3)voter id 4)2 passport size photo 5)Electricity bill");
	}
	void ROI() {
		System.out.println(" ROI For KOTAK: 5%");
		System.out.println("***********************************************************************");
	}
}




public class taskbanking {

	public static void main(String[] args) {
		bank SBI=new SBI();
		
		bank AXIS=new AXIS();
		bank ICICI=new ICICI();
		bank KOTAK=new KOTAK();
		SBI.doc();
		SBI.ROI();
		AXIS.doc();
		AXIS.ROI();
		ICICI.doc();
		ICICI.ROI();
		KOTAK.doc();
		KOTAK.ROI();
	}

}
