package Ders6;

import java.util.Scanner;
// KO�ULLU DURUMLAR �F ELSE
public class Ders6 {

	public static void main(String[] args) {
		/*
		 * Kar��la�t�rma operat�rleri
		 * a == b ---> e�it mi (e�itse true degilse false)
		 * a != b ---> e�it de�il mi (e�it de�ilse true e�itse false)
		 * a > b ---> a b den b�y�k m� (B�y�kse true de�ilse false)
		 * a < b ---> a b den k�c�k m� (k�c�kse true degilse false)
		 * a <= b ---> a b ye esit veya b den kucuk mu (oyleyse true degilse false)
		 * a >= b ---> a b ye e�it veya b den b�y�k m� (�yleyse true degilse false)
		 * 
		 * if (ko�ul) {
		 * 		if blo�u
		 * 		burada ko�ul saglan�nca i�lemler yap�l�yor..
		 * }
		 * 
		 */
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Notunuzu girin: ");
		
		int note = klavye.nextInt();
		if (note > 90) {
			
			System.out.println("Dersten ge�tiniz.... Notunuz AA");
		
		}
		else if (note > 85) {
			
			System.out.println("Dersten ge�tiniz.... Notunuz BA");
			
		}
		else if (note > 80) {
			System.out.println("Dersten ge�tiniz.... Notunuz BB");
		}
		else {
			
			System.out.println("Dersten Kald�n�z....");
			
		}
		
	}

}
