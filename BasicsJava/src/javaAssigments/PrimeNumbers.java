package javaAssigments;

public class PrimeNumbers {

	public static void main(String[] args) {
		 int num=13;
		 int reminder;
		boolean isprime=true;

		// TODO Auto-generated method stub
		for(int i=2;i<=num/2;
				i++){
		reminder=num%i;
		System.out.println(num +"is divided by"+i+"gives a reminder"+reminder);
		if(reminder==0){
			isprime=false;
			break;
			
		}}
		if(isprime){
			System.out.println(num+"is a prime number");
		}
			else{
				System.out.println(num+"is not a prime number");
			
		}}}
			
		
		
		
		
		
		
		
