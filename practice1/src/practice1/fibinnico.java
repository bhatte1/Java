package practice1;
import java.util.ArrayList;
import java.util.Arrays;

public class fibinnico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int l = 10;
		
		fibinnico F = new fibinnico();
		
		System.out.println(Arrays.toString(F.getFibinnico(l)));
		
		System.out.println(F.fiboArryaList(l));
	}
	
	//using array
	
	public int[] getFibinnico(int length) {
		
		int a[] = new int[length];
		
		a[0] = 0;
		a[1] = 1;
		
		for(int i=2; i<length; i++) {
			
			a[i] = a[i-1] + a[i-2];
		}
		
		return a;
		
		
	}
	
	//using ArryaList
	
	public ArrayList<Integer> fiboArryaList(int length) {
		
		ArrayList<Integer> arrFiboArrayList = new ArrayList<Integer>(Arrays.asList(0,1));
		
		for(int i=2; i<length;i++){
			
			int a = arrFiboArrayList.get(i-1) + arrFiboArrayList.get(i-2);
			
			arrFiboArrayList.add(a);
			
		}
		
		return arrFiboArrayList;
	}

}
