
public class Truck extends Car {
	
	private int weight;
	
	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}
	
	public double getSalePrice() {
		double salePrice;
		salePrice = super.getSalePrice();
		if(this.weight > 2000) {
			salePrice = salePrice - (salePrice*10)/100;
		}
		else {
			salePrice = salePrice - (salePrice*20)/100;
		}
		return salePrice; 
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}