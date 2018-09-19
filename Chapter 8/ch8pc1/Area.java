package ch8pc1;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(getArea(10));
			System.out.println(getArea(5,10));
			System.out.println(getArea(4, 10, Math.PI));
	}
	
	public static double getArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}
	public static double getArea(double height, double width) {
		return height * width;
	}
	public static double getArea(double base, double height, double pi) {
		return pi * Math.pow(base, 2) * height;
	}

}
