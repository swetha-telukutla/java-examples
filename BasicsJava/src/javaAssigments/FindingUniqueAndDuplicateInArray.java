
package javaAssigments;

import java.util.Scanner;

public class FindingUniqueAndDuplicateInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the Array : ");
		int arrSize = sc.nextInt();

		int[] array = new int[arrSize];
		System.out.print("Enter the Integer numbers : ");
		for (int i = 0; i < arrSize; i++) {
			array[i] = sc.nextInt();

		}
		System.out.println("Input Elements");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "\t");
		}
		findingDuplicate(array);
		findingUnique(array);

	}

	private static void findingDuplicate(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[i] == array[j])) {
					System.out.println("Duplicate Element : " + array[i]);
				}
			}
		}

	}

	private static void findingUnique(int[] array) {
		int count = 0;
		int flag = 0;
		;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[i] != array[j])) {
					flag = 1;
					;
				} else {
					flag = 0;
					break;
				}
				if (flag == 1) {
					count++;

					System.out.println("unique Element : " + array[i]);
				}
			}

		}

	}

	/*
	 * public int[] readIntegers(int arrSize){ Scanner scanner = new
	 * Scanner(System.in); int[] arr = new int[arrSize];
	 * 
	 * int a = 0; int i = 0; System.out.println(
	 * "Enter the positive integers and enter -1 to exit");
	 * System.out.println("===================================================")
	 * ; while (a >= 0 && i < arrSize) { System.out.print(
	 * "Enter the Integer Number: "); a = scanner.nextInt(); arr[i++] = a; }
	 * 
	 * // Print the integer array. System.out.println("Values in the Array: ");
	 * for (int j = 0; j < arr.length; j++) {
	 * 
	 * System.out.print(arr[j] + "\t"); }
	 * 
	 * System.out.println(); scanner.close(); return arr; }
	 */
}
