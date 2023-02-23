package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class Concept {

	public static void main(String[] args) {
		 
		Concept c = new Concept();
		ArrayList<String> employeenames = c.getCompanyEmp("Amazon");
		
		System.out.println(employeenames);
		
	

	}
	
	
	public ArrayList<String> getCompanyEmp(String companyName) {
		
	
	switch (companyName) {
	
	case "Sparksoft": {
		ArrayList<String> empName = new ArrayList<String>(Arrays.asList("Vinayak","Fatima","KArthik"));
		return empName;
	
	}
	
	case "UMBC":{
		
		ArrayList<String> empName = new ArrayList<String>(Arrays.asList("Vhotkar","Kamath"));
		return empName;
		
	}
	
	case "Amazon":{
		ArrayList<String> empName = new ArrayList<String>(Arrays.asList("Chetan","Lahir","Manoj","kedarnath"));
		return empName;
		
	}
	
	default:
		System.out.println("There is no such company");
	}
	
	
	return null;
	
	
	}
	

}
