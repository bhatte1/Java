package java2023assignemts;

public class Person {

	String name;
	int age;
	char gender;
	double height;

	public Person(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		
		getData();
		

	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	
	private void getData() {
		
		System.out.println("Concept");
	}

}
