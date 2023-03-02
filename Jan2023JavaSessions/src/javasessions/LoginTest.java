package javasessions;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginDetails ld = new LoginDetails("Vinayak", "@123");
		
		System.out.println(ld.getUserName());
		
		ld.setUserName("Radhe");
		
		System.out.println(ld.getUserName());
		
		
		

	}

}
