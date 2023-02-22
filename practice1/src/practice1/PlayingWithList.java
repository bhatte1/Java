package practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.event.CaretListener;

public class PlayingWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlayingWithList playingWithList = new PlayingWithList();
		
		
		ArrayList<Integer> Alist = playingWithList.getArrayList();
		
		System.out.println(Alist);
		
		
		List<Integer> BList = playingWithList.getList();
		System.out.println(BList);
		
		
		ArrayList<String> CList = playingWithList.getArrayListNames();
		System.out.println(CList);
		
		List<String> DList = playingWithList.getCompanyNames();
		System.out.println(DList);
		

	}
	
	
	
	public ArrayList<Integer> getArrayList() {
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		
		aList.add(3);
		aList.add(7);
	
		return aList;
	}
	
	
	public List<Integer> getList() {
		
		List<Integer> l1 = Arrays.asList(3,7); 
			
		return l1;	
			
	}
	
	public ArrayList<String> getArrayListNames(){
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Vinayak","Rajesh","Kim"));
		
		names.add("Pankaj");
		
		names.remove("Rajesh");
		
		return names;
		
	}
	
	
	public List<String> getCompanyNames() {
		
		List<String> empNames = Arrays.asList("IBM", "MS", "Google");
		
		return empNames;
		
	}

}
