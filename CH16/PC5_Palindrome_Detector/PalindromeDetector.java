package PC5_Palindrome_Detector;
/**
 * 
 * @author kingreebes
 * Programming Challenge 5 Palindrome Checker
 * Write boolean method using recursion to determine if String is a palindrome
 */
public class PalindromeDetector {

	public static void main(String[] args) {
		System.out.println(Detector("Radar", "", 1));
		System.out.println(Detector("How are you doing today", "", 1));
		System.out.println(Detector("blah", "", 1));
	}
	
/**
 * Returns a boolean value based off the string that was provided
 * @param str			The value to be tested
 * @param palindrome	Empty string used for creating the reversed string
 * @param index			Used for pulling the substring. Must be 1
 * @return				After reversing the string recursion breaks giving you the result
 */
public static boolean Detector(String str, String palindrome, int index) {
	if(str.length() == palindrome.length()) {
		return str.toLowerCase().equals(palindrome.toLowerCase());	
	}
	palindrome += str.charAt(str.length() - index);
	return Detector(str, palindrome, index + 1);
}
}
