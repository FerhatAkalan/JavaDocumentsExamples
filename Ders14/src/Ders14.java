import java.util.Scanner;

public class Ders14 {
/*
 * Eriþim_Belirleyici(Opsiyonel) Ekstra_Özellikler Dönüþ_Tipi Fonksiyon_Adý(Parametreler){
 * 			
 * 			//Burasý Fonksiyon bloðu
 * 			//Fonksiyonun yapacaðý iþlemler burada olacak.
 * 		}
 */
	public static void faktoriyel() {
		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		int faktoriyel = 1;
		
		while(sayi>0) {
			
			faktoriyel *= sayi;
			sayi--;
			
		}
		System.out.println("Faktoriyel: " + faktoriyel);
	}
	public static void main(String[] args) {
		
		faktoriyel();

	}

}
