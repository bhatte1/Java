import demopack.CentralTraffic;

public class usTraffic implements CentralTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTraffic a = new usTraffic();
		
		a.greenGo();
		a.redStop();
		a.yellowAlert();
		
		// a.walking() does not work since "waliking" method is created inside ustraffic method but we are using methods from CentralTraffic
		
		usTraffic b = new usTraffic();
		
		b.walking();
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

}
