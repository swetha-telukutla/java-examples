import java.util.Scanner;
import java.util.regex.Pattern;

public class ReverseWordsStringInJava {
	static String wordReverse(String str) {
		int i = str.length() - 1;
		int start, end = i + 1;
		String result = "";

		while (i >= 0) {
			if (str.charAt(i) == ' ') {
				start = i + 1;
				while (start != end)
					result += str.charAt(start++);

				result += ' ';

				end = i;
			}
			i--;
		}

		start = 0;
		while (start != end)
			result += str.charAt(start++);

		return result;
	}

	// Driver code
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter string");
		String str = s.nextLine();

		// String str = "I AM A GEEK";

		System.out.print(wordReverse(str));
	}
}