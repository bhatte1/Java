import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hash set does not gurantee order 
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Vi nayak");
		hs.add("Bhatte");
		hs.add("Meenakshi");
		hs.remove("Vinayak");
		
		Iterator<String> i = hs.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		

	}

}
