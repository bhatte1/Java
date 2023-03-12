package practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectReference {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		ObjectReference or = new ObjectReference();
		
		
		or.name = "shshank";
		or.age=30;
		or.city = "Portland";
		
		System.out.println(or.name + " "+ or.age + " "+ or.city);
		
		
		//no reference objects -- not recommended at all
		
		
		new ObjectReference().name = "Radhe";
		
		new ObjectReference().name = "Salman";
		
		
		
	    System.out.println(new ObjectReference().name);
	    
	    or.getNoReturn();
		
		

	}
	
	public void getNoReturn() {
		
		System.out.println("Vinayak");
		
		return;
	}

}
