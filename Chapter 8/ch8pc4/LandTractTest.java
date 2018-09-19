package ch8pc4;
import java.util.Scanner;

public class LandTractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LandTract first = createTract();
		LandTract second = createTract();
		
		System.out.println(first);
		System.out.println(second);
		
		if(first.equals(second)) {
			System.out.println("The tracts are equal");
		}   else {
			System.out.println("the tracts are not equal");
		}

		
	}
	public static LandTract createTract() {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter width of tract of land.");
		double width = keyboard.nextDouble();
		System.out.println("Enter length of tract of land.");
		double length = keyboard.nextDouble();
		
		return new LandTract(length, width);
	}

}
