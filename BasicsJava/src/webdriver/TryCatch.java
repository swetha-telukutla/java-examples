package webdriver;

public class TryCatch {
	public static void main(String[] args){
		int a=4;
		int b= 2;
		int div;
		try{
			div=a/b;
			System.out.println(div);
		}
			catch(Exception e){
		System.out.println(e);
		}
		finally{
			System.out.println("always excutes");
		}
		System.out.println("program exction complets");
	}

}
