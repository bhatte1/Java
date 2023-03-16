package practice1;

import java.awt.print.Printable;

public class CallByReference {

	String name;
	int age;

	public void getVinData() {

		name = "Vinayak";
		age = 32;

		System.out.println(name + " " + age);

	}

	public void getLokDeta() {
		name = "Lokesh";
		age = 54;

		System.out.println(name + " " + age);

	}

	public static void reference(CallByReference c) {

		c.getVinData();

	}

	public static void main(String[] args) {

		CallByReference cr = new CallByReference();
//		
//		cr.getLokDeta();
//		
//		cr.getVinData();

		reference(cr);

	}

}
