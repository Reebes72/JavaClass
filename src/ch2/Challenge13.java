package ch2;
import java.util.Scanner;

public class Challenge13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the charge for the meal?");
		double chargeAmount = keyboard.nextDouble();
		double taxAmount = chargeAmount * 0.0675;
		double tipAmount = (chargeAmount + taxAmount) * 0.20;
		double totalAmount = chargeAmount + tipAmount + taxAmount;
		System.out.println("Meal Charge: " + chargeAmount
				+ "\nTax Amount: " + taxAmount
				+ "\nTip Amount: " + tipAmount
				+ "\nTotal: " + totalAmount);
	}

}
