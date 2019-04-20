import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Sort integers
 * 
 * @author SankarA
 *
 */
public class SortAnArry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int arrlen = sc.nextInt();
		System.out.println();

		int[] array = new int[arrlen];
		System.out.print("Enter the Integer numbers : ");
		for (int i = 0; i < arrlen; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Input Elements");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}

		Arrays.sort(array);

		System.out.println("Sorted  Elements");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "\t");
		}
		sc.close();
	}
}
