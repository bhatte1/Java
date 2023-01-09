package practice1;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class fizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fizzBuzz fb = new fizzBuzz();
		
		fb.getFizzBuzz(15);

	}
	
	public void getFizzBuzz(int n) {
		
		for(int i=1; i<=n;i++) {
			
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (i%3 == 0 && i%5 != 0) {
				System.out.println("Fizz");
			}
			else if (i%3 != 0 && i%5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
			
		}
		
		
	}
	

}
