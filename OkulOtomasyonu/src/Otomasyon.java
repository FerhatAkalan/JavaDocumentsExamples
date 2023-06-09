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
		System.out.println("Okul Bilgi Sistemine Ho�geldiniz");
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("*********************************");
		System.out.println("Giri� yap�n�z...");
		System.out.println("*********************************");
		System.out.println();
		System.out.print("Kullan�c� ad�: ");
		String kullan�c� = input.nextLine();
		System.out.print("�ifre: ");
		String sifre = input.nextLine();
		System.out.println();
		while(islem != 4) {
			
			if(yonetici.getSys_kul().equals(kullan�c�) && yonetici.getSys_sif().equals(sifre)) {
				System.out.println("Ho�geldin " + yonetici.getSys_kul() + " bir i�lem se�iniz...");
				System.out.println();
				System.out.println("1 : ��renci Bilgisi Getir | 2 : ��renci Not Bilgisi D�zenleme | 3 : Devams�zl�k Bilgisi D�zenleme | 4 : Sistemden ��k�� ");
				islem = input.nextInt();

				switch(islem) {
					case 1:
						bilgiGetir();
						break;
					case 2:
						notD�zenle();
						break;
					case 3:
						devamsizlikD�zenle();
						break;
					case 4:
						System.out.println("Sistemden ��k�l�yor...");
						break;
				}
			}
			else {
				System.out.println("Kullan�c� ad� veya �ifre yanl��!");
				break;
			}
		}
		System.out.println("��k�� yap�lm��t�r...");
	}
	
	public static String getNumara() {
		return numara;
	}

	public void bilgiGetir() {
		System.out.println("��renci numaras� giriniz: ");
		System.out.println(yonetici.getOgrenci()[0].getSch_number());
		numara = input.nextLine();
		for(int i = 0; i < yonetici.getOgrenci().length ; i++){
			if(yonetici.getOgrenci()[i].getSch_number() == numara) {
				System.out.println();
				System.out.println("|-------------------------------------------------------|" + "--------------------------------------|" + "|-----------------------------------------------|");
				System.out.println("| ��renci Bilgileri:                                    |" + "		Okul Notlar�		" + "		Devams�zl�k Bilgisi			");
				System.out.println();
				System.out.println("| �sim: "+"\t\t" + yonetici.getOgrenci()[i].getName() + "				|" + " T�rk�e: " + yonetici.getOgrenci()[i].getTurkceNot() + "		       |" + " Devams�z oldu�u g�n say�s�: " + yonetici.getOgrenci()[i].getDevamsizlikSayisi());
				System.out.println();
				System.out.println("| Soyisim: " + "\t\t" + yonetici.getOgrenci()[i].getSurname()+ "			        |" + " Matematik: " + yonetici.getOgrenci()[i].getMatematikNot()+"		       |");
				System.out.println();
				System.out.println("| Okul Numaras�: " + "\t" + yonetici.getOgrenci()[i].getSch_number()+"				|" + " Biyoloji: " + yonetici.getOgrenci()[i].getBiyolojiNot()+"		       |");
				System.out.println();
				System.out.println("| Kayit Tarihi: " + "\t" + yonetici.getOgrenci()[i].getKayitTarihi()+"			|");
				System.out.println();
				if(yonetici.getOgrenci()[i].getDisiplin() == 0) {
					System.out.println("| ��renci ��renimi boyunca disiplin cezas� almam��t�r.  |");
					System.out.println("|-------------------------------------------------------|" + "--------------------------------------|" + "|---------------------------------------|");
					System.out.println();
				}
				else {
					System.out.println("��renci disiplin cezas� alm��t�r.");
				}
				break;
			}
		}
		
		
	}
	public void notD�zenle() {
		System.out.println("��renci numaras� giriniz: ");
		numara = input.nextLine();
		for(int a = 0; a < yonetici.getOgrenci().length ; a++){
			if(yonetici.getOgrenci()[a].getSch_number() == numara) {
				yonetici.setDers();
				bilgiGetir();
				break;
			}
		}
	}
	public void devamsizlikD�zenle() {
		System.out.println("��renci numaras� giriniz: ");
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
		OgrenciKayit ogrenci2 = new OgrenciKayit("Ay�e", "Su", "5678", "12.10.2021", 0);
		yonetici1.setOgrenci1(ogrenci1);
		yonetici1.setOgrenci(ogrenci1);
		yonetici1.setOgrenci1(ogrenci2);
		yonetici1.setOgrenci(ogrenci2);
		Otomasyon otomasyon1 =  new Otomasyon(yonetici1);
		otomasyon1.otomasyon();
	}
}