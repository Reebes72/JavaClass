package ch2;
import java.util.Scanner;

public class Challenge8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bagOfCookies = 40;
		int servingSize = 10;
		int servingPerBag = bagOfCookies / servingSize;
		int caloriePerServing = 300;
		int caloriePerCookie = caloriePerServing / servingSize;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many cookies did you eat?");
		int cookiesEaten = keyboard.nextInt();
		System.out.println("Calories consumed: " + cookiesEaten * caloriePerCookie);
		
	}

}
