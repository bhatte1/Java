package java2023assignemts;

public class EmployeeClass {
	
	static final String COMPANYNAME_STRING = "Sparksoft";
	int EmpId;
	String location;
	boolean US_Citizen;
	boolean H1B_Sponsorship;
	char MaleFemale;
	static final String CEO_NAME_STRING = "Mike Finkel";
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeClass ec = new EmployeeClass();
		
		System.out.println(EmployeeClass.COMPANYNAME_STRING);
		System.out.println(ec.EmpId);
		System.out.println(ec.location);
		System.out.println(ec.US_Citizen);
		System.out.println(ec.H1B_Sponsorship);
		System.out.println(ec.MaleFemale);
		System.out.println(EmployeeClass.CEO_NAME_STRING);
		
		System.out.println("----------------------------------");
		
		ec.EmpId = 1010;
		ec.location = "Columbia";
		ec.US_Citizen = true;
		ec.H1B_Sponsorship = false;
		ec.MaleFemale = 'M';
		
		System.out.println(EmployeeClass.COMPANYNAME_STRING);
		System.out.println(ec.EmpId);
		System.out.println(ec.location);
		System.out.println(ec.US_Citizen);
		System.out.println(ec.H1B_Sponsorship);
		System.out.println(ec.MaleFemale);
		System.out.println(EmployeeClass.CEO_NAME_STRING);
		
		System.out.println("----------------------------------");
		
		EmployeeClass ec1 = new EmployeeClass();
		
		ec1.EmpId = 2020;
		ec1.location = "WV";
		ec1.US_Citizen = false;
		ec1.H1B_Sponsorship = true;
		ec1.MaleFemale = 'F';
		
		System.out.println(EmployeeClass.COMPANYNAME_STRING);
		System.out.println(ec1.EmpId);
		System.out.println(ec1.location);
		System.out.println(ec1.US_Citizen);
		System.out.println(ec1.H1B_Sponsorship);
		System.out.println(ec1.MaleFemale);
		System.out.println(EmployeeClass.CEO_NAME_STRING);
		System.out.println(CEO_NAME_STRING);
		
		
		

	}

}
