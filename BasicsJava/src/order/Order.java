package order;

public class Order {

	private String customerName;
	private int customerNumber;
	private double orderQuatntity;
	private double unitCost;
	double result;

	public String getName() {
		return this.customerName;
	}

	public void setName(String name) {
		this.customerName = name;

	}

	public int getNumber() {
		return this.customerNumber;
	}

	public void setNumber(int Number) {
		this.customerNumber = Number;
	}

	public double getQuantity() {
		return this.orderQuatntity;

	}

	public void setQuatntity(double quantity) {
		this.orderQuatntity = quantity;
	}

	public double getcost() {
		return this.unitCost;

	}

	public void setUnitCost(double unitcost) {
		this.unitCost = unitcost;
	}

	public double ComputePrice() {
		 result = orderQuatntity * unitCost;
		return result;
	

	
		
		
		

	}
}
