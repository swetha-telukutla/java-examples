package javaAssigments;

import java.util.Scanner;

public class FactrorialNumber {
	public static void main(String[] args){
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value for factorial");
		int num=sc.nextInt();
		System.out.println("entered number is"+num);
		for(int i=1;i<=num;i++){
			fact=fact*i;
			
		}
			System.out.println("the factorial of "+num+"is"+fact);
			
		
	}
	}


