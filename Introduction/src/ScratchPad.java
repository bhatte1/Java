import java.util.ArrayList;
import java.util.Arrays;

public class ScratchPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Vinayak Bhatte is learning java";
		
		for(int i = s.length()-1; i>= 0; i--) {   // each letter is getting reversed
			System.out.println(s.charAt(i));
		}
		
		String[] s1 = s.split(" ");				//each word is getting reversed
		//System.out.println(Arrays.toString(s1));
		System.out.println(s1[1]);
		for (int i = s1.length-1; i>=0; i--) {
			System.out.println(s1[i]);
		}
		
		ArrayList<String> s2 = new ArrayList<String>();
		String[] s21 = s.split(" ");
		System.out.println(s21);
		
		int[] arr1 = {1,3,4,5,6,7};
		System.out.println(arr1[4]);
		
		ArrayList<String> s3 = new ArrayList<String>();
		
		
		
		
		
		
		
	}

}
