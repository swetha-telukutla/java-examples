
public class StaticVaiablesAndMethods {
	static int i;// static variable--has rule --static methods accept only
					// static stuff
	int j;// non static variable--accepts everything

	public static void main(String[] args) {

		i = 94;
		StaticVaiablesAndMethods m = new StaticVaiablesAndMethods();
		m.stopMe();
		m.j = 98;

	}

	public static void runMe() {// static method
		i = 98;
	}

	public void stopMe() {// non static method
		runMe();// static method
		i = 90;// static variable
		j = 45;// non static variable
	}

}
