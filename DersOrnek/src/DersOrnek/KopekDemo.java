package DersOrnek;


public class KopekDemo {

	public static void main(String[] args) {
		Kopek kopek1 = new Kopek();
		kopek1.isim  = "Balto";
		kopek1.yas = 8;
		kopek1.soy = "Sibirya Kurdu";
		kopek1.ciktiYazdir();
		
		Kopek kopek2 = new Kopek();
		kopek2.isim = "Scooby";
		kopek2.yas = 42;
		kopek2.soy = "Danua";
		System.out.println(kopek2.isim + " " + kopek2.soy + " soyundandýr.");
		System.out.println("O " + kopek2.yas + " yaþýndadýr veya ");
		
		int insanYasi = kopek2.insanYasiHesapla();
		System.out.println(insanYasi + " insan yaþýndadýr.");

	}

}
