package practice1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hashMap hm = new hashMap();
		
		hm.getHashMap();
		

	}

	
	public void getHashMap() {
		
		String str = "abcddbsabe";
		
		HashMap<Character, Integer> hMap = new HashMap<>();
		
		for(int i = 0; i <= str.length(); i++) {
			
			Character character = str.charAt(i);
			
			if(hMap.containsKey(character)){
				
				Collection<Integer> key = hMap.values();
				
				hMap.put(character,1+key);
				
			}
			
			else {
				hMap.put(character,i);
			}
			
			
			
		}
		
		System.out.println(hMap);
		
		
		
	}
}
