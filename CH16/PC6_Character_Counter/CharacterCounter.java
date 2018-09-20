package PC6_Character_Counter;
/**
 * 
 * @author kingreebes
 * Write method using recursion to count number of times 
 * specific character occurs in array of characters
 */

public class CharacterCounter {

	public static void main(String[] args) {
		char[] array = {'a','b','c','a','d','d','e'};
			System.out.println(Counter(array, 'a', 0));
			System.out.println(Counter(array, 'b', 0));
			System.out.println(Counter(array, 'c', 0));
			System.out.println(Counter(array, 'd', 0));
			System.out.println(Counter(array, 'e', 0));
			System.out.println(Counter(array, 'f', 0));



	}
	/**
	 * Method iterates through a char array, searching for a specific character
	 * It returns the number of times it finds the character
	 * @param array
	 * @param character
	 * @param index
	 * @return
	 */
public static int Counter(char[] array, char character, int index) {
	if(index == array.length) {
		return 0;
	}
	if(array[index] == character) {
		return 1 + Counter(array, character, index + 1);
	}
	return Counter(array, character, index + 1);
}
}
