package practice1;

public class intToString {
	
	int a = 2000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		intToString is = new intToString();  
		
		is.getIntToStr();
		
		is.getStrToInt();
		
	}
	
	private void getIntToStr() {
		
		int a = 1000;
		
		String bString = Integer.toString(this.a);
		
		System.out.println(bString);
		
		
	}
	
	private void getStrToInt() {
		 
		String str = "10";
		
		int iString = Integer.parseInt(str);
		
		System.out.println(iString);
		
	}

}
