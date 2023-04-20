import java.util.Scanner;

/*
 *Eriþim Belirleyici (Opsiyonel) Ekstra_Özellikler Dönüþ_tipi Fonkisyon_adý(Parametreler){
 *		
 *		//Burasý fonkisyon bloðu
 *		//Fonkisoyunun yapacaðý iþlemler burada olacak.
 *	}
 */
public class Ders13 {
	
	public static void faktoriyel() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayý giriniz: ");
		int sayi = scan.nextInt();
		int faktoriyel = 1;
		while (sayi > 0) {
			faktoriyel *= sayi;
			sayi--;
		}
		System.out.println("Faktoriyel : " + faktoriyel);
		
	}

	public static void main(String[] args) {
		
		faktoriyel(); // Fonksiyon Cagrýsý
		
	}

}
