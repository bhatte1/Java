package practice1;

import java.awt.RenderingHints.Key;
import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hashMap hm = new hashMap();
		
		hm.getHashMap();
		
		
		

	}

	
	public void getHashMap() {
		
		String str = "abbcdddse";
		
		HashMap<Character, Integer> hMap = new HashMap<>();
	
		for(int i = 0 ; i <= str.length()-1; i++ ) {
			
			/*hMap.merge(str.charAt(i),1, Integer::sum);
			
			if(hMap.containsKey(str.charAt(i))) {
				
				hMap.merge(str.charAt(i),1, Integer::sum);
				
			}
			
			else {
			
			hMap.put(str.charAt(i), 1);
			}*/
			
			Integer count = hMap.get(str.charAt(i));
			
			if (count == null) {
				hMap.put(str.charAt(i), 1);
				
			}
			else {
				
				hMap.put(str.charAt(i), count + 1);
			}
			
		}
		
		System.out.println(hMap);
		
		//Integer currentInteger = hMap.get(key);
		
		Integer valueObject = hMap.get('d');

		
		System.out.println(valueObject);
		
		
		for ( Map.Entry<Character, Integer> entry : hMap.entrySet()) {
		    Character key = entry.getKey();
		    Integer tab = entry.getValue();
		    // do something with key and/or tab
		    //System.out.println(key);
		    System.out.println(tab);
		    
		    
	}
		
		
		
	}
}
