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

		// ArrayList<String> empName = new ArrayList<String>();

		if (compName.toLowerCase().trim().equals("IBM")) {

			ArrayList<String> empName = new ArrayList<String>(Arrays.asList("Vinayak", "Bhatte"));

		}

		else if (compName.toLowerCase().trim().equals("MS")) {

			ArrayList<String> empName = new ArrayList<String>(Arrays.asList("Raj", "kajol", "Sita"));

		}

		return empName;
	}

}
