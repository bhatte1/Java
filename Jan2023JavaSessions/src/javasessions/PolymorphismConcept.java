package javasessions;

public class PolymorphismConcept {
	
	
	public void search() {
		m1();
	}
	
	
	public void search(int i) {
		System.out.println(i);
		
		
	}
	
	public static String search(String s) {
		return s;
		
		
	}
	
	public void m1() {
		System.out.println("My Name is");
	}
	
	//polymorphism is nothing but method overloading

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolymorphismConcept pc = new PolymorphismConcept();
		
		pc.search();
		System.out.println(PolymorphismConcept.search("Vinayak"));
		System.out.println(search("Bhatte"));
		

	}
	
	
	
	

}
