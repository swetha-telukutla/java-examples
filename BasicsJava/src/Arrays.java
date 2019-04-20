import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		int arrayLen;
		
		Scanner s= new Scanner(System.in);
		System.out.println("pease enter the lenth of the array ");
		
		
		arrayLen=s.nextInt();
		
		int[] p=new int[arrayLen];
		System.out.println("please enter  array values");
		
		for(int i=0;i<arrayLen;i++){
		System.out.print("p["+i+"]=");
		p[i]=s.nextInt();
	}
		
		int lenthArray =p.length;
		System.out.println("array content is");
		for(int i=0;i<lenthArray;i++){
			System.out.println("p["+i+"]="+p[i]);
		}
		
	}

}
