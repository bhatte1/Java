import java.util.ArrayList;
import java.util.Arrays;


public class practtice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		//ArrayList a = new ArrayList();
		
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 78, 41, 5, 6, 7, 8,9,10));
		a.add(11);
		a.remove(4);
		a.add(10);
		a.add(89);
		a.add(90);
		int index = 3;
		//a= ArrayUtils.remove(a,index);
		System.out.println(a.indexOf(4));
		

		System.out.println(a);
		
		

		
	}

}
