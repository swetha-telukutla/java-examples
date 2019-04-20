package order;

public class MainClass extends ShippedOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

MainClass s=new MainClass();
s.setName("telukutla");
System.out.println(s.getName());
s.setNumber(3456);
System.out.println(s.getNumber());
s.setQuatntity(5);
System.out.println(s.getQuantity());
s.setUnitCost(34.7);
System.out.println(s.getcost());

//set.setComputerPrice();
System.out.println(s.ComputePrice());




	}

}
