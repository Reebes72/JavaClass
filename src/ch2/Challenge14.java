package ch2;
import java.util.Scanner;

public class Challenge14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Number of Males: ");
		int males = keyboard.nextInt();
		System.out.println("Number of Females: ");
		int females = keyboard.nextInt();
		double percentMales = (double)males / (double)(males + females);
		double percentFemales = (double)females / (double)(males + females);
		System.out.println("Percent Males: " + percentMales * 100 + "%\n"
				+ "Percent Females: " + percentFemales * 100 + "%");
					
	}

}
