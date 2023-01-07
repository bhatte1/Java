package practice1;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseString rs = new reverseString();
		
		System.out.print(rs.getReversed("Vinayak"));
		
		

	}
	
	public String getReversed(String name) {
		
		String rev = "";
		
		String[] splitName = name.split(" ");
		
		for(int i=splitName.length+1 ; i>=0; i-- ) {
			
			rev += splitName[i];
			
		}
		
		return rev;
				
		
	}

}
