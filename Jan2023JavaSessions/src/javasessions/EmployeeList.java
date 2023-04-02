package javasessions;

public class EmployeeList {

	String employeeName;
	int employeAge;
	double employeeSalary;
	String city;
	static String country;

	public EmployeeList(String employeeName, int employeAge, double employeeSalary, String city, String country) {
		this.employeeName = employeeName;
		this.employeAge = employeAge;
		this.employeeSalary = employeeSalary;
		this.city = city;
		EmployeeList.country = country;
	}

	public EmployeeList(String employeeName, int employeAge) {

		this.employeeName = employeeName;
		this.employeAge = employeAge;
	}
	
	public EmployeeList(String employeeName, int employeAge, String country) {

		this.employeeName = employeeName;
		this.employeAge = employeAge;
		EmployeeList.country = country;
	}
	
	
	

	public EmployeeList(String employeeName, int employeAge, double employeeSalary, String city) {
		this.employeeName = employeeName;
		this.employeAge = employeAge;
		this.employeeSalary = employeeSalary;
		this.city = city;
	}

	public void getEmployeeData() {

		System.out.println("Emplyee name is: " + employeeName);

		System.out.println("Emplyee age is: " + employeAge);
		
		getEmployeeFullDetails();
		

	}

	private void getEmployeeFullDetails() {

		System.out.println("Employee sailary is: "+employeeSalary);
		
		System.out.println("Employee city residence is: "+ city);
		
		getStaticEmployeeDetails();
	}
	
	public void getEmployeeOverallDetail() {
		
		System.out.println("Employee sailary is: "+employeeSalary);
		
		System.out.println("Employee city residence is: "+ city);
		
		getStaticEmployeeDetails();
		
		
	}
	
	static private void getStaticEmployeeDetails() {
		
		System.out.println(EmployeeList.country);
		
	}
	
	
	

}
