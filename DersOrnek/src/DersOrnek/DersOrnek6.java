package DersOrnek;

import java.util.Scanner;
//do while ornek
//dongu govdesi en az 1 defa calýstýrýlýr.
public class DersOrnek6 {

	public static void main(String[] args) {
		int sayac, sayi;
		Scanner keyboard = new Scanner(System.in);
		sayac = 1;
		System.out.println("Bir sayi giriniz: ");
		sayi = keyboard.nextInt();
		do
		{
			System.out.print(sayac + ", ");
			sayac++;
		} while(sayac <= sayi);
		System.out.println();
		System.out.println("Döngü tamamlandý");
		
	}	

}
