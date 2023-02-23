package practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import javax.sound.midi.VoiceStatus;
import javax.swing.event.CaretListener;

public class PlayingWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlayingWithList playingWithList = new PlayingWithList();
		
		
		ArrayList<String> Alist = playingWithList.getArrayList();
		
		System.out.println(Alist);
		
//		
//		List<Integer> BList = playingWithList.getList();
//		System.out.println(BList);
//		
//		
//		ArrayList<String> CList = playingWithList.getArrayListNames();
//		System.out.println(CList);
//		
//		List<String> DList = playingWithList.getCompanyNames();
//		System.out.println(DList);
//		
//		
//		List<String> sprksoftNAmes = playingWithList.getSparksoftNames();
//		System.out.println(sprksoftNAmes);
	}
	
	public ArrayList<String> getArrayList() {
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		
		ArrayList<String> ar = getArrayListNames();
		
		ArrayList<String> ar1 = getArrayListNames();
		
		
		for(String e:ar) {
			ar1.add(e);
			
		}
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		for(int i = ar1.size()-1; i>=0; i--) {
			
			ar2.add(ar1.get(i));
		}
		
		
		
		
		aList.add(3);
		aList.add(7);
	
		return ar2;
	}
	
	
	public List<Integer> getList() {
		
		List<Integer> l1 = Arrays.asList(3,7,9,14,7); 
		
		//l1.add(23);

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
	
	
	public List<String> getSparksoftNames()
	
	{
		
		List<String> nameStrings = new ArrayList<String>();
		
		
		nameStrings.add("Vinayak");
		
		nameStrings.add("Sheetal");
		
		return nameStrings;
	}
	
	
	
}
