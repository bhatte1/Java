package javasessions;

public class ShortCircuitOperator {
	
	
	public static void main(String[] args) {

	int j = 5;
	int k = 6;
	
	if(j==5 && k ==6) {
		
		System.out.println("Success");
	}
	

	//short circuit operator
	

	int j1 = 5;
	int k1 = 6;
	
	if(j1==6 && k1 ==6) {   // it will stop till j1 and will not check further and operator. hence it is called short circuit operator
		
		System.out.println("UnSuccess");
	}
	
			
}			
	
}
