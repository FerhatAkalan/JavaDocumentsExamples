import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Yonetim {
	private static String[] gecenAraclar = new String[OGS.getGecenAracSayisi()];
	public static String[] getGecenAraclar() {
		return gecenAraclar;
	}
	public static void setGecenAraclar(String[] gecenAraclar) {
		Yonetim.gecenAraclar = gecenAraclar;
	}
	public static void Rapor() {
		LocalDate tarih = LocalDate.now();
		String tarih2 = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(tarih);
		System.out.println();
		System.out.println(tarih2 +" Tarihinde OGS sisteminden ge�en ara�lar:");
		System.out.println();
		System.out.println("Plaka\t �sim\t Soyisim\t Ara� S�n�f�\t Ge�ti�i Tarih");
		for(int a=0 ; a < gecenAraclar.length; a++) {
			System.out.println(gecenAraclar[a]);
			System.out.println();
		}
		System.out.println(tarih2 + " tarihindeki kazan�: " + OGS.getKazanc() + " TL");
	}
}
