package Ders6;

import java.util.Scanner;
// KOÞULLU DURUMLAR ÝF ELSE
public class Ders6 {

	public static void main(String[] args) {
		/*
		 * Karþýlaþtýrma operatörleri
		 * a == b ---> eþit mi (eþitse true degilse false)
		 * a != b ---> eþit deðil mi (eþit deðilse true eþitse false)
		 * a > b ---> a b den büyük mü (Büyükse true deðilse false)
		 * a < b ---> a b den kücük mü (kücükse true degilse false)
		 * a <= b ---> a b ye esit veya b den kucuk mu (oyleyse true degilse false)
		 * a >= b ---> a b ye eþit veya b den büyük mü (öyleyse true degilse false)
		 * 
		 * if (koþul) {
		 * 		if bloðu
		 * 		burada koþul saglanýnca iþlemler yapýlýyor..
		 * }
		 * 
		 */
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Notunuzu girin: ");
		
		int note = klavye.nextInt();
		if (note > 90) {
			
			System.out.println("Dersten geçtiniz.... Notunuz AA");
		
		}
		else if (note > 85) {
			
			System.out.println("Dersten geçtiniz.... Notunuz BA");
			
		}
		else if (note > 80) {
			System.out.println("Dersten geçtiniz.... Notunuz BB");
		}
		else {
			
			System.out.println("Dersten Kaldýnýz....");
			
		}
		
	}

}
