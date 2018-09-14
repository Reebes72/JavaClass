package ch8pc3;
import java.util.Scanner;

public class CarpetCalculator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter width of room.");
		double width = keyboard.nextDouble();
		
		System.out.println("Enter length of room.");
		double length = keyboard.nextDouble();
		
		System.out.println("Enter Carpet cost per square foot.");
		double carpetCost = keyboard.nextDouble();
		
		
		
		System.out.println(new RoomCarpet(length, width, carpetCost));
		keyboard.close();
				
			

	}

}
