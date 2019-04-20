import java.util.Scanner;

public class BooleanVariables {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter boolean variables");
		boolean a = sc.nextBoolean();
		System.out.println("the value of a is" + a);
		boolean b = sc.nextBoolean();
		System.out.println("the value of b is" + b);
		boolean c = sc.nextBoolean();
		System.out.println("the value of c is" + c);
		if (a == true) {
			if (b == true || c == true)
				System.out.println("two boolean  variables are true");

		} else {
			if (b == true && c == true) {
				System.out.println("b and c boolean variables are true");

			} else {
				System.out.println("not identified any boolean variables are true");

			}
			sc.close();
		}
	}
}
