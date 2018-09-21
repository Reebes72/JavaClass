package PC2_isMember_Method;

public class isMember_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write recursive boolean method named isMember
		//Should search array for specific value
		//Return true if found false if not.
		int[] array = { 1, 2, 3, 4, 5 ,6, 7, 9};
		System.out.println(isMember(array, 7, 0));
		System.out.println(isMember(array, 10, 0));
		System.out.println(isMember(array, 9, 0));
		System.out.println(isMember(array, 2, 0));
		System.out.println(isMember(array, 0, 0));

	}
	public static boolean isMember(int[] array, int value) {
		return isMember(array, value, 0);
	}
	public static boolean isMember(int[] array, int value, int index) {
		
		if(index == array.length) {
			return false;
		}
		if(array[index] == value) {
			return true;
		} else {
			return isMember(array, value, index + 1);
		}
	}

}
