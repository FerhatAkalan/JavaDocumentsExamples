import java.util.Scanner;

public class YatirimHesapla {
	private static double yatirimTutari;
	private static double yilSayisi;
	private static double aylikFaiz;
	private static double deger;
	private static Scanner input = new Scanner(System.in);
	
	public static void bilgiAl() {
		System.out.print("Yat�r�m tutar�n� giriniz: ");
		yatirimTutari = input.nextDouble();
		System.out.print("Y�l say�s�n� giriniz: ");
		yilSayisi = input.nextDouble();
		System.out.print("Ayl�k faiz oran�n� giriniz: ");
		aylikFaiz = input.nextDouble();
	}
	
	public static void degerHesapla() {
		bilgiAl();
		double aySayisi = yilSayisi*12;
		deger = yatirimTutari;
		for(int sayac = 0; sayac < aySayisi; sayac++) {
			deger += ((yatirimTutari*aylikFaiz)/100);
		}
		System.out.println(yilSayisi + " y�l sonra yat�r�m�n�z�n de�eri: " + deger);
	}

	public static void main(String[] args) {
		degerHesapla();
	}
}