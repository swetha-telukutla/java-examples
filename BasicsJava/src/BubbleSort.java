
public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={3,6,2,8,6,4};	
		
		int temp;
		for( int i=0;i<array.length;i++){
			for( int j=0;j<array.length-1;j++){
				if(array[j]>array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
				
			
			}
		}
					
			
		
			// to print an array
		
			for( int i=0;i<array.length;i++){
				System.out.println(array[i]);
			}
		
		


}}
