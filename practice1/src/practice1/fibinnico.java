package practice1;

import java.util.ArrayList;
import java.util.Arrays;

public class fibinnico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fibinnico F = new fibinnico();
		
		System.out.print(Arrays.toString(F.getFibinnico(7)));

	}
	
	public int[] getFibinnico(int length) {
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		int a[] = new int[length];
		
		a[0] = 0;
		a[1] = 1;
		
		
		for(int i=2; i<length; i++) {
			
			a[i] = a[i-1] + a[i-2];
		
		
		}
		
		return a;
		
		
	}

}
