import java.util.Scanner;
/*
 *d�ng� baslatma
 *while(kosul){
 *	i�lem1
 *	i�lem2
 *	i�lem3
 *	art�rma	, azaltma0
 *} 
 *
 */
public class Ders9 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int sayi;
		System.out.println("Say�y� giriniz: ");
		sayi = keyboard.nextInt();
		int faktoriyel = 1;
		
		while(sayi >= 1) {
			faktoriyel *= sayi;
			sayi--;
		}
		System.out.println("Fakt�riyel: " + faktoriyel);
		
		}

}
