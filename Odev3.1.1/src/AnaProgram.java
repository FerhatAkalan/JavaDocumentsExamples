
public class AnaProgram {

	private static Gise gise1;
	private static Gise gise2;
	private static Gise gise3;
	private static Gise gise4;

	public static void main(String[] args) {
		//Bir ara�ta OGS cihaz�n�n olmas� i�in Otomobil, Minibus, Otobus s�n�flar�nda bulunan setOgs(OGS ogs) fonksiyonun 
		//kullan�lmas� laz�m setOGS fonksiyonu kullan�lmam��sa arac�n OGS cihaz� yoktur. Gi�e s�n�f�nda kontrolu yap�l�r OGS cihaz� yoksa ge�i� yapamaz.
		Otomobil otomobil1 = new Otomobil("12AB34");
		Otomobil otomobil2 = new Otomobil("56CD78");
		Otomobil otomobil3 = new Otomobil("12AB45");
		Minibus minibus1 = new Minibus("90AB12");
		Otobus otobus1 = new Otobus("34CD56");
		Otobus otobus2 = new Otobus("78AB90");
		
		OGS ogs1 = new OGS("Ay�e" , "Su" , 100, otomobil1);
		otomobil1.setOgs(ogs1);

		OGS ogs2 = new OGS("Mehmet" , "Can" , 250, minibus1);
		minibus1.setOgs(ogs2) ;
		
		OGS ogs3 = new OGS("Ali" , "Can" , 300, otobus1);
		otobus1.setOgs(ogs3);
		
		OGS ogs4 = new OGS("Zeynep" , "Su" , 250, otomobil2);
		
		OGS ogs5 = new OGS("Elif", "Su", 50, otobus2);
		otobus2.setOgs(ogs5);
		gise1 = new Gise(ogs1);
		gise2 = new Gise(ogs2);
		gise3 = new Gise(ogs3);
		gise4 = new Gise(ogs4);
		gise1 = new Gise(ogs5);
		gise2 = new Gise(otomobil3);
	
		Yonetim.Rapor();
	}
}