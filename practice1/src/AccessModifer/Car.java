package AccessModifer;

import practice1.interview_prep1;

public class Car {
	
	private String model;
	protected int mileage;
	public String engine;
	String gas;
	

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.model = "320i";
		c.mileage = 61000;
		c.engine = "I4";
		c.gas = "Petrol";
	}

}
