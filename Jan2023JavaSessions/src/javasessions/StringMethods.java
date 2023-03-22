package javasessions;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "hello This is my java code i am so happy";
		
		int stringLength = s.length();
		
		System.out.println(stringLength);
		
		
		System.out.println(s.charAt(stringLength-1));
		
		System.out.println(s.indexOf('i'));
		
		System.out.println(s.indexOf('i', s.indexOf('i')+1));

		String t = "hello this is a java code";
		System.out.println(t.toUpperCase());
		System.out.println(t.toLowerCase());
		
	}

}
