import java.util.ArrayList;
import java.util.Arrays;

public class arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//can accept duplicate values
		//ArrayList has dynamic size whereas Array is fixed
		
		ArrayList<Integer> A = new ArrayList<Integer>();  
		
		A.add(12);
		A.add(16);
		A.add(13);
		A.remove(0);
		
		int[] arr = new int[1];
		
		arr[0] = 1;
		


		System.out.println(Arrays.toString(arr));
		
		System.out.println(A.indexOf(16)) ;
		

	}



}
