
public class Hesaplama {
	public static void hesaplama(Cember cember) {
		System.out.println("�emberin �evresi: " + cember.cevreHesapla());
		System.out.println("�emberin yar��ap�: "+ cember.getYaricap());
	}
	public static void hesaplama(Daire daire) {
		System.out.println("Daireinin �evresi: " + daire.cevreHesapla());
		System.out.println("Daireinin alan�: " + daire.alanHesapla());
		System.out.println("Daireinin yar��ap�: "+ daire.getYaricap());
	}
	public static void hesaplama(Kare kare) {
		System.out.println("Karenin bir kenar�: " + kare.getKenar());
		System.out.println("Karenin �evresi: " + kare.cevreHesapla());
		System.out.println("Karenin alan�: " + kare.alanHesapla());
	}
	public static void hesaplama(Kup kup) {
		System.out.println("K�p�n bir kenar�: " + kup.getKare1().getKenar());
		System.out.println("K�p�n alan�: " + kup.alanHesapla());
		System.out.println("K�p�n hacmi: " + kup.hacimHesapla());
	}
	
}
