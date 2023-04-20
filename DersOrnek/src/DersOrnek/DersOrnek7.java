package DersOrnek;

import java.util.Scanner;
//sonsuz dongu ornegi
public class DersOrnek7 {

	public static void main(String[] args) {
		int sayac, sayi;
		System.out.println("Bir sayý giriniz: ");
		Scanner keyboard = new Scanner(System.in);
		sayi = keyboard.nextInt();
		sayac = 1;
		while(true)
		{
			System.out.print(sayac + ", ");
			sayac++;
			//sonsuz donguye girmemesi icin if ifadesi ile break komutunu ekliyoruz.
			//sayac sayidan buyuk oldugu zaman donguden cýkýcak.
			if (sayac > sayi)
			{
				break;
			}
		}
		System.out.println();
		System.out.println("Döngü tamamlandý.");
	}

}
