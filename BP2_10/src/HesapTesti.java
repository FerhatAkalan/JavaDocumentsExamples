import java.util.Scanner;

public class HesapTesti {

	public static void main(String[] args) {
		double yatirilanMiktar;
		Hesap hesap1 = new Hesap("Ali Can", 50.00);
		Hesap hesap2 = new Hesap("Ayşe Su", -7.53);
		Hesap hesap3 = new Hesap("Ahmet", 10);
		Hesap hesap4 = new Hesap("Zeynep", 100);

		System.out.printf("%s Bakiye : %.2f TL\n", hesap1.getIsim(), hesap1.getBakiye());
		System.out.printf("%s Bakiye : %.2f TL\n\n", hesap2.getIsim(), hesap2.getBakiye());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hesap1 için yatırılacak para miktarını giriniz: ");
		yatirilanMiktar = input.nextDouble();
		System.out.printf("Hesap1\'e %.2f TL yatırılıyor\n", yatirilanMiktar);
		hesap1.paraYatir(yatirilanMiktar);
		
		System.out.printf("%s Bakiye : %.2f TL\n", hesap1.getIsim(), hesap1.getBakiye());
		System.out.printf("%s Bakiye : %.2f TL\n\n", hesap2.getIsim(), hesap2.getBakiye());
		
		System.out.print("Hesap2 için yatırılacak para miktarını giriniz: ");
		yatirilanMiktar = input.nextDouble();
		System.out.printf("Hesap2\'ye %.2f TL yatırılıyor\n", yatirilanMiktar);
		hesap2.paraYatir(yatirilanMiktar);
		
		System.out.printf("%s Bakiye : %.2f TL\n", hesap1.getIsim(), hesap1.getBakiye());
		System.out.printf("%s Bakiye : %.2f TL\n\n", hesap2.getIsim(), hesap2.getBakiye());
		
		int toplamHesapSayisi = Hesap.getHesapSayisi();
		System.out.println("Bugün toplam " + toplamHesapSayisi + " hesap açtık.");
		
	}

}
