package practice1;

import java.util.ArrayList;
import java.util.Arrays;

public class interview_prep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		interview_prep1 iPrep1 = new interview_prep1();
		iPrep1.getList();

	}
	
	
	public void getList() {
		
		String [] question1 = {"1", "2", "2", "2", "3", "3", "4", "4", "1", "1"};		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(question1));
		list.addAll(Arrays.asList(question1));
	
		System.out.println(list);
		
		//ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,2,2,3,3,4,4,1,1));
		
	}

}
