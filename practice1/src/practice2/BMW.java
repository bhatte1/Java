package practice2;

public class BMW extends Car {
	
	
	public BMW() {
		//super();
		System.out.println("BMW Const");
	}
	
	
	@Override
	public void start() {
		
		System.out.println("BMW -- Start");
	}

	public void xdrive() {

		System.out.println("BMW -- xdrive");
	}
	
	@Override
	public void wheels() {
		System.out.println("BMW has --- aluminum four wheels");
	}
	
	
	public void brakes() {
		System.out.println("BMW ---- brakes");
	}

}
