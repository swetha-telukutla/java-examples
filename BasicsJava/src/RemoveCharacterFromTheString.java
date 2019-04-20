import java.util.Scanner;

public class RemoveCharacterFromTheString {
	// lowercase, special characters

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Given string is");
		String str = s.next();

		// call a method to delete all occurrences
		String newString = deleteAll(str, "a");
		// print the new string value
		System.out.println("New String:" + newString);

	}

	private static String deleteAll(String strValue, String charToRemove) {
		return strValue.replaceAll(charToRemove, "");

	}
}
