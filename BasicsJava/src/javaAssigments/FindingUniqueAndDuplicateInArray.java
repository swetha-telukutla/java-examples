package javaAssigments;

import java.util.Scanner;

public class FindingUniqueAndDuplicateInArray {

	public static void main(String[] args) {
		FindingUniqueAndDuplicateInArray findDup = new FindingUniqueAndDuplicateInArray();
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the size of the Array : ");
		  int arrSize = sc.nextInt();
		  int[] my_array = findDup.readIntegers(arrSize);
		//int a=my_array;
		  // a=sc.nextInt();
		  findingDuplicate(my_array);
	        //System.out.println("Please enter the length of Array: ");
		  
	
	       
	      

	    }

	private static void findingDuplicate(int[] arr) {
		
		for (int i = 0;i<arr.length-1; i++)
	        {
	            for (int j = i+1; j <arr.length; j++)
	            {
	                if ((arr[i] == arr[j]) && (i != j))
	                {
	                    System.out.println("Duplicate Element : "+arr[i]);
	                }
	            }
		
	        }
	}
	
	
	public int[] readIntegers(int arrSize){
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[arrSize];

		int a = 0;
		int i = 0;
		System.out.println("Enter the positive integers and enter -1 to exit");
		System.out.println("===================================================");
		while (a >= 0 && i < arrSize) {
			System.out.print("Enter the Integer Number: ");
			a = scanner.nextInt();
			arr[i++] = a;
		}

		// Print the integer array.
		System.out.println("Values in the Array: ");
		for (int j = 0; j < arr.length; j++) {

			System.out.print(arr[j] + "\t");
		}

		System.out.println();
		scanner.close();
		return arr;
	}
	}
