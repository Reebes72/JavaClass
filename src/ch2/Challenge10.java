package ch2;
import java.util.Scanner;

public class Challenge10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter score 1:");
		double score1 =  keyboard.nextDouble();
		System.out.println("Enter score 2:");
		double score2 =  keyboard.nextDouble();
		System.out.println("Enter score 3:");
		double score3 =  keyboard.nextDouble();
		System.out.println("The average is: " + (score1 + score2 + score3)/3);
	}

}
