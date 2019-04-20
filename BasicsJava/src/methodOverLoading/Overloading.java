package methodOverLoading;

public class Overloading {
	public static void main(String[] args) {
		Overloading a = new Overloading();
		int a1[] = { 2 };
		float a2[] = { 4, 7 };
		double a3[]={2,6,4,6};
		a.Area(a1);
		a.Area(a2);
		a.Area(a3);

	}

	public  void Area(int[] a1) {
		System.out.println("The area of the square is = " + a1[0] * a1[0]);

	}

	public void Area(float[] a2) {
		System.out.println("area of Traiangle is =" + (a2[0] * a2[1]) / 2);
	}

	 public void Area(double a3[]){
		 System.out.println("area of irregular quadrilateral is = "+ (0.5*a3[0]*(a3[1])+a3[2]) );
	 }

}
