package DersOrnek;

import java.util.Scanner;
//while ornek
public class DersOrnek5 {

	public static void main(String[] args) {
		int sayac , sayi;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Bir sayý giriniz: ");
		
		sayi = keyboard.nextInt();
		sayac = 1;
		while (sayac <= sayi)
		{
			System.out.print(sayac + ", ");
			sayac++;
		}
		System.out.println();
		System.out.println("Döngü tamamlandý.");
		
		

	}

}
