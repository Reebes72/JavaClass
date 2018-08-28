package ch2;
import java.util.Scanner;

public class Challenge12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the name of your favorite city:");
		String favoriteCity = keyboard.nextLine();
		System.out.println("Number of characters: " + favoriteCity.length());
		System.out.println("UPPERCASE: " + favoriteCity.toUpperCase());
		System.out.println("lowercase: " + favoriteCity.toLowerCase());
		System.out.println("First character: " + favoriteCity.charAt(0));
		

	}

}
