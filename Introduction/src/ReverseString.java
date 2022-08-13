
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ReverseString str = new ReverseString();
		
		String s = getReverse();	  // you have used staic word in method creation below and hence you can use without object creation of that method directly as shown 	
		for(int i = s.length()-1; i>= 0; i--) {   // each letter is getting reversed
			System.out.println(s.charAt(i));
		}
		
		String[] s1 = s.split(" ");				//each word is getting reversed
		for (int i = s1.length-1; i>=0; i--) {
			System.out.println(s1[i]);
		}
		
		System.out.println(getData());
			
		
	}
	
	public static String getReverse() {
		
		return "Vinayak Bhatte is learning java";
	}
	public static String getData() {
		
		return "God is Great";
	}

}
