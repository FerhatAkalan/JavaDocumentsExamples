package Odev1;

import java.util.Scanner;
// Ekrandan girilen dakika g�n, saat ve dakikaya �eviren program.
// sayi, dakika, gun, saat degiskenlerini tanimliyoruz.
// kullanicidan dakika girmesini istiyoruz. Girilen dakikayi sayi degiskenine atiyoruz.
// sayi2 degiskenine kullanicidan aldigimiz sayiya atiyoruz.
// sayi degiskenini 1440'a boluyoruz. int veri tipi oldugu icin bolumun sonucu tamsay� veri tipinde olur.
// sayi 1440'tan buyuk ise sayi degiskeninden 1440 c�kar�yor dakika degiskenine sayiyi at�yoruz.
// dakika degiskenini 60'a boluyoruz int veri tipi oldugu icin bolumun sonucu tamsay� veri tipinde olur.
// dakika 60'tan buyuk ise dakikadan 60 c�kar�yoruz.
// sayi2, gun, saat, dakika degiskenlerini ekrana yazd�r�yoruz.
public class Soru2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int sayi,  dakika = 0;
		int gun, saat;
		int sayi2;
		System.out.println("Dakika giriniz: ");
		sayi = keyboard.nextInt();
		sayi2 = sayi;
		gun = sayi/1440;
		if (sayi >= 1440) 
		{
			while (sayi >= 1440) 
			{
				sayi -= 1440;
				dakika = sayi;
			}
		}
		else 
		{
			dakika = sayi;
		}
		saat = dakika/60;
		while(dakika>=60) 
		{
			dakika -= 60;
		}
		System.out.println(sayi2 + " Dakika = " + gun + " G�n " + saat + " Saat " + dakika + 
		" Dakika");
	}
}