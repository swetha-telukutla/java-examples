import java.util.Scanner;

public class CheckPalindromeInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int arrlen = sc.nextInt();

		int[] numbers = new int[arrlen];

		System.out.print("Enter the Integer numbers : ");
		for (int i = 0; i < arrlen; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println("Input Elements");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + "\t");
		}

		// iterate through the numbers
		for (int i = 0; i < numbers.length; i++) {

			int number = numbers[i];
			int reversedNumber = 0;
			int temp = 0;

			// reverse the number
			while (number > 0) {
				temp = number % 10;
				number = number / 10;
				reversedNumber = reversedNumber * 10 + temp;
			}

			if (numbers[i] == reversedNumber)
				System.out.println(numbers[i] + " is a palindrome number");
			else
				System.out.println(numbers[i] + " is not a palindrome number");
		}

	}
}
