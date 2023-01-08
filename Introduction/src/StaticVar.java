
public class StaticVar {
	
	String name;  //Instance variables
	static String city;
	static String country = "USA";   // this belongs to class StaticVar hence it is called class variables
	static int i = 0;  //using static key word, it shares the same memory
	int j = 10;         //not using static key word, it creates new memory every time the integer is called. No sharing is happening.

	
	
	public StaticVar(String name, String city){
		
		this.name = name;   //called local variables
		this.city = city;
		i++;
		j++;
		System.out.println(i);
		System.out.println(j);
	
	}
	
	public void getAddress() {
		
		System.out.println(name + " "+country);
		
	}
	
	public static void getCity() {
		
		System.out.println(city);   // static methods will accept only accept static variables.
	}
	
	public static void main(String [] args){

	  {
		// TODO Auto-generated method stubwhat is fibo

		StaticVar obj = new StaticVar("Vinayak","Morgantown");
		StaticVar obj1 = new StaticVar("Kyle","Morgantown");    
		obj.getAddress();
		obj1.getAddress();		// getAddress is not static hence we need to create an object of the class and then call getAddress. 
		StaticVar.getCity();      // no need to create object of a class for static methods. Directly we can access using class name dot.
		obj.name = "Bob";        	//if it is non static. this is the way to call
		StaticVar.country = "India"; //if it is static this is the way to call
		
	}
	  
	}

}
