
public class reverseMyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		String name = "moma";
		
		reverseMyName rev = new reverseMyName();
		
		System.out.println(rev.reverseName(name));
		
		//== tests for reference equality (whether they are the same object).

		//.equals() tests for value equality (whether they contain the same data).
		
		if (rev.reverseName(name).equals(name)){     
				
				System.out.print("It is a palindrome");
		}
		else {
			System.out.print("Not a palindrome");
		}
	}
	
	
	public String reverseName(String myName) {
		
		String reveresedName = "";
		
		String[] splitName = myName.split("");
		
		for (int i = splitName.length-1; i >=0; i--) {
			
			reveresedName = reveresedName + splitName[i];
			
		}
		
		return reveresedName;
	
	}
	
	
	
}
