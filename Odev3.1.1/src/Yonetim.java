
public class Yonetim {
	
	
	public static void Rapor() {
		System.out.println();
		System.out.println("OGS sisteminden geçen araçlar:");
		System.out.println();
		System.out.println("Plaka\t Ýsim\t Soyisim\t Araç Sýnýfý\t Geçtiði Tarih");
		for(int a=0 ; a < Gise.getGecenAraclar().length; a++) {
			System.out.println(Gise.getGecenAraclar()[a]);
			System.out.println();
		}
		System.out.println("Kazanç: " + Gise.getKazanc() + " TL");
	}

}
