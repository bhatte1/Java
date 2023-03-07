package java2023assignemts;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person("Vinayak", 31, 'M', 5.9);
		
		System.out.println(person.age);
		System.out.println(person.gender);
		System.out.println(person.height);
		System.out.println(person.name);
		
		
		//Rectangle rectangle = new Rectangle();
		//rectangle.calculateArea();
		
		Rectangle rectangle2 = new Rectangle(5, 2);
		
		rectangle2.calculatedArea(45);
		
		
		

	}
	
	public void getmethod() {
		
		System.out.println("Print my name");
	}

}
