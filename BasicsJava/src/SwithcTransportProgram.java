import java.util.Scanner;

public class SwithcTransportProgram {
	public static void main(String[] args) {
		String s1;
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 1; i++) {
			System.out.println();
			System.out.println();
			System.out.println("please provide the mode of trasport");
			s1 = s.next();
			System.out.println("the transportaion mode is" + "  " + s1);
			if (s1.equalsIgnoreCase("exit")) {

				System.out.println("program completes");
				break;
			}

			switch (s1) {
			case "bus":

				System.out.println("i will reach office by 30 min");
				break;
			case "train":
				System.out.println("i will reach office by 20 min");
				break;
			case "bike":
				System.out.println("i will reach office by 10 min");
				break;
			case "walk":
				System.out.println("i dont go to office");
				break;
			default:
				System.out.println("i will stay at home");

			}
			i--;
		}

	}
}
