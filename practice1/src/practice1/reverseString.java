package practice1;

import java.util.Arrays;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseString rs = new reverseString();
		
		//System.out.print(Arrays.toString(rs.getReversed("Vinayak")));
		
		String revString = rs.getReversed("vinayak");
		
		System.out.println(revString);

	}
	
	public String getReversed(String name) {
		
		String rev = "";
		
		String[] splitName = name.split("");
		
		for(int i=splitName.length-1 ; i>=0; i-- ) {
			
			rev += splitName[i];
			
		}
		
		return rev;
				
		
	}

}
