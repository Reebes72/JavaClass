package PC8_Sum_Of_Numbers;
/**
 * 
 * @author kingreebes
 * Accept int argument that returns sum of all ints from 1 up to
 * the number that is being passed.
 */
public class SumOfNumbers {

	public static void main(String[] args) {
		System.out.println(Sum(4));
		System.out.println(Sum(40));
		System.out.println(Sum(3));
		System.out.println(Sum(10));
		System.out.println(Sum(24));
		System.out.println(Sum(16));


	}
	/**
	 * Base case is 1
	 * Adds all other numbers then calls itself with num decremented in the method call
	 * @param num 	number to operate from.
	 * @return 		int value of total numbers
	 */
public static int Sum(int num) {
	if(num == 1) {
		return 1;
	}
	return num + Sum(num-1);
}
}
