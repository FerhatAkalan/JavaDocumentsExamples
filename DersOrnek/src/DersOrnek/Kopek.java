package DersOrnek;


public class Kopek {
	//�rnek De�i�kenler - Instance Variables
	public String isim;
	public String soy;
	public int yas;
	
	//Geri de�er d�nd�rmeyen metot: void metodu
	public void ciktiYazdir() {
		System.out.println("�sim: " + isim);
		System.out.println("Soy: " + soy);
		System.out.println("Takvim ya��: " + yas);
		System.out.println("�nsan ya��: " + insanYasiHesapla());
	}
	
	// Method that returns a value 
	public int insanYasiHesapla() {
		int insanYasi = 0;
		if (yas <= 2) {
			insanYasi = yas * 11;
		}
		else {
			insanYasi = 22 + ((yas - 2) * 5);
		}
		return insanYasi;
	}
}
