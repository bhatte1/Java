package javasessions;

public class ObjectUnderstanding {
	
	String empNameString;
	int Age;
	char MaleFemale;
	static final int Hands = 2;
	

	public static void main(String[] args) {
		
		ObjectUnderstanding ou1 = new ObjectUnderstanding();
		
		ou1.empNameString = "Tim";
		ou1.Age = 23;
		ou1.MaleFemale = 'M';
		
		ObjectUnderstanding ou2 = new ObjectUnderstanding();
		
		
		ou2.empNameString = "Akash";
		ou2.Age = 17;
		ou2.MaleFemale = 'M';
		
		
		ObjectUnderstanding ou3 = new ObjectUnderstanding();
		
		ou3.empNameString = "Vinayak";
		ou3.Age = 31;
		ou3.MaleFemale = 'M';
		
		
		ObjectUnderstanding ou4 = new ObjectUnderstanding();
		
		ou4.empNameString = "Meghana";
		ou4.Age = 25;
		ou4.MaleFemale = 'F';
		
		System.out.println("The current Employee is " + ou1.empNameString + " "+ou1.Age+ " "+ou1.MaleFemale);
		System.out.println("The current Employee is " + ou2.empNameString + " "+ou2.Age+ " "+ou2.MaleFemale);
		System.out.println("The current Employee is " + ou3.empNameString + " "+ou3.Age+ " "+ou3.MaleFemale);
		System.out.println("The current Employee is " + ou4.empNameString + " "+ou4.Age+ " "+ou4.MaleFemale);
		System.out.println(ObjectUnderstanding.Hands);
		
		System.out.println("---------------------------------------");
	
		ou1 = ou2;
		
		System.out.println("The current Employee is " + ou1.empNameString + " "+ou1.Age+ " "+ou1.MaleFemale);
		System.out.println("The current Employee is " + ou2.empNameString + " "+ou2.Age+ " "+ou2.MaleFemale);
		System.out.println("The current Employee is " + ou3.empNameString + " "+ou3.Age+ " "+ou3.MaleFemale);
		System.out.println("The current Employee is " + ou4.empNameString + " "+ou4.Age+ " "+ou4.MaleFemale);
		
		System.out.println("---------------------------------------");
		
		ou2=ou3;
		
		System.out.println("The current Employee is " + ou1.empNameString + " "+ou1.Age+ " "+ou1.MaleFemale);
		System.out.println("The current Employee is " + ou2.empNameString + " "+ou2.Age+ " "+ou2.MaleFemale);
		System.out.println("The current Employee is " + ou3.empNameString + " "+ou3.Age+ " "+ou3.MaleFemale);
		System.out.println("The current Employee is " + ou4.empNameString + " "+ou4.Age+ " "+ou4.MaleFemale);
		
		System.out.println("---------------------------------------");
		
		ou3 = ou4;
		
		System.out.println("The current Employee is " + ou1.empNameString + " "+ou1.Age+ " "+ou1.MaleFemale);
		System.out.println("The current Employee is " + ou2.empNameString + " "+ou2.Age+ " "+ou2.MaleFemale);
		System.out.println("The current Employee is " + ou3.empNameString + " "+ou3.Age+ " "+ou3.MaleFemale);
		System.out.println("The current Employee is " + ou4.empNameString + " "+ou4.Age+ " "+ou4.MaleFemale);
		
		System.out.println("---------------------------------------");
		
		ou4=ou1;
		
		System.out.println("The current Employee is " + ou1.empNameString + " "+ou1.Age+ " "+ou1.MaleFemale);
		System.out.println("The current Employee is " + ou2.empNameString + " "+ou2.Age+ " "+ou2.MaleFemale);
		System.out.println("The current Employee is " + ou3.empNameString + " "+ou3.Age+ " "+ou3.MaleFemale);
		System.out.println("The current Employee is " + ou4.empNameString + " "+ou4.Age+ " "+ou4.MaleFemale);
		
		

	}

}
