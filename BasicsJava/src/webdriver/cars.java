package webdriver;

public class cars {
	String model;
	String color;
	int door;
	static int wheels;
	int price;
	public static void main(String[] args){
		
		cars Audi = new cars();
		Audi.model="a7";
		Audi.color="black";
		Audi.door=4;
		wheels = 4;
		Audi.price=50000;
		System.out.println("Audi model = "+Audi.model);
		System.out.println("Audi color = "+Audi.color);
		System.out.println("Audi door = "+Audi.door);
		System.out.println("Audi wheels = "+Audi.wheels);
		System.out.println("Audi price = "+Audi.price);
		
		cars BMW = new cars();
		BMW.model="BMW7";
		BMW.color="black";
		BMW.door=2;
		wheels =6;
		BMW.price=60000;
		System.out.println("BMW model = "+BMW.model);
		System.out.println("BMW color = "+BMW.color);
		System.out.println("BMW door = "+BMW.door);
		System.out.println("BMW wheels = "+BMW.wheels);
		System.out.println("BMW price = "+BMW.price);
		
		
		cars Honda = new cars();
		//Honda.model="a7";
		//Honda.color="black";
	//	Honda.door=4;
	//	Honda.price=50000;
		wheels=3;
		System.out.println("Honda model = "+Honda.model);
		System.out.println("Honda color = "+Honda.color);
		System.out.println("Honda door = "+Honda.door);
		System.out.println("Honda wheels = "+Honda.wheels);
		System.out.println("Honda price = "+Honda.price);
		
	}

}
