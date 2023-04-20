package Odev1;

import java.util.Scanner;
//aralik, tahmin, devam ve kontrol degiskenlerini tanimliyoruz.
//tahmin ve aralik degiskenini 50 sayisini atiyoruz.
//devam 0'a esit ise while dongusu calisiyor.
//ekrana tahmin yaziliyor.
//tahmin dogru ise 1'e yanlis ise 0'a basiliyor.
//tutulan sayi tahminden düsükse 0'a yüksekse 1'e basiliyor.
//aralik degiskenini 2'ye bolup aralik degiskenine atiyoruz.
//eger yüksekse tahmine bu sayiyi ekliyoruz.
//eger düsükse tahminden bu sayiyi cikariyoruz.
//sayi dogru tahmin edildigi zaman ekrana tutulan sayi yazilir.
public class Soru3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Aklınızdan 1 ile 100 arasinda bir sayi tutunuz.");
		int aralik = 50 ;
		int tahmin = 50;
		int devam = 0;
		int kontrol = 0;
		while (devam == 0) 
		{
			System.out.println("Tahminim: " + tahmin);
			System.out.println("Yanlıssa 0 degerini, dogruysa 1 degerini giriniz: ");
			devam = keyboard.nextInt();
			if (devam == 1)
			{
				break;
			}
			System.out.println("Tahminim düsükse 0 degerini, yüksekse 1 degerini giriniz: ");
			kontrol = keyboard.nextInt();
			if (aralik != 1) 
			{
				aralik = aralik/2;
			}
			System.out.println("aralık" + aralik);
			if (kontrol == 1) 
			{
				tahmin += aralik;
			}
			else
			{
				tahmin -= aralik;
			}
		}
		System.out.println("Tuttugunuz sayi: " + tahmin);
	}
}
