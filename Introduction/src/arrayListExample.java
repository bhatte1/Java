import java.util.ArrayList;
import java.util.Arrays;
import demopack.CentralTraffic;

public class arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//can accept duplicate values
		//ArrayList has dynamic size whereas Array is fixed
		
		arrayListExample rev = new arrayListExample();
		
		ArrayList<Integer> A = new ArrayList<Integer>();  
		
		A.add(12+16);
		A.add(16+13);
		A.add(13);
		A.remove(0);
		
		int[] arr = new int[1];
		
		arr[0] = 1;

		System.out.println(A);
		
		System.out.println(A.indexOf(13)) ;  
		
		rev.reverseMyName();

	}
	
	public String reverseMyName() {
	     String v = "Vinayak";
		 
		 String[] m = v.split("");
		 
		 String w = "";
		 
		 for(int i = m.length-1; i>=0; i--) {
			 
			 w = w + m[i];
		
		 }
		 
		 return v;
		
		
	}



}
 