package javasessions;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = new int[3];
		
		a[2] = 200;
		System.out.println(a[2]);
		a[2] = 300;
		System.out.println(a[2]);
		
		
		Object object[] = {1,34,56,"tom",33.4};
		
		for(Object o : object) {
			System.out.println(o);
		}
		

	}

}
