package practice1;

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
		
		String str = "abcddbsabe";
		
		HashMap<Character, Integer> hMap = new HashMap<>();
	
		for(int i = 0 ; i <= str.length()-1; i++ ) {
			
			 System.out.println(str.charAt(i));
			
		}
		
		
		
		
		
	}
}
