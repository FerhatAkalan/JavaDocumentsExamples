
public class MyOwnAutoShop {

	public static void main(String[] args) {
		Sedan sedan1 = new Sedan(100, 1000, "Beyaz", 5);
		Ford ford1 = new Ford(150, 2000, "Mavi", 2021, 20);
		Truck truck1 = new Truck(100, 3000, "Kýrmýzý", 2100);
		Car car1 =  new Car(200, 4000, "Siyah");
		System.out.println("Sedan araba satýþ fiyatý: " + sedan1.getSalePrice());
		System.out.println();
		System.out.println("Ford araba satýþ fiyatý: " + ford1.getSalePrice());
		System.out.println();
		System.out.println("Truck araba satýþ fiyatý: " + truck1.getSalePrice());
		System.out.println();
		System.out.println("Araba satýþ fiyatý: " + car1.getSalePrice());
	}
}