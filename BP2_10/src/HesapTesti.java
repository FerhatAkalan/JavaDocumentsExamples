import java.util.Scanner;

public class HesapTesti {

	public static void main(String[] args) {
		double yatirilanMiktar;
		Hesap hesap1 = new Hesap("Ali Can", 50.00);
		Hesap hesap2 = new Hesap("Ay�e Su", -7.53);
		Hesap hesap3 = new Hesap("Ahmet", 10);
		Hesap hesap4 = new Hesap("Zeynep", 100);

		System.out.printf("%s Bakiye : %.2f TL\n", hesap1.getIsim(), hesap1.getBakiye());
		System.out.printf("%s Bakiye : %.2f TL\n\n", hesap2.getIsim(), hesap2.getBakiye());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hesap1 i�in yat�r�lacak para miktar�n� giriniz: ");
		yatirilanMiktar = input.nextDouble();
		System.out.printf("Hesap1\'e %.2f TL yat�r�l�yor\n", yatirilanMiktar);
		hesap1.paraYatir(yatirilanMiktar);
		
		System.out.printf("%s Bakiye : %.2f TL\n", hesap1.getIsim(), hesap1.getBakiye());
		System.out.printf("%s Bakiye : %.2f TL\n\n", hesap2.getIsim(), hesap2.getBakiye());
		
		System.out.print("Hesap2 i�in yat�r�lacak para miktar�n� giriniz: ");
		yatirilanMiktar = input.nextDouble();
		System.out.printf("Hesap2\'ye %.2f TL yat�r�l�yor\n", yatirilanMiktar);
		hesap2.paraYatir(yatirilanMiktar);
		
		System.out.printf("%s Bakiye : %.2f TL\n", hesap1.getIsim(), hesap1.getBakiye());
		System.out.printf("%s Bakiye : %.2f TL\n\n", hesap2.getIsim(), hesap2.getBakiye());
		
		int toplamHesapSayisi = Hesap.getHesapSayisi();
		System.out.println("Bug�n toplam " + toplamHesapSayisi + " hesap a�t�k.");
		
	}

}
