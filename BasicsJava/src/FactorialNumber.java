import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("input value of a is" + a);

		for (int i = 1; i < a; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
