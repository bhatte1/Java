import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hash set does not gurantee order
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Vianayk");
		hs.add("Bhatte");
		hs.add("Meenakshi");
		
		Iterator<String> i = hs.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		

	}

}
