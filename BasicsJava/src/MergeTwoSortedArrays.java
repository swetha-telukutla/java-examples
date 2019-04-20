import java.util.Scanner;

public class MergeTwoSortedArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int arrlen1 = sc.nextInt();
		System.out.println();
		int arrlen2 = sc.nextInt();
		System.out.println();
		
		int[] array1 = new int[arrlen1];
		int[] array2=new int[arrlen2];
		System.out.println("Enter the Integer numbers for array1 : ");
		for (int i = 0; i < arrlen1; i++) {
			array1[i] = sc.nextInt();
			
		}
		System.out.println("Input Elements");
		for(int i = 0; i < array1.length ; i++ ) {
			System.out.println(array1[i] + "\t");
		}
		System.out.println("Enter the Integer numbers for array2 : ");
		for (int j = 0; j < arrlen2; j++) {
			
			array2[j]=sc.nextInt();
		}	
		System.out.println("Input Elements");
		for(int j = 0; j < array2.length ; j++ ) {
			System.out.print(array1[j] + "\t");
		}
	}
	public static int[] merge(int[] a, int[] b) {

	    int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;
	    while (i < a.length && j < b.length)
	    {
	        if (a[i] < b[j])
	        {
	            answer[k] = a[i];
	            i++;
	        }
	        else
	        {
	            answer[k] = b[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < a.length)
	    {
	        answer[k] = a[i];
	        i++;
	        k++;
	    }

	    while (j < b.length)
	    {
	        answer[k] = b[j];
	        j++;
	        k++;
	    }

	    return answer;
	}

}
