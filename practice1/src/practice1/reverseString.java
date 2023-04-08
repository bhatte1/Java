package practice1;

import java.util.Arrays;

public class reverseString {
	
public static String getReversed(String name) {
		
		
		if(name == "") {
			System.out.println("Blank name");
		}
		
			if(name == null) {
				System.out.println("Value cannot be null");
				throw new MyException("NULL VALUES");
				
			}
		
		
		String rev = "";
		
		String[] splitName = name.split("");
		
		System.out.println(splitName.length);
		
		for(int i=splitName.length-1 ; i>=0; i-- ) {
			
			rev += splitName[i];
			
		}
		
		return rev;
				
		
	}

//java python selenium

public static void revString(String st) {
	
	String revString = "";
	
	String splitString[] = st.split(" ");
	
	
	
	
	
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseString rs = new reverseString();
		
		System.out.print(rs.getReversed("java python selenium"));
		
		//String revString = rs.getReversed(null);
		
		//System.out.println(revString);

	}
	
	

}
