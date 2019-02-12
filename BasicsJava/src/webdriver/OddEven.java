package webdriver;

import java.util.Scanner;

public class OddEven {
	static int a;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers");
		a=scan.nextInt();
		
		if(a%2==0){
			System.out.println("input number is even");
		}
			else{
				System.out.println("input number is odd");
				
			}
		
		

	}

}
