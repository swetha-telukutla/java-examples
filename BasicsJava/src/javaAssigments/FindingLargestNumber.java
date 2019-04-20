package javaAssigments;

import java.util.Scanner;

public class FindingLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers");
		i =scan.nextInt();
		 j=scan.nextInt();
		 k=scan.nextInt();
		System.out.println("numbers are="+i +" ," + j +", " + k);
		if((i>j)&&(i>k)){
			System.out.println(i + "is the largest number");
		}
		if((j>i)&&(j>k)){
			System.out.println(j +"is the largest number");
		}
		else{
			System.out.println(k +"is the largest number");
			
		}
		
		scan.close();

	}

}
