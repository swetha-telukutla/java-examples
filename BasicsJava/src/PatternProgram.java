import java.util.Scanner;

public class PatternProgram {
	public static void main(String[] args) {
		int n;
		String p;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string symbol");
		p = s.next();
		System.out.println("enter the lenth of the pattern symbol" + p);
		n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(p);
			}
			System.out.println();
		}

		for (int i = (n - 1); i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(p);
			}
			System.out.println();

		}

	}

}
