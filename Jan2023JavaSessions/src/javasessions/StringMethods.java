package javasessions;

import java.util.Arrays;

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
		
		String browser = "  Chrome ";
		if(browser.trim().equalsIgnoreCase("chrome")) {
			System.out.println("PASS");
			
			
		}
		
		
		//split:
				String lang = "JAVA_PYTHON_DOTNET_RUBY";
				String l[] = lang.split("_");
				
				System.out.println(l[0]);
				System.out.println(l[1]);

				System.out.println(Arrays.toString(l));
				
				
				String pop = "xXseleniumxXXtestingXxXJavaXxXpythonX";
				String d[] = pop.split("xX");
				System.out.println(d[0].length());
				System.out.println(d[1]);
				System.out.println(d[2]);
				System.out.println(d[3]);
				System.out.println(d[4]);
				System.out.println(Arrays.toString(d));
				
	}

}
