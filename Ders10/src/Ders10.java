import java.util.Scanner;

public class Ders10 {
/*
 * do{
 * 
 * 
 * 
 * }
 * while(kosul);
 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Bir sayý giriniz: ");
		int sayi = keyboard.nextInt();
		int toplam = 0;
		
		do {
			//1234
			toplam += sayi % 10;
			sayi = sayi / 10;
			
			System.out.println("Toplam = " + toplam + " sayi = " + sayi);;
			
		} while(sayi > 0);
		System.out.println("Toplam = " + toplam);
	}

}
