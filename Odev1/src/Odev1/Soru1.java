package Odev1;

import java.util.Scanner;
// Vücut kilo indeksi hesaplama sorusu.
// agirlik, boy, durum ve VKI degiskenleri tanýmlýyoruz.
// kullanýcýdan kilosu ve boyunu alýyoruz.
// Not: boy nokta ile girilince hata veriyor virgül ile giriniz (1,72).
// VKI'sine göre durumu zayýf, normal, kilolu, obez veya ciddi obez oluyor.
// kilo, boy, VKI ve durumunu ekrana yazdýrýyoruz.

public class Soru1 {

	public static void main(String[] args) {
		double agirlik, boy ,VKI;
		String durum = "Bos";
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Kilonuzu giriniz: ");
		agirlik = keyboard.nextDouble();
		System.out.println();
		System.out.print("Boyunuzu giriniz: ");
		boy = keyboard.nextDouble();
		System.out.println();
		VKI = agirlik / (boy*boy);
		if (VKI < 18) 
		{
			durum = "Zayýf";
		}
		else if (VKI >= 18 && VKI < 25)
		{
			durum = "Normal";
		}
		else if (VKI >= 25 && VKI < 30) 
		{
			durum = "Kilolu";
		}
		else if (VKI >=30 && VKI < 35) 
		{
			durum = "Obez";
		}
		else if (VKI >= 35) 
		{
			durum = "Ciddi Obez";
		}
		else 
		{
			System.out.println("Gecersiz durum!");
		}
		System.out.println("Kilonuz: " + agirlik);
		System.out.println("Boyunuz: " + boy);
		System.out.println("Vücut kitle indeksiniz: " + VKI);
		System.out.println("Durumunuz: " + durum);
	}
}