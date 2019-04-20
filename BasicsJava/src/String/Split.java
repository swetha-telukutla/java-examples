package String;

public class Split {
	public static void main(String[] args) {
		String str1="this is my room";
		
		System.out.println("before:"+str1);
		String[] a=str1.split(" ");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			
		}
	}

}
