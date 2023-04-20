package DersOrnek;


public class Kopek {
	//Örnek Deðiþkenler - Instance Variables
	public String isim;
	public String soy;
	public int yas;
	
	//Geri deðer döndürmeyen metot: void metodu
	public void ciktiYazdir() {
		System.out.println("Ýsim: " + isim);
		System.out.println("Soy: " + soy);
		System.out.println("Takvim yaþý: " + yas);
		System.out.println("Ýnsan yaþý: " + insanYasiHesapla());
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
