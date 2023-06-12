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
				
				
				//
				String x = "100";
				System.out.println(x+20);
				
				//string to int:
				int i = Integer.parseInt(x);//100
				System.out.println(i+20);//120
				
				//string to double:
				String v = "12.33";
				System.out.println(v+10);
				double d1 = Double.parseDouble(v);//12.33
				System.out.println(d1+10);
				
				//
				//int to String:
				int k = 1100;
				System.out.println(k+20);
				String k1 = String.valueOf(k); //"1100"
				System.out.println(k1+20);
				
				//string to boolean:
				String flag = "true";
				boolean bl = Boolean.parseBoolean(flag);//true
				if(bl) {
					System.out.println("run my test cases");
				}
				
				
				//
				String h = "testing with selenium";
				String g = "devlopment with selenium";
				
				System.out.println(h.startsWith("testing"));
				System.out.println(g.endsWith("selenium"));
				
				//substring:
				String messg = "your transaction id is 12345";
				System.out.println(messg.substring(messg.indexOf("is")+2).trim());
				String trId = messg.substring(messg.indexOf("is")+2).trim();
				System.out.println(trId);
				
				String mg = "your transaction id is 12345";
				System.out.println(mg.substring(0, 9));//0-8
				System.out.println(mg.substring(mg.indexOf("is")+2, mg.length()).trim());
				System.out.println(mg.startsWith("your"));
				System.out.println(mg.charAt(10));
				System.out.println(mg.concat(" 3456"));
				
	}

}
