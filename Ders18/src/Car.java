
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
			System.out.println("Kap� Say�s� sadece 2 veya 4 olabilir.");
		}
	}
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.color = "G�m��";
		car1.model = "Renault";
		car1.engine = 1.6;
		car1.doors = 4;
		System.out.println("Araban�n Rengi: " + car1.color);
		System.out.println("Araban�n Modeli: " + car1.model);
		System.out.println("Araban�n Motor Hacmi: " + car1.engine);
		System.out.println("Araban�n Kap� Say�s�: " + car1.doors);
		
		car1.setColor("g�m��");
		System.out.println("Araban�n Yeni Rengi: " + car1.getColor());
	}

}
