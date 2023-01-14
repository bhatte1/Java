package practice1;

import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hashMap hm = new hashMap();
		
		hm.getHashMap();
		

	}

	
	public void getHashMap() {
		
		String str = "abcddbsabe";
		
		HashMap<String, Integer> hMap = new HashMap<>();
		
		for(int i = 0; i <= str.length(); i++) {
			
			hMap.put("Vinayak",i);
			
			System.out.println(hMap);
		}
		
		
		
		
		
	}
}
