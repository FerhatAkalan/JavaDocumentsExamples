import java.util.Scanner;

public class YatirimHesapla {
	private static double yatirimTutari;
	private static double yilSayisi;
	private static double aylikFaiz;
	private static double deger;
	private static Scanner input = new Scanner(System.in);
	
	public static void bilgiAl() {
		System.out.print("Yatýrým tutarýný giriniz: ");
		yatirimTutari = input.nextDouble();
		System.out.print("Yýl sayýsýný giriniz: ");
		yilSayisi = input.nextDouble();
		System.out.print("Aylýk faiz oranýný giriniz: ");
		aylikFaiz = input.nextDouble();
	}
	
	public static void degerHesapla() {
		bilgiAl();
		double aySayisi = yilSayisi*12;
		deger = yatirimTutari;
		for(int sayac = 0; sayac < aySayisi; sayac++) {
			deger += ((yatirimTutari*aylikFaiz)/100);
		}
		System.out.println(yilSayisi + " yýl sonra yatýrýmýnýzýn deðeri: " + deger);
	}

	public static void main(String[] args) {
		degerHesapla();
	}
}