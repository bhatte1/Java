
public class constructorDemo {
	
	//executes a block of code whenever an object is created
	//name of the constructor should be class name
	
	
	/*public constructorDemo(){  
		System.out.println("I am the constructor");
		
		//constructor does not return anything.
		
	}*/
	
	//parameterized constructor
	
	public constructorDemo(int a , int b) {
		
		System.out.println("I am in parameterized constructor" + a + b);
	}
	
public constructorDemo(String str) {
		
		System.out.println("I am in " + str);
	}

	public void getData() {
		System.out.println("I am the method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//compiler will call default implicit constructor if you have not defined constructor block
		
		constructorDemo cd = new constructorDemo(5,6);
		constructorDemo dc = new constructorDemo("Vin");
		constructorDemo cc = new constructorDemo();  // check for the important concept here
		cd.getData();

	}

}
