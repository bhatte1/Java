package oopsEncapsulation;

import java.util.Arrays;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Employee employee = new Employee("Vianayk", 31);
		
		Employee employee = new Employee("radhe", 31, 10000, 'm');
		
		employee.getEmployeeData();
		
		employee.setName("aarush");
		
		employee.setAge(30);

		
		
		
		
		
		EmployeeDetails employeeDetails = new EmployeeDetails();
		
		employeeDetails.getArrya();
		

	}
	
	
	
	public void getArrya() {
		
		int a[] = new int[4];
		
		a[0] = 45;
		a[3] = 90;
		
		System.out.println(Arrays.toString(a));
		
		
	}

}
