package webdriver;

import java.util.Scanner;

public class FindingBiggestNumbers {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the three numbers");
		
		int i=scan.nextInt();
		int j=scan.nextInt();
		int k=scan.nextInt();
		System.out.println("the entered numbers are"+i +" " + +j +" " +k);
		if((i>k)&&(i>j )){
			System.out.println(i +"is the first biggest number");
		}
			else if((j>k)&&(j<i)){
				System.out.println(j +"is the first biggest nmber");
			}
				else  {
					System.out.println(k +" is first biggest number");
					 
			
			}
		
		
		scan.close();	
		}
		
		
		
	}


