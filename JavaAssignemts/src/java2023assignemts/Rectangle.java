package java2023assignemts;

public class Rectangle {

	double length;
	double width;

	public Rectangle() {
		
		System.out.println("Iam being called from rectangle");

	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		
		PersonMain pMain = new PersonMain();
		pMain.getmethod();
	}

	public void calculateArea() {

		double area = length * width;

		System.out.println(area);
	}

	public static void main(String[] a) {

		Rectangle r = new Rectangle();

		r.calculateArea();

		Rectangle r1 = new Rectangle(7.0, 3.0);

		r1.calculateArea();

	}

}
