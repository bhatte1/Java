import java.util.ArrayList;
import java.util.Arrays;

public class CoreBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a = 5;
		 System.out.println(a);
		 
		 int[] arr = new int[5];   //memory is assigned using "new" to arr, [] means you are adding multiple values
		 						// arr is constant here. you cannot add more than 5 elements.
		 arr[0] = 1;
		 arr[1] = 2;
		 arr[2] = 3;
		 arr[3] = 4;
		 //arr[4] = 5;
		 
		 for(int i = arr.length - 1; i>=0; i--)
		 {
			 System.out.println(Arrays.toString(arr));
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
			 else {
				 System.out.println(ev1+"not multiple of 2");
			 }
		 }	
		 
		 ArrayList<Integer> A = new ArrayList<Integer>();    // Using ArrayList you can add more objects to an array. Flexible. List in Python. ArrayList is like a method
		 													//Explicitly telling this array will store only Integers
		 A.add(1);
		 System.out.println(A); 
		 int b = A.get(0);
		 System.out.println(b); 
		 
		 int [] arry4 = {0,1,2,3,4,5};
		 
		 for(int i = 0; i<arry4.length; i++)
			 System.out.println(arry4[i]);
		 
		 
		 
		 
		 

	}

}
