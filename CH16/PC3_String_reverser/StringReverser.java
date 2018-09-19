package PC3_String_reverser;

public class StringReverser {

	public static void main(String[] args) {
		//Write method that accepts String as an argument and returns the string in reverse
		System.out.println("bobcat");
		System.out.println(Reverse("bobcat"));
		System.out.println("abcdefghijklmnopqrstuvwxyz");
		System.out.println(Reverse("abcdefghijklmnopqrstuvwxyz"));

	}
public static String Reverse(String str) {
	//Base Case is there is only one character left in the string
	if(str.length() == 1) {
		return str;
	}
	//Gets the single character as a string to return
	String reversedString = str.substring(str.length() -1);
	//Cuts the end index off the string
	str = str.substring(0, str.length()-1);
	return reversedString + Reverse(str);
}
}
