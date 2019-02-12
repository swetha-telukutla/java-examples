package javaAssigments;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=987;;
		int rnum=0;
		while(num!=0){
			rnum=rnum*10;
			rnum=rnum+num%10;
			num=num/10;
			
		}
		System.out.println("reverse number is="+ rnum);

	
	}

	}


