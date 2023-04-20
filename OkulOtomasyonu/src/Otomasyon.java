import java.util.Scanner;

public class Otomasyon {
	private Yonetici yonetici;
	private Scanner input = new Scanner(System.in);
	private static String numara;
	
	public Otomasyon(Yonetici yonetici) {
		this.yonetici = yonetici;
	}
	
	public void otomasyon() {
		int islem = 0;
		System.out.println("---------------------------------");
		System.out.println("Okul Bilgi Sistemine Hoþgeldiniz");
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("*********************************");
		System.out.println("Giriþ yapýnýz...");
		System.out.println("*********************************");
		System.out.println();
		System.out.print("Kullanýcý adý: ");
		String kullanýcý = input.nextLine();
		System.out.print("Þifre: ");
		String sifre = input.nextLine();
		System.out.println();
		while(islem != 4) {
			
			if(yonetici.getSys_kul().equals(kullanýcý) && yonetici.getSys_sif().equals(sifre)) {
				System.out.println("Hoþgeldin " + yonetici.getSys_kul() + " bir iþlem seçiniz...");
				System.out.println();
				System.out.println("1 : Öðrenci Bilgisi Getir | 2 : Öðrenci Not Bilgisi Düzenleme | 3 : Devamsýzlýk Bilgisi Düzenleme | 4 : Sistemden Çýkýþ ");
				islem = input.nextInt();

				switch(islem) {
					case 1:
						bilgiGetir();
						break;
					case 2:
						notDüzenle();
						break;
					case 3:
						devamsizlikDüzenle();
						break;
					case 4:
						System.out.println("Sistemden çýkýlýyor...");
						break;
				}
			}
			else {
				System.out.println("Kullanýcý adý veya þifre yanlýþ!");
				break;
			}
		}
		System.out.println("Çýkýþ yapýlmýþtýr...");
	}
	
	public static String getNumara() {
		return numara;
	}

	public void bilgiGetir() {
		System.out.println("Öðrenci numarasý giriniz: ");
		System.out.println(yonetici.getOgrenci()[0].getSch_number());
		numara = input.nextLine();
		for(int i = 0; i < yonetici.getOgrenci().length ; i++){
			if(yonetici.getOgrenci()[i].getSch_number() == numara) {
				System.out.println();
				System.out.println("|-------------------------------------------------------|" + "--------------------------------------|" + "|-----------------------------------------------|");
				System.out.println("| Öðrenci Bilgileri:                                    |" + "		Okul Notlarý		" + "		Devamsýzlýk Bilgisi			");
				System.out.println();
				System.out.println("| Ýsim: "+"\t\t" + yonetici.getOgrenci()[i].getName() + "				|" + " Türkçe: " + yonetici.getOgrenci()[i].getTurkceNot() + "		       |" + " Devamsýz olduðu gün sayýsý: " + yonetici.getOgrenci()[i].getDevamsizlikSayisi());
				System.out.println();
				System.out.println("| Soyisim: " + "\t\t" + yonetici.getOgrenci()[i].getSurname()+ "			        |" + " Matematik: " + yonetici.getOgrenci()[i].getMatematikNot()+"		       |");
				System.out.println();
				System.out.println("| Okul Numarasý: " + "\t" + yonetici.getOgrenci()[i].getSch_number()+"				|" + " Biyoloji: " + yonetici.getOgrenci()[i].getBiyolojiNot()+"		       |");
				System.out.println();
				System.out.println("| Kayit Tarihi: " + "\t" + yonetici.getOgrenci()[i].getKayitTarihi()+"			|");
				System.out.println();
				if(yonetici.getOgrenci()[i].getDisiplin() == 0) {
					System.out.println("| Öðrenci öðrenimi boyunca disiplin cezasý almamýþtýr.  |");
					System.out.println("|-------------------------------------------------------|" + "--------------------------------------|" + "|---------------------------------------|");
					System.out.println();
				}
				else {
					System.out.println("Öðrenci disiplin cezasý almýþtýr.");
				}
				break;
			}
		}
		
		
	}
	public void notDüzenle() {
		System.out.println("Öðrenci numarasý giriniz: ");
		numara = input.nextLine();
		for(int a = 0; a < yonetici.getOgrenci().length ; a++){
			if(yonetici.getOgrenci()[a].getSch_number() == numara) {
				yonetici.setDers();
				bilgiGetir();
				break;
			}
		}
	}
	public void devamsizlikDüzenle() {
		System.out.println("Öðrenci numarasý giriniz: ");
		numara = input.nextLine();
		for(int a = 0; a < yonetici.getOgrenci().length ; a++){
			if(yonetici.getOgrenci()[a].getSch_number() == numara) {
				yonetici.setDevamsizlik();
				bilgiGetir();
				break;
			}
		}
	}
	public static void main(String[] args) {
		Yonetici yonetici1 = new Yonetici("Ahmet", "6542");
		OgrenciKayit ogrenci1 = new OgrenciKayit("Ali", "Veli", "1234", "12.10.2021", 0);
		OgrenciKayit ogrenci2 = new OgrenciKayit("Ayþe", "Su", "5678", "12.10.2021", 0);
		yonetici1.setOgrenci1(ogrenci1);
		yonetici1.setOgrenci(ogrenci1);
		yonetici1.setOgrenci1(ogrenci2);
		yonetici1.setOgrenci(ogrenci2);
		Otomasyon otomasyon1 =  new Otomasyon(yonetici1);
		otomasyon1.otomasyon();
	}
}