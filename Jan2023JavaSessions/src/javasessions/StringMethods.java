package javasessions;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "hello This is my java code i am so happy";
		
		int stringLength = s.length();
		
		System.out.println(stringLength);
		
		
		System.out.println(s.charAt(stringLength-1));
		
		System.out.println(s.indexOf('i'));

	}

}
