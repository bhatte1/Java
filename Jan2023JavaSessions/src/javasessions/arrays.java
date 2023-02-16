package javasessions;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = new int[3];
		
		a[2] = 200;
		System.out.println(a[2]);
		a[2] = 300;
		System.out.println(a[2]);
		
		
		Object object[] = {1,34,56,"tom",33.4};
		
		for(Object o : object) {
			System.out.println(o);
		}
		
		String browsers[] = {"chrome", "firefox", "IE", "Edge", "Safari"};
		for(int k=0; k<browsers.length; k++) {
			System.out.println(browsers[k]);
				if(browsers[k].equals("IE")) {
					System.out.println("this is deprecated");
				}
				
				
				switch (browsers[k]) {
				case "chrome": {
					
					System.out.println("Google");
					break;
				}
				case "firefox":{
					System.out.println("Mozilla");
					break;
				}
				//case "IE":{
					
					//System.out.println("Microsoft");
					//break;
				//}
				
				case "Edge":{
					System.out.println("Microsoft");
					break;
				}
				case "Safari":{
					System.out.println("Apple");
					break;
				}
	
				}
		}
		

	}

}
