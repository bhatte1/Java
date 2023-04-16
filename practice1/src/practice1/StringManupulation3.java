package practice1;

public class StringManupulation3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getRepetative("babbdccbbaabdba");
		

	}
	
	
	//String = "abbdccbbaabdba"
	
	static public void getRepetative(String x) {
		
		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 0;
		int temp4 = 0;
		
		for(int i = 0; i< x.length();i++) {
			
			switch (x.charAt(i)){
			case 'a': {
				temp1 += 1;
				break;
			}
			case 'b':{
				temp2 += 1;
				break;
			}
			case 'c':{
				temp3 += 1;
				break;
			}
			case 'd':{
				temp4 += 1;
				break;
			}
			
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + x.charAt(i));
			}
			
		}
		
		System.out.println("The character 'a' repeats " + temp1);
		System.out.println("The character 'b' repeats " + temp2);
		System.out.println("The character 'c' repeats " + temp3);
		System.out.println("The character 'd' repeats " + temp4);
		
	}
	

}
