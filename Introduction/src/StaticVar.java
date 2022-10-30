
public class StaticVar {
	
	String name;  //Instance variables
	String city;
	static String country = "USA";   // this belongs to class StaticVar hence it is called class variables
	static int i = 0;  //using static key word, it shares the same memory
	int j = 10;         //not using static key word, it creates new memory every time the integer is called.

	
	
	StaticVar(String name, String city){
		
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar obj = new StaticVar("Vinayak","Morgantown");
		StaticVar obj1 = new StaticVar("Kyle","Morgantown");
		obj.getAddress();
		obj1.getAddress();
	}

}
