package DersOrnek;

//Java s�n�f olu�turma.
public class Daire {
	//alanlar buraya yerle�tirilecek.
	//metotlar buraya yerle�tirilecek.
	//Alanlar� ekle;
	public double x, y;
	public double r;
	//�evre uzunlugunu geri d�nd�ren metot.
	public double uzunluk() {
		return 2 * 3.14 * r;
	}
	//Alan� geri d�nd�ren metot.
	public double alan() {
		return 3.14 * r * r;
	}
	
	public static void main(String[] args) {
		Daire daireA = new Daire();
		daireA.x = 25.0;
		daireA.y = 25.0;
		daireA.r = 3.0;
		double alan = daireA.alan();
		System.out.println("Dairenin alan�: " + alan);
	}

}
