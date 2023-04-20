package DersOrnek;

import java.util.Scanner;
//Döngü Yineleme Sayýsýný Kontrol Etme
public class DersOrnek10 {

	public static void main(String[] args) {
		System.out.println("Pozitif sayýlar giriniz.");
		System.out.println("Veri giriþini sonlandýrmak için");
		System.out.println("negatif bir sayý giriniz.");
		int toplam = 0;
		boolean dahaVarmi = true;
		Scanner keyboard = new Scanner(System.in);
		while(dahaVarmi) 
		{
			int sayi = keyboard.nextInt();
			if (sayi < 0) 
			{
				dahaVarmi = false;
			}
			else {
				toplam += sayi;
			}
		}
		System.out.println("Girilen sayilarin toplami: " + toplam);
	}

}
