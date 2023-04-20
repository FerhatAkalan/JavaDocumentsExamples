import java.util.Scanner;

public class ATM {
	private String kullanici_adi;
	private String parola;
	private Hesap hesap;
	private int islem = 0;
	private Scanner input = new Scanner(System.in);
	public ATM(Hesap hesap) {
		this.hesap = hesap;
	}
	public void giris() {
		System.out.println("Kullanýcý adý: ");
		kullanici_adi = input.nextLine();
		System.out.println("Þifre: ");
		parola = input.nextLine();
		while(islem != 4) {
			if(kullanici_adi.equals(this.hesap.getIsim()) && parola.equals(this.hesap.getSifre())) {
				System.out.println("Hoþgeldin "+ kullanici_adi +" Ýþlem seçiniz.");
				System.out.println("Seçtiðiniz iþlemin baþýndaki sayýyý giriniz.");
				System.out.println("1: Bakiye Sorgulama | 2: Para Yatýrma | 3: Para Çekme | 4: Sistemden Çýkýþ");
				islem = input.nextInt();
				switch(islem) {
					case 1:
						System.out.println("Bakiye: " + this.hesap.getBakiye() + " TL");
						System.out.println();
						break;
					case 2:
						this.paraYatirAtm();
						System.out.println();
						break;
					case 3:
						this.paraCekAtm();
						System.out.println();
						break;
					case 4:
						System.out.println("Sistemden çýkýlýyor.");;
						System.out.println();
						break;
					}
			}
			else if(kullanici_adi.equals(this.hesap.getIsim()) && parola != this.hesap.getSifre()) {
				System.out.println("Yanlýþ þifre!");
				break;
			}
			else if(kullanici_adi != this.hesap.getIsim() && parola.equals(this.hesap.getSifre())) {
				System.out.println("Kullanýcý adý yanlýþ!");
				break;
			}
			else {
				System.out.println("Kullanýcý adý ve þifre yanlýþ!");
				break;
			}
		}
		System.out.println("Çýkýþ yapýldý!");
		System.out.println();
	}
	public void paraYatirAtm() {
		System.out.println("Yatýrýlacak miktarý giriniz: ");
		double yatirilacakMiktar = input.nextDouble();
		this.hesap.paraYatir(yatirilacakMiktar);
	}
	public void paraCekAtm() {
		System.out.println("Çekilecek miktarý giriniz: ");
		double cekilecekMiktar = input.nextDouble();
		this.hesap.paraCek(cekilecekMiktar);
	}
}
