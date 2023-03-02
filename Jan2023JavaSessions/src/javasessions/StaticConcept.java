package javasessions;

public class StaticConcept {
	 
	String sub;
	static int cost;
	
	public void location1() {
		
		System.out.println("Horn Beck");
		
		location2();
		
	}
	public void location2() {
		
		System.out.println("High Street");
		
		location2("Sabraton");
		
	}
	
	public void location2(String part1) {
		
		System.out.println(part1);
		
		location3();
		
	}
	
	static public void location3() {
		
		System.out.println("Morgantown");
		
		subwayName("Radhe");
	
	}
	
	public double price(double d, double e) { 
		
		return d+e;
	}
	
	static public String subwayName(String type) {
		return type;
		
	}
	
	public void series(StaticConcept sc) {
		
		sub = "vinayakBhatte";
		StaticConcept.cost = 11;
		System.out.println(sub + cost);
		
		sc.location2("Rahul");
		
	}
	
	// S-> S
	//NS -> S
	//
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticConcept sc = new StaticConcept();
		
		sc.location1();
		
		sc.series(sc);
		

	}

}
