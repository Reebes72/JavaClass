package ch2;
import java.util.Scanner;

public class Challenge7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		double stateTax = 0.04;
		double countyTax = 0.02;
		
		
		System.out.println("Enter purchase amount");
		double purchaseAmount = keyboard.nextDouble();
		
		double statePurchaseTax = purchaseAmount * stateTax;
		double countyPurchaseTax = purchaseAmount * countyTax;
		double purchaseTax = statePurchaseTax + countyPurchaseTax;

		double totalPurchaseAmount = purchaseAmount + purchaseTax;
		
		System.out.println("Purchase Amount: " + purchaseAmount
							+ "\nState Tax: " + statePurchaseTax 
							+ "\nCounty Tax: " + countyPurchaseTax
							+ "\nTotal Tax: "  + purchaseTax
							+ "\nTotal Amount: " + totalPurchaseAmount);
	}

}
