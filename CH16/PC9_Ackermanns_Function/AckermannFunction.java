package PC9_Ackermanns_Function;
/**
 * 
 * @author kingreebes
 *Recursive algorithm testing computer performance of recursion
 */
public class AckermannFunction {

	public static void main(String[] args) {
		System.out.println(Ackermann(0,0));
		System.out.println(Ackermann(0,1));
		System.out.println(Ackermann(1,1));
		System.out.println(Ackermann(1,2));
		System.out.println(Ackermann(1,3));
		System.out.println(Ackermann(2,2));
		System.out.println(Ackermann(3,2));


	}
public static int Ackermann(int m, int n){
	if (m == 0) {
		return n + 1;
	}
	if (n == 0) {
		return Ackermann(m-1, 1);
	}
	return Ackermann(m-1, Ackermann(m, n-1));
}
}
