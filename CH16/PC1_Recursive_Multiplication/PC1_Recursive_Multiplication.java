package PC1_Recursive_Multiplication;


public class PC1_Recursive_Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write recursive function accepting 2 args (x,y)
		//Return value of x * y
		System.out.println(multiply(4,4));
		System.out.println(multiply(6,20));
		System.out.println(multiply(40,24));
		System.out.println(multiply(4,800));

	}
	
	public static int multiply(int x, int y) {
		if(y == 0) {
			return 0;
		}
		return x + multiply(x, y-1);
	}

}
