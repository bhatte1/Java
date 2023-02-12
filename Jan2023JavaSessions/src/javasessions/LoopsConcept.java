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
			for( ;j<=10 ; ) {
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
			
			for (float a = 1.1f ;a<5.0;a++) {
				System.out.println(a);
			}
			
				//use cases of while loop: 
				//when number of iterations are not fixed -- while loop
				//total links/images on the page
				//webtable pagination 1 2 3 4...next
				//webelement is loading on the page
				//page load time out
				//calendar: 
				//build is running : 10, 1 hr , 2 hr, 30 mins
				//read data from DB: SQL -- rows/colns 

				
				//use cases of for loop: 
				//when number of iterations are fixed -- for loop
				//month/days drop down --> 1 to 12
				//category options --> 
				//Arrays, Arraylist 
				//excel file -- test data -- rows = 1 to rowSize()
				//country drop down --> 1 to 230 ---> if name = brazil -- break;
				//Read data : JSON/XML
				//read data from DB: SQL -- rows/colns 
				
				//do-while loop:
				int e = 1;
				do {
					e++;//11
					System.out.println(e);//1
					//break;
					//e++;
				}
				while(e <=10);
				
				//use cases :
				//1. webtable paginaton: check if element is already present in the table , click on it and end the loop
				//2. go and check the element first and then start the while loop
				//3. calendar: 
				
				
				//4. for each
				//5. streams
				
				
				
				for(int a =1; a<=9; a++) {
					
					System.out.println("I am Batman "+ a);
					
				}
		

	}

}
