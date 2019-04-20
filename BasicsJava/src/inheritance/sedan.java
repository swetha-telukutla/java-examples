package inheritance;

public class sedan extends Cars {
	public void move() {
		System.out.println("this is the sedan child class");
	}

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.move();
		Automobile a = new Automobile();
		a.move();
		Cars c = new Cars();
		c.move();
		sedan s = new sedan();
		s.move();

	}
}
