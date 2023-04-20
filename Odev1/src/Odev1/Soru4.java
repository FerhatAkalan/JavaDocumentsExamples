package Odev1;

import java.util.Scanner;
// devam, sayi ve min degiskenlerini tanimliyoruz.
// min degiskenine 0 degerini atiyoruz.
// devam 1'e esit ise dongu devam ediyor.
// kullanicidan pozitif sayi girmesini istiyoruz.
// girilen sayi negatif veya 0 ise while dongusu bir daha sayi girmesini istiyor.
// min 0 oldugu icin min degiskenine sayi degiskenini atiyoruz.
// bundan sonra girilecek sayi min degiskeninden kucuk ise o sayi min degiskenine atanir.
// kullanici sayi girmeye devam etmek istiyorsa 1'e basilir.
// kullanici sayi girmeye devam etmek istemiyorsa 0'a basilir.
// ekrana girilen sayilarýn en kucugu min degiskenini yazdirilir.
public class Soru4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int devam = 1;
		int sayi;
		int min = 0;
		while(devam == 1) {
			System.out.println("Pozitif bir sayi giriniz. ");
			sayi = keyboard.nextInt();
			while (sayi < 0) {
				System.out.println("Girdiginiz sayi negatif pozitif bir sayi giriniz:");
				sayi = keyboard.nextInt();
			}
			while (sayi == 0) 
			{
				System.out.println("Girdiginiz sayi 0 pozitif bir sayi giriniz: ");
				sayi = keyboard.nextInt();
			}
			if (min == 0 ) 
			{
				min = sayi;
			}
			if(sayi < min) 
			{
				min = sayi;
			}
			System.out.println("Devam etmek istiyormusuz.");
			System.out.println("Evet ise 1, hayýr ise 0 degerini giriniz");
			devam = keyboard.nextInt();
		}
		System.out.println("Girilen en kücük sayi: " + min);
	}
}