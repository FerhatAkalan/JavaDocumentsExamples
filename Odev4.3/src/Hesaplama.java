
public class Hesaplama {
	public static void hesaplama(Cember cember) {
		System.out.println("Çemberin çevresi: " + cember.cevreHesapla());
		System.out.println("Çemberin yarýçapý: "+ cember.getYaricap());
	}
	public static void hesaplama(Daire daire) {
		System.out.println("Daireinin çevresi: " + daire.cevreHesapla());
		System.out.println("Daireinin alaný: " + daire.alanHesapla());
		System.out.println("Daireinin yarýçapý: "+ daire.getYaricap());
	}
	public static void hesaplama(Kare kare) {
		System.out.println("Karenin bir kenarý: " + kare.getKenar());
		System.out.println("Karenin çevresi: " + kare.cevreHesapla());
		System.out.println("Karenin alaný: " + kare.alanHesapla());
	}
	public static void hesaplama(Kup kup) {
		System.out.println("Küpün bir kenarý: " + kup.getKare1().getKenar());
		System.out.println("Küpün alaný: " + kup.alanHesapla());
		System.out.println("Küpün hacmi: " + kup.hacimHesapla());
	}
	
}
