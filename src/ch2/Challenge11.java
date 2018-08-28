package ch2;
import java.util.Scanner;

public class Challenge11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the retail price of the circuit board?");
		double price = keyboard.nextDouble();
		System.out.println("Profit from the circuit board is: $" + price * 0.4);
	}

}
