
public class Sedan extends Car{
	
	private int length;

	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}
	public double getSalePrice() {
		double salePrice = super.getSalePrice();
		if(this.length > 6) {
			salePrice = super.getSalePrice() - ((super.getSalePrice()*5)/100);
		}
		else {
			salePrice = super.getSalePrice() - ((super.getSalePrice()*10)/100);
		}
		return salePrice;
	}
	public int getLength() {
		return length;
	}
}