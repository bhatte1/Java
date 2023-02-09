package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(char ch = 'a'; ch<='z'; ch++) {
			
			System.out.println(ch);
		}
		
		for(char ch = 'a'; ch<='z'; ch++) {
			
			System.out.println((byte)ch);
		}
		
			 //1 to 10:
			//1. while:
			
			int i = 1;
			while(i <= 10) {
				System.out.println(i);//1 to 10
				i++;
				//i = i+1;
				//++i;
			}
			
			//
			int k = 1;
			while(true) {
				System.out.println("welcome to Hotel Taj");//12
				if(k==5) {//no no
					break;
				}
				k++;
			}
			
			//for loop:
			//1 to 10:
			//for(initialize; condition; inceremnt/decrement)
			int j=1;
			for( ; j<=10 ; ) {
				System.out.println(j);//1
				j++;
			}
			
			//
			int c = 1;
			for( ; true ; ) {
				System.out.println("welcome to naveen automation labs");
					if(c==5) {
						break;
					}
					c++;
			}
			
			//
			int p;
			for(p=1; p<=5;p++) {
				System.out.println(p);
			}
			
			System.out.println("-----------");
			//
			//a to z with ASCII
			for(char ch='a'; ch<='z'; ch++) {
				System.out.println(ch + " = " + (byte)ch);
			}						   
			
			//a = 97
			//b = 98
			
			byte b = 'a';
			System.out.println(b);
			
			//double, float, int, short, byte, long, char -- for/while
			//WAP to print naveen 100 times
		

	}

}
