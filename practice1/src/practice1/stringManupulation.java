package practice1;

import java.util.ArrayList;
import java.util.Arrays;

public class stringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stringManupulation sm = new stringManupulation();
		sm.getStringManupulated();

	}
	
	
	public void getStringManupulated() {
		
		String aString = "hfdhdlkghl vinayak jeorjepo";
		
		//String[] splitaStrig = aString.split(" ");
		
		ArrayList<String>arrayList = new ArrayList<>(Arrays.asList(aString.split(" ")));
		
		
		
		System.out.println(arrayList.get(1));
		
		
	}

}
