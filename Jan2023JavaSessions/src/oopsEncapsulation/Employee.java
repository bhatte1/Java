package oopsEncapsulation;

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	private char sex;
	
	
	
	
	
	public Employee(String name1, int age1) {
		
		this.name = name1;
		this.age = age1;
		
	}
	
	public String setName(String name) {
		
		this.name = name;
		
		return name;
		
	}
	
	public void getEmployeeData() {
		
		
		System.out.println(name + " " + age);
		
	}

	public int getAge() {
		age += 1;
		
		return age;
	}

	public Employee(String name, int age, double salary, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.sex = sex;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
	
	

}
