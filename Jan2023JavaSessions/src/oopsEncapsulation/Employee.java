package oopsEncapsulation;

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	private char sex;
	
	
	
	
	
	public Employee(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	public void getEmployeeData() {
		
		System.out.println(name + " " + age);
		
	}
	
	
	
	
	
	
	
	

}
