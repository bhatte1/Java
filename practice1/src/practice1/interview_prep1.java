package practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sound.midi.SysexMessage;

public class interview_prep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		interview_prep1 iPrep1 = new interview_prep1();
		iPrep1.getList();

	}
	
	
	public void getList() {
		
		/*String [] question1 = {"1", "2", "2", "2", "3", "3", "4", "4", "1", "1"};	
		
		String s = "abced";
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(question1));
	
		System.out.println(list); */
		
		Integer [] lists = {1,2, 2, 2, 3, 3, 4, 4, 1, 1};
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,2,2,3,3,4,4,1,1));
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		int temp = 1;
		
		int l = list.size();
		
		for(int i = 1 ; i <l ; i++) {
			
			
			if(list.get(i) == list.get(i-1) && i== l-1) {
				temp += 1;
				list2.add(temp);
				list2.add(list.get(i-1));
			}
				else if(list.get(i) == list.get(i-1))	{
				
					temp += 1;
				}	
					else {
						
						list2.add(temp);
						list2.add(list.get(i-1)); 
						temp = 1;
					}
							
			}
	
		System.out.println(list);
		System.out.println(list2);

}
	
}


