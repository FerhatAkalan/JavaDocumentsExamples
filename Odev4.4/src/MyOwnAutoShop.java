
public class MyOwnAutoShop {

	public static void main(String[] args) {
		Sedan sedan1 = new Sedan(100, 1000, "Beyaz", 5);
		Ford ford1 = new Ford(150, 2000, "Mavi", 2021, 20);
		Truck truck1 = new Truck(100, 3000, "K�rm�z�", 2100);
		Car car1 =  new Car(200, 4000, "Siyah");
		System.out.println("Sedan araba sat�� fiyat�: " + sedan1.getSalePrice());
		System.out.println();
		System.out.println("Ford araba sat�� fiyat�: " + ford1.getSalePrice());
		System.out.println();
		System.out.println("Truck araba sat�� fiyat�: " + truck1.getSalePrice());
		System.out.println();
		System.out.println("Araba sat�� fiyat�: " + car1.getSalePrice());
	}
}