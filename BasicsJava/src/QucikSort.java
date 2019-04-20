import java.util.Arrays;
import java.util.Scanner;

public class QucikSort {
	   public static void main(String[] args)
	    {
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
			for(int i = 0; i < array.length ; i++ ) {
				System.out.print(array[i] + "\t");
			}
	       
	        // Let's sort using quick sort
	        quickSort( array, 0, array.length - 1 );
	 
	        // Verify sorted array
	        System.out.println(Arrays.toString(array));
	    }
	 
	    public static void quickSort(Integer[] arr, int low, int high)
	    {
	        //check for empty or null array
	        if (arr == null || arr.length == 0){
	            return;
	        }
	         
	        if (low >= high){
	            return;
	        }
	 
	        //Get the pivot element from the middle of the list
	        int middle = low + (high - low) / 2;
	        int pivot = arr[middle];
	 
	        // make left < pivot and right > pivot
	        int i = low, j = high;
	        while (i <= j)
	        {
	            //Check until all values on left side array are lower than pivot
	            while (arr[i] < pivot)
	            {
	                i++;
	            }
	            //Check until all values on left side array are greater than pivot
	            while (arr[j] > pivot)
	            {
	                j--;
	            }
	            //Now compare values from both side of lists to see if they need swapping
	            //After swapping move the iterator on both lists
	            if (i <= j)
	            {
	                swap (arr, i, j);
	                i++;
	                j--;
	            }
	        }
	        //Do same operation as above recursively to sort two sub arrays
	        if (low < j){
	            quickSort(arr, low, j);
	        }
	        if (high > i){
	            quickSort(arr, i, high);
	        }
	    }
	     
	    public static void swap (Integer array[], int x, int y)
	    {
	        int temp = array[x];
	        array[x] = array[y];
	        array[y] = temp;
	    }
		 

}
