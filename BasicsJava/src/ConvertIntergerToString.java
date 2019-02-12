import java.util.Scanner;

/**
 * Convert Integer to Digital String.
 * 
 * @author SankarA
 *
 */
public class ConvertIntergerToString {

	private static String tens[] = { "ten", "twenty", "thirty", "fourty", "fifty", "sisxty", "seventy", "eighty",
			"ninty", "" };
	private static String one2nine[] = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	private static String teens[] = { "eleven", "twele", "thirteen", "fouteen", "fivteen", "sixteen", "seventeen",
			"eighteen", "nineteen" };
	private static String hundreds[] = {"hundred","thousand"};

	private static String output = "";

	public static void main(String[] args) {
		int digit1, digit2;
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		int temp = input;
		int placeholder = 0;
		while (temp%10 > 0) {
			System.out.println(temp%10);
//			convert(temp%10)
			temp = temp/10;
		}
	}

	public static String convert(int input) {
		if (input > 0 && input < 10) {
			output += one2nine[input - 1];
		} else if (input > 10 && input < 20) {
			output += teens[input - 10 - 1];
		} else if (input % 10 == 0) {
			output += tens[(input / 10) - 1];
		}
		return output;
	}

}
