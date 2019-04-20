import java.util.Scanner;

public class IneToString {
	public static void main(String[] args) {
		Scanner h= new Scanner(System.in);
		System.out.println("enter integer");
		int st=h.nextInt();
		System.out.println("string is");
		String str=Integer.toString(st);
		System.out.println(str);
		
	}

}
