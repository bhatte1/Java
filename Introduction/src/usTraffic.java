import demopack.CentralTraffic;
import demopack.IndiaTraffic;

public class usTraffic implements CentralTraffic, IndiaTraffic, BangaloreTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTraffic a = new usTraffic();
		
		a.greenGo();
		a.redStop();
		a.yellowAlert();
		
		
		
		// a.walking() does not work since "waliking" method is created inside ustraffic method but we are implementing methods from CentralTraffic
		
		usTraffic b = new usTraffic();
		
		b.walking();
		
		b.trafficCondition();
		
		b.signals();
		
		b.greenGo();
		
	

		
		
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		
		System.out.println(10);
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println(30);
	}

	@Override
	public void yellowAlert() {
		// TODO Auto-generated method stub
		System.out.println(3);
	}
	
	public void walking() {
		System.out.println(5);
	}

	@Override
	public void trafficCondition() {
		// TODO Auto-generated method stub
		
		System.out.println("The traffic is very horrible in Bangalore");
		
	}

	@Override
	public void signals() {
		// TODO Auto-generated method stub
		System.out.println("Too many signals");
	}

}
