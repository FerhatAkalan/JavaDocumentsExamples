package DersOrnek;

import java.util.Scanner;
//sonsuz dongu ornegi
public class DersOrnek7 {

	public static void main(String[] args) {
		int sayac, sayi;
		System.out.println("Bir say� giriniz: ");
		Scanner keyboard = new Scanner(System.in);
		sayi = keyboard.nextInt();
		sayac = 1;
		while(true)
		{
			System.out.print(sayac + ", ");
			sayac++;
			//sonsuz donguye girmemesi icin if ifadesi ile break komutunu ekliyoruz.
			//sayac sayidan buyuk oldugu zaman donguden c�k�cak.
			if (sayac > sayi)
			{
				break;
			}
		}
		System.out.println();
		System.out.println("D�ng� tamamland�.");
	}

}
