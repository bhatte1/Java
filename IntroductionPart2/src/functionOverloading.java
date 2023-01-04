
public class functionOverloading {
	
	public void getData(int a) {
		
		System.out.print(a);
	}
	
	public void getData(int b,String a) {
		System.out.println(a);
		System.out.print(b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		functionOverloading fl = new functionOverloading();
		
		fl.getData(10,"vin");

	}

}
