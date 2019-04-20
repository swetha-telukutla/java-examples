import java.util.Scanner;

public class FactorialByRecusion {

	// method to find factorial of given number
	static int factorial(int n) {
		if (n == 0)
			return 1;

		return n * factorial(n - 1);
	}

	// Driver method
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int num = s.nextInt();
		System.out.println("Factorial of " + num + " is " + factorial(5));
	}
}
