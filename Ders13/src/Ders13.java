import java.util.Scanner;

/*
 *Eri�im Belirleyici (Opsiyonel) Ekstra_�zellikler D�n��_tipi Fonkisyon_ad�(Parametreler){
 *		
 *		//Buras� fonkisyon blo�u
 *		//Fonkisoyunun yapaca�� i�lemler burada olacak.
 *	}
 */
public class Ders13 {
	
	public static void faktoriyel() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir say� giriniz: ");
		int sayi = scan.nextInt();
		int faktoriyel = 1;
		while (sayi > 0) {
			faktoriyel *= sayi;
			sayi--;
		}
		System.out.println("Faktoriyel : " + faktoriyel);
		
	}

	public static void main(String[] args) {
		
		faktoriyel(); // Fonksiyon Cagr�s�
		
	}

}
