package DersOrnek;

import java.util.Scanner;
//D�ng� Yineleme Say�s�n� Kontrol Etme
public class DersOrnek10 {

	public static void main(String[] args) {
		System.out.println("Pozitif say�lar giriniz.");
		System.out.println("Veri giri�ini sonland�rmak i�in");
		System.out.println("negatif bir say� giriniz.");
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
