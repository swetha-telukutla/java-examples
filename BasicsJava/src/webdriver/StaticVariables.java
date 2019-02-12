package webdriver;

public class StaticVariables {
	static int i;
	int j;
	
	public static void main(String[] args){
		StaticVariables s=new StaticVariables();
		s.stopMe();
		s.j=98;
		
		public static void  runMe(){ //static method
			i=76;
		}
		public void stopMe(){//Non static method
			runMe();//static method..
			i=90;//static variable
			j=30;//non static variable
		}
	}

}
