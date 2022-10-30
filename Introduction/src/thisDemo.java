
public class thisDemo {

	int a = 5;
	
	public void getData() {
		int a = 3;
		
		System.out.println(this.a);   //this.a returns the global variable
		
		int b = a + this.a;
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisDemo td = new thisDemo();
		td.getData();
	}

}
