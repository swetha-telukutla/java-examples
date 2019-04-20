package order;

public class ShippedOrder extends Order {

	private int charges=4;
	  
	
	
	
	
	public double ComputePrice(){
		
	double	orderCost=super.ComputePrice()+charges;
		return orderCost;
		
		
	
	

	
	}
}
