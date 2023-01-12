package practice1;

public class intToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		intToString is = new intToString();  
		
		is.getIntToStr();
		
		is.getStrToInt();
 
	}
	
	private void getIntToStr() {
		
		int a = 10;
		
		String bString = Integer.toString(a);
		
		System.out.println(bString);
		
		
	}
	
	private void getStrToInt() {
		 
		String str = "10";
		
		int iString = Integer.parseInt(str);
		
		System.out.println(iString);
		
	}

}
