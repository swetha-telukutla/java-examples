package javaAssigments;

public class RepeatingNumbersInTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={2,5,6,8};
int[] b={2,6,7,9};
for(int i=0;i<a.length;i++){
	for(int j=0;j<b.length;j++)
		if(a[i]==b[j])
			System.out.println("repeating numbers are ="+a[i]);
			
		
	}
	
}
	

}
