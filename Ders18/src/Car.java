
public class Car {
	
	private String color;
	private String model;
	private double engine;
	private int doors;
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		if (doors == 2 || doors == 4) {
			this.doors = doors;
		}
		else {
			System.out.println("Kapý Sayýsý sadece 2 veya 4 olabilir.");
		}
	}
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.color = "Gümüþ";
		car1.model = "Renault";
		car1.engine = 1.6;
		car1.doors = 4;
		System.out.println("Arabanýn Rengi: " + car1.color);
		System.out.println("Arabanýn Modeli: " + car1.model);
		System.out.println("Arabanýn Motor Hacmi: " + car1.engine);
		System.out.println("Arabanýn Kapý Sayýsý: " + car1.doors);
		
		car1.setColor("gümüþ");
		System.out.println("Arabanýn Yeni Rengi: " + car1.getColor());
	}

}
