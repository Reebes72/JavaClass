package ch2;
import java.util.Scanner;

public class Challenge9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Miles Driven: ");
		double milesDriven = keyboard.nextDouble();
		System.out.println("Gallons of gas used: ");
		double gallonsUsed = keyboard.nextDouble();
		System.out.println("Miles Per Gallon: " + milesDriven/gallonsUsed );

	}

}
