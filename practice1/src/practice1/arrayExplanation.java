package practice1;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayExplanation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arrayExplanation aExplanation = new arrayExplanation();
		
		aExplanation.getArray();
		
		aExplanation.getArrayList();
	}
	
	
	
	public void getArray() {
		
		//you cannot modify the values in array. It is fixed size. you can only change the existing values.
		
		int [] arr = {22,33,44,55,66};
		
		arr[2] = 77;
		
		for(int a:arr) {
			System.out.println(a);
			
		}
			
	}
	
	public void getArrayList() {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(22,33,44,55,66));
		
		//in ArrayList collections, you can modify, add more values as it is dynamic in nature
		
		arrayList.add(77);
		
		arrayList.remove(3);
		
		arrayList.add(4, 99); //add at specific index
		
		for(int a:arrayList) {
			
			System.out.println(a);
		}
		
	}
	
	
	

}