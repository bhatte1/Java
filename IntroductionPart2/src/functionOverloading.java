
public class functionOverloading {
	
	public void getData(int a) {
		
		System.out.print(a);
	}
	
	public void getData(int b,String a) {
		System.out.println(a);
		System.out.print(b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		functionOverloading fl = new functionOverloading();
		
		fl.getData(10,"vinayak");

	}

}


//either argument count should be different or
//argument data type should be different 

//eg: getPayment(credit card, Debit card, gift card)


//functionOveriding - both have same name same signature and same parameter but the preference is given to the one which is in the present class