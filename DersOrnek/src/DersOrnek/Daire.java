package DersOrnek;

//Java sýnýf oluþturma.
public class Daire {
	//alanlar buraya yerleþtirilecek.
	//metotlar buraya yerleþtirilecek.
	//Alanlarý ekle;
	public double x, y;
	public double r;
	//Çevre uzunlugunu geri döndüren metot.
	public double uzunluk() {
		return 2 * 3.14 * r;
	}
	//Alaný geri döndüren metot.
	public double alan() {
		return 3.14 * r * r;
	}
	
	public static void main(String[] args) {
		Daire daireA = new Daire();
		daireA.x = 25.0;
		daireA.y = 25.0;
		daireA.r = 3.0;
		double alan = daireA.alan();
		System.out.println("Dairenin alaný: " + alan);
	}

}
