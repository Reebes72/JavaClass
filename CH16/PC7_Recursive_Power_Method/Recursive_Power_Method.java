package PC7_Recursive_Power_Method;
/**
 * 
 * @author kingreebes
 * Write method using recursion to raise a number to a power
 * Accepts two arguments, number and the exponent
 * Assume exponent is nonnegative int
 */
public class Recursive_Power_Method {

	public static void main(String[] args) {
		System.out.println(PowerMethod(4,2));
		System.out.println(PowerMethod(4,3));
		System.out.println(PowerMethod(10,6));
		System.out.println(PowerMethod(2,16));
		System.out.println(PowerMethod(1,10000));
		//If you try to do 100000 you throw so many errors you can't even see the whole Stack Trace
		




	}
	/**
	 * Takes two ints one representing the number being multiplied by itself
	 * The other representing the exponent. 
	 * Operates by decrementing the exponent to 1, then breaks out of the method
	 * @param num 		Number to be multiplied
	 * @param exponent	Number of times multiplied
	 * @return			Value of number
	 */
public static int PowerMethod(int num, int exponent) {
	if(exponent == 1) {
		return num;
	}
	return num * PowerMethod(num, exponent - 1);
}
}
