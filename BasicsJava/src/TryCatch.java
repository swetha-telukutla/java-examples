
public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,div;
a=4;b=0;
try{
	div =a/b;
	System.out.println(div);
}
	catch(Exception e){
		System.out.println (e);
	}
finally{
	System.out.println("excutes finally");
}
System.out.println("program completes");

	
}
	}


