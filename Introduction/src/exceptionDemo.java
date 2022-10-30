
public class exceptionDemo {

	static int a = 4;
	static int b = 7;
	static int c = 0;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			int k = b/a ;
			System.out.println(k);
			
		}
		catch(Exception e) {
			System.out.println("I catch the exception");
		}
		finally{
			
			//this block is executed irrespective of exception or not
			System.out.println("delete cookies");
		}

	}

}
