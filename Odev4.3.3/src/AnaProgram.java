import java.util.Vector;

public class AnaProgram {

	public static void main(String[] args) {
		Nokta nokta = new Nokta(1,2,3);
		Kenar kenar = new Kenar(nokta,5);
		Cember cember = new Cember(nokta,5);
		Daire daire = new Daire(nokta, 5);
		Kare kare = new Kare(nokta, kenar);
		Kup kup = new Kup(nokta, kare);
		Vector vector = new Vector();
		vector.add(daire);
		vector.add(kare);
		vector.add(kup);
		for(int sayac = 0; sayac < vector.size(); sayac++) {
			System.out.println(((Sekil)vector.get(sayac)).alanHesapla());
			System.out.println();
		}
		/* Sekil s�n�f� soyut s�n�f sekillerin alan�n� hesaplayan ortak metodu var.
		 * Nokta s�n�f� noktan�n konumunu tutan alanlar� var.
		 * Kenar s�n�f�n�n konumunu tutan nokta ve uzunluk alanlar� var.
		 * Kare s�n�f� Sekil s�n�f�n�n alt s�n�f� konumu, kenar de�i�keni ve alan�n� hesaplayan metodu var.
		 * Kup s�n�f� Sekil s�n�f�n�n alt s�n�f� konumu, kare de�i�keni ve alan�n� hesaplayan metodu var.
		 * Cember s�n�f�n�n yaricap de�i�keni var.
		 * Daire s�n�f� Sekil s�n�f�n�n alt s�n�f�, yaricap de�i�keni ve konumu tutan nokta alan� var. Alan�n� hesaplayan
		 * metodu var.
		 * AnaProgram bu s�n�flar�n nesnelerini olu�turuyor ve vectorun i�ine at�yor.
		 * for d�ng�s� ile bu vectordeki elemanlar� sekil s�n�f�n�na d�n��t�r�yor
		 * Sekil s�n�f�na d�n��en elemenlar�n alanlar�n� hesaplay�p ekrana yazd�r�yor.
		 *
		 */
	}
}