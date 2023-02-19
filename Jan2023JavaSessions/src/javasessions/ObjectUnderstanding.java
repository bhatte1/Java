package javasessions;

public class ObjectUnderstanding {
	
	String empNameString;
	int Age;
	char MaleFemale;
	

	public static void main(String[] args) {
		
		ObjectUnderstanding ou1 = new ObjectUnderstanding();
		
		ou1.empNameString = "Tim";
		ou1.Age = 23;
		ou1.MaleFemale = 'M';
		
		System.out.println("The current Employee is " + ou1.empNameString + " "+ou1.Age+ " "+ou1.MaleFemale);
		
		
		ObjectUnderstanding ou2 = new ObjectUnderstanding();
		
		ou2.empNameString = "Akash";
		ou2.Age = 31;
		ou2.MaleFemale = 'M';
		
		ou2 =ou1;
		
		System.out.println("The current Employee is " + ou2.empNameString + " "+ou2.Age+ " "+ou2.MaleFemale);
		

	}

}
