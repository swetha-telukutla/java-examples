package javaAssigments;

import java.util.Scanner;

/**
 * Scanner to read the integers and print the values.
 * 
 * @author SankarA
 */
public class HelloScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];

		int a = 0;
		int i = 0;
		System.out.println("Enter upto 10 positive integers and enter -1 to exit");
		System.out.println("===================================================");
		while (a >= 0 && i < 10) {
			System.out.print("Enter the Integer Number: ");
			a = scanner.nextInt();
			arr[i++] = a;
		}

		// Print the integer array.
		System.out.println("Values in the Array: ");
		for (int j = 0; j < arr.length; j++) {

			System.out.print(arr[j] + "\t");
		}

		scanner.close();
	}
}
