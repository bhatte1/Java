package javasessions;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeList el = new EmployeeList("Vinayak", 31, 52.60, "Morgantown");
		
		System.out.println(el.employeAge);
		
		el.getEmployeeData();
		
		EmployeeList el1 = new EmployeeList("Megha", 25);
		
		el1.getEmployeeData();
		
	
		
		EmployeeList el2 = new EmployeeList("Shashank", 42, "USA");
		
		el2.getEmployeeData();
		
		
		
		
		
		

	}

}
