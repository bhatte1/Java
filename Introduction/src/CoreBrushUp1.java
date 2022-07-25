import java.util.ArrayList;

public class CoreBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a = 5;
		 System.out.println(a);
		 
		 int[] arr = new int[5];   //memory is assigned using "new" to arr, [] means you are adding multiple values
		 						// arr is constant here. you cannot add more than 5 elements. hence it is like tuple in python
		 arr[0] = 1;
		 arr[1] = 2;
		 arr[2] = 3;
		 arr[3] = 4;
		 arr[4] = 5;
		 
		 for(int i = arr.length - 1; i>=0; i--)
		 {
			 System.out.println(arr[i]);
		 }
		 
		 String [] name = {"Vinayak","Bhatte"};
		 
		 for(String s: name) {			//advanced for loop. works similar as before
			 System.out.println(s);
		 }
		 
		 // write a program to print all the even numbers
		 
		 int eve [] = {1,2,3,4,5,6,7,8,122};
		 
		 for(int ev1: eve) {
			 if (ev1%2 == 0){				//% means remainder
				 System.out.println(ev1); 
			 }	 
		 }	
		 
		 ArrayList<Integer> A = new ArrayList<Integer>();    // Using ArrayList you can add more objects to an array. Flexible. List in Python
		 													//Explicitly telling this array will store only Integers
		 A.add(1);
		 System.out.println(A); 
		 int b = A.get(0);
		 System.out.println(b); 

	}

}
