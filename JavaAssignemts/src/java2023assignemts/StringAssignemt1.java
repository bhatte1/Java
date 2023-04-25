package java2023assignemts;

public class StringAssignemt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		get3rdChar("welcome to naveen automation lab");
		
		

	}
	
	//welcome to naveen automation lab
	
	static public void get3rdChar(String name) {
		
		char [] n = name.toCharArray();		
		int temp = 0;

		
		for(char e:n) {
			
			System.out.println(e);
			
			if( e == 'e' && name.indexOf('e')>= 0) {
				temp += 1;
				
				if(temp == 3) {
					char eCharacter = name.charAt(e);
					System.out.println(eCharacter);
					break;
				}
				
			}
			
		}
		
		
		
		
	}

}
