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
		/* Sekil sýnýfý soyut sýnýf sekillerin alanýný hesaplayan ortak metodu var.
		 * Nokta sýnýfý noktanýn konumunu tutan alanlarý var.
		 * Kenar sýnýfýnýn konumunu tutan nokta ve uzunluk alanlarý var.
		 * Kare sýnýfý Sekil sýnýfýnýn alt sýnýfý konumu, kenar deðiþkeni ve alanýný hesaplayan metodu var.
		 * Kup sýnýfý Sekil sýnýfýnýn alt sýnýfý konumu, kare deðiþkeni ve alanýný hesaplayan metodu var.
		 * Cember sýnýfýnýn yaricap deðiþkeni var.
		 * Daire sýnýfý Sekil sýnýfýnýn alt sýnýfý, yaricap deðiþkeni ve konumu tutan nokta alaný var. Alanýný hesaplayan
		 * metodu var.
		 * AnaProgram bu sýnýflarýn nesnelerini oluþturuyor ve vectorun içine atýyor.
		 * for döngüsü ile bu vectordeki elemanlarý sekil sýnýfýnýna dönüþtürüyor
		 * Sekil sýnýfýna dönüþen elemenlarýn alanlarýný hesaplayýp ekrana yazdýrýyor.
		 *
		 */
	}
}