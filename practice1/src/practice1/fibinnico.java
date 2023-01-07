package practice1;

import java.util.ArrayList;

public class fibinnico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fibinnico F = new fibinnico();
		
		System.out.print(F.getFibinnico(6));
		
		int length = 6;
		
		int array[] = new int[length+1];
		
		//ArrayList<Integer> A = new ArrayList<Integer>();
		array[0] = 0;
		array[1] = 1;
		
		for(int i=2; i<=length; i++) {
			
			array[i] = array[i-1] + array[i-2];		
		}
		
		System.out.print(array[5]);
		
	}
	
	public int[] getFibinnico(int length) {
		
		int array[] = new int[length+1];
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		A.add(0);
		A.add(1);
		array[0] = 0;
		array[1] = 1;
		
		for(int i=2; i<=length; i++) {

			
			//array[i] = array[i-1] + array[i-2];		
		}
		
		return array;
		
		
	}

}
