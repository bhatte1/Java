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
		ou2.Age = 17;
		ou2.MaleFemale = 'M';
		
		
		System.out.println("The current Employee is " + ou2.empNameString + " "+ou2.Age+ " "+ou2.MaleFemale);
		
		
		ObjectUnderstanding ou3 = new ObjectUnderstanding();
		
		ou3.empNameString = "Vinayak";
		ou3.Age = 31;
		ou3.MaleFemale = 'M';
		
		
		System.out.println("The current Employee is " + ou3.empNameString + " "+ou3.Age+ " "+ou3.MaleFemale);
		
		
		ObjectUnderstanding ou4 = new ObjectUnderstanding();
		
		ou4.empNameString = "Meghana";
		ou4.Age = 25;
		ou4.MaleFemale = 'F';
		
		System.out.println("The current Employee is " + ou4.empNameString + " "+ou4.Age+ " "+ou4.MaleFemale);
		
		
		

	}

}
