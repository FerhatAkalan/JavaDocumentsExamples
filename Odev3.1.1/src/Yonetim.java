
public class Yonetim {
	
	
	public static void Rapor() {
		System.out.println();
		System.out.println("OGS sisteminden ge�en ara�lar:");
		System.out.println();
		System.out.println("Plaka\t �sim\t Soyisim\t Ara� S�n�f�\t Ge�ti�i Tarih");
		for(int a=0 ; a < Gise.getGecenAraclar().length; a++) {
			System.out.println(Gise.getGecenAraclar()[a]);
			System.out.println();
		}
		System.out.println("Kazan�: " + Gise.getKazanc() + " TL");
	}

}
