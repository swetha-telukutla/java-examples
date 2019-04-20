import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
	int arrayLen;
	System.out.println("please enter the array lenth");
	
	arrayLen=s.nextInt();
	int[] array=new int[arrayLen];
	System.out.println("please enter the array values");
	for(int i=0;i<arrayLen;i++){
		System.out.print("array["+i+"]=");
		array[i]=s.nextInt();
	
	}
	
System.out.println("sorted array is =");
		int temp;
		for (int k = 0; k < array.length; k++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}

			}
		}

		// to print an array

		for (int k = 0; k < array.length; k++) {
			System.out.println(array[k]);
		}

	}}
	
