import java.util.Scanner;
/*
 *döngü baslatma
 *while(kosul){
 *	iþlem1
 *	iþlem2
 *	iþlem3
 *	artýrma	, azaltma0
 *} 
 *
 */
public class Ders9 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int sayi;
		System.out.println("Sayýyý giriniz: ");
		sayi = keyboard.nextInt();
		int faktoriyel = 1;
		
		while(sayi >= 1) {
			faktoriyel *= sayi;
			sayi--;
		}
		System.out.println("Faktöriyel: " + faktoriyel);
		
		}

}
