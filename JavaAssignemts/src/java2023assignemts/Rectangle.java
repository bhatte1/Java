package java2023assignemts;

public class Rectangle {
	
	double length;
	double width;
	
	
	public Rectangle() {
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;		
	}
	
	
	public double calculateArea() {
		
		double area =  length*width;
		
		return area;
	}
	
	
	public static void main(String[] a) {
		
		Rectangle r = new Rectangle();
		
		System.out.println(r.calculateArea());
		
		Rectangle r1 = new Rectangle(7.0, 3.0);
		
		System.out.println(r1.calculateArea());
		
	}

}
