package practice1;

import java.util.ArrayList;
import java.util.Arrays;

public class stringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stringManupulation sm = new stringManupulation();
		//sm.getStringManupulated();

		
		sm.getString("Vinayak");
	}
	
	
	public void getStringManupulated() {
		
		String aString = "hfdhdlkghlvinayakjeorjepo";
		
		//String[] splitaStrig = aString.split(" ");
		
		ArrayList<String>arrayList = new ArrayList<>(Arrays.asList(aString.split("")));
		
		String vinString = aString.substring(10,17);
		 
		String joinArrayList = String.join("", arrayList);
		
		
		System.out.println(arrayList);
		
		System.out.println(joinArrayList);
		
		
	}
	
	
	public void getString(String string) {
		String string1 = "Vinayak";
		
		if(string1 == string) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		
	}

}
