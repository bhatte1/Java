package practice1;

import java.util.Arrays;

public class StringManipulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s = "dkfhkerjhgprieogurephvobnlegrvinayakpofoepirljlrjo";
		
		//String s1[] = s.split("");
		
		
//		System.out.println(s.indexOf("v"));
//		
//		System.out.println(s.substring(s.indexOf("v"), s.indexOf("v")+1));
//		
//		
//		System.out.println(s.charAt(23));
		
		String searchWord = "Vinayak";
		
		if(s.contains(searchWord.toLowerCase())) {
			
			int startIndex = s.indexOf("vinayak");
			
			System.out.println(s.substring(startIndex,startIndex +searchWord.length()));
			
			
		}
		
		
		
		
			
			
			
	
		

	}
	
	
	
	
	

}
