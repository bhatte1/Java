package practice1;


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
		
		for(int i=splitName.length-1 ; i>=0; i-- ) {
			
			rev += splitName[i];
			
		}
		
		return rev;
				
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseString rs = new reverseString();
		
		//System.out.print(Arrays.toString(rs.getReversed("Vinayak")));
		
		String revString = rs.getReversed(null);
		
		System.out.println(revString);

	}
	
	

}
