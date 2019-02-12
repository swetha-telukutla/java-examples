import java.util.Scanner;

public class FirstBiggestNumber {
	public static void main(String[] args){
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the three numbers");
		int i=scan.nextInt();
		int j=scan.nextInt();
		int k=scan.nextInt();
				
		System.out.println("enter the numbers are "+i+ + j + +k);
		
		
		if((i>j ) && (i>k) ){
			System.out.println(i +"is the  first biggest number than "+ k +"and"+ j);
		}
			else if((j>k)&&(j>i)){	
			System.out.println(j +"is the first biggest number than"+k +"and"+i);
			}
			else{
				System.out.println(k+"is the first biggest number");
				
		}}
	}


