
public class PrintNumbers {
	public static void main(String[] args){
		
	/*	for(int a=1;a=<100;a++){
			System.out.println(a);
			
		}
	}
*/
		int n=1;
		printNum(n);
	}	
		
				

		private static void printNum(int num) {
			// TODO Auto-generated method stub
	
			if(num <= 100){ 
				System.out.println(num);
				printNum(num+1);
		}
		}}
