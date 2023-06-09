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
		System.out.println("Kullan�c� ad�: ");
		kullanici_adi = input.nextLine();
		System.out.println("�ifre: ");
		parola = input.nextLine();
		while(islem != 4) {
			if(kullanici_adi.equals(this.hesap.getIsim()) && parola.equals(this.hesap.getSifre())) {
				System.out.println("Ho�geldin "+ kullanici_adi +" ��lem se�iniz.");
				System.out.println("Se�ti�iniz i�lemin ba��ndaki say�y� giriniz.");
				System.out.println("1: Bakiye Sorgulama | 2: Para Yat�rma | 3: Para �ekme | 4: Sistemden ��k��");
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
						System.out.println("Sistemden ��k�l�yor.");;
						System.out.println();
						break;
					}
			}
			else if(kullanici_adi.equals(this.hesap.getIsim()) && parola != this.hesap.getSifre()) {
				System.out.println("Yanl�� �ifre!");
				break;
			}
			else if(kullanici_adi != this.hesap.getIsim() && parola.equals(this.hesap.getSifre())) {
				System.out.println("Kullan�c� ad� yanl��!");
				break;
			}
			else {
				System.out.println("Kullan�c� ad� ve �ifre yanl��!");
				break;
			}
		}
		System.out.println("��k�� yap�ld�!");
		System.out.println();
	}
	public void paraYatirAtm() {
		System.out.println("Yat�r�lacak miktar� giriniz: ");
		double yatirilacakMiktar = input.nextDouble();
		this.hesap.paraYatir(yatirilacakMiktar);
	}
	public void paraCekAtm() {
		System.out.println("�ekilecek miktar� giriniz: ");
		double cekilecekMiktar = input.nextDouble();
		this.hesap.paraCek(cekilecekMiktar);
	}
}
