package practice1;

import java.util.ArrayList;
import java.util.Arrays;

public class arraysOne {

	public static void main(String[] args) {

		arraysOne a1 = new arraysOne();

		ArrayList<String> empList = a1.getEmlpoyeeList("MS");

		System.out.println(empList);

	}

	public ArrayList<String> getEmlpoyeeList(String compName) {

		ArrayList<String> empName = null;

		if (compName.equals("IBM")) {

			empName = new ArrayList<String>(Arrays.asList("Vinayak", "Bhatte"));

		}

		else if (compName.equals("MS")) {

			empName = new ArrayList<String>(Arrays.asList("Raj", "kajol", "Sita"));

		}

		return empName;
	}

}
