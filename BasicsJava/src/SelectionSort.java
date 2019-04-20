import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		int min;
		Scanner sc = new Scanner(System.in);
		System.out.println("size of the array is");
		int arrl = sc.nextInt();
		int[] arr = new int[arrl]; // This is my array
		System.out.println("enter the numbers");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Input Elements");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int i = 0; i < arr.length - 1; i++) {
			// Assume first element is min
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;

					int temp = arr[min];

					arr[min] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("Sorted  Elements");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
		}
		sc.close();

	}

}
