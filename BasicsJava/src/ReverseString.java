import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		System.out.println("enter the string");
		String s = st.next();
		System.out.println("reverse string is:");

		char[] try1 = s.toCharArray();

		for (int i = try1.length - 1; i >= 0; i--) {

			System.out.println(try1[i]);

		}
	}
}
