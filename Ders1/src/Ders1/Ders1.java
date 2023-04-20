package Ders1;

import java.util.Scanner;

public class Ders1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int devam = 1;
		double toplam = 0;
		double ortalama = 0;
		int sayac = 0;
		int sayi;
		while(devam == 1) 
		{
			System.out.print("Bir tamsayi giriniz: ");
			sayi = keyboard.nextInt();
			if(sayi != 0)
			{
				sayac++;
				toplam += sayi;
				ortalama = toplam / sayac;
			}
			if (sayi==0) 
			{
				devam = 0;
			}
			
		}
		System.out.println("Toplam: " + toplam);
		System.out.println("Ortalama: " + ortalama);
	}

}
