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
			
			if( e == 'e') {
				temp += 1;
				
				if(temp == 3) {
					char eCharacter = name.charAt(name.indexOf('e'));
					System.out.println(eCharacter);
					break;
				}
				
			}
			
		}
		
		
		
		
	}

}
