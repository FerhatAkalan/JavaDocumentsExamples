import java.util.Scanner;

public class Ders14 {
/*
 * Eri�im_Belirleyici(Opsiyonel) Ekstra_�zellikler D�n��_Tipi Fonksiyon_Ad�(Parametreler){
 * 			
 * 			//Buras� Fonksiyon blo�u
 * 			//Fonksiyonun yapaca�� i�lemler burada olacak.
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
