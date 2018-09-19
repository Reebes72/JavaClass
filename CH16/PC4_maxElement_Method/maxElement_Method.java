package PC4_maxElement_Method;

public class maxElement_Method {

	public static void main(String[] args) {
		//Write a method, accepting an array that returns the largest value
		int[] array = {1,97,3,4,5,6,10,2,47,1,37,83};
		System.out.println(maxElement(array, 0, 0));
	}
	
	public static int maxElement(int[] array, int index, int max) {
		if(index == array.length) {
			return max;
		}
		if(max < array[index]) {
			max = array[index];		
		}
		index++;
		return maxElement(array, index, max);
	}

}
