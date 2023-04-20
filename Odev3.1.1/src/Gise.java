import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Gise {
	private OGS ogs;
	private Otomobil otomobil;
	private Minibus minibus;
	private Otobus otobus;
	private static String[] gecenAraclar = new String[OGS.getGecenAracSayisi()];
	private static double kazanc = 0;
	public Gise(OGS ogs) {
		this.ogs = ogs;
		this.Gecis();
	}
	public Gise(Otomobil otomobil) {
		this.otomobil = otomobil;
		System.out.println(this.otomobil.getPlaka() + " plakalý aracýnýzýn OGS cihazý bulunmadýðý için geçiþ yapýlamadý.");
		System.out.println();
	}
	public Gise(Minibus minibus) {
		this.minibus = minibus;
		System.out.println(this.minibus.getPlaka() + " plakalý aracýnýzýn OGS cihazý bulunmadýðý için geçiþ yapýlamadý.");
		System.out.println();
	}
	public Gise(Otobus otobus) {
		this.otobus = otobus;
		System.out.println(this.otobus.getPlaka() + " plakalý aracýnýzýn OGS cihazý bulunmadýðý için geçiþ yapýlamadý.");
		System.out.println();
	}
	public OGS getOgs() {
		return ogs;
	}
	public void setOgs(OGS ogs) {
		this.ogs = ogs;
	}
	public static double getKazanc() {
		return kazanc;
	}
	public void setKazanc(double kazanc) {
		Gise.kazanc = kazanc;
	}
	public static String[] getGecenAraclar() {
		return gecenAraclar;
	}
	public static void setGecenAraclar(String[] gecenAraclar) {
		Gise.gecenAraclar = gecenAraclar;
	}
	public String TarihBelirle() {
		LocalDateTime tarih = LocalDateTime.now();
		DateTimeFormatter tarih2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return tarih2.format(tarih);
	}
	//Gecis fonksiyonu araç geçiþ yaptýðý zaman ödeme ve kayýt fonksiyonunu çalýþtýrýr. Araçtan ödeme alýr ve kaydýný yapar.
	public void Gecis() {
			
			if(this.ogs.getOtomobil() != null) {
				if(this.ogs.getOtomobil().getOgs() != null) {
					this.ogs.setTarih(this.TarihBelirle());
					System.out.println(this.ogs.getTarih() + " tarihinde " + this.ogs.getOtomobil().getPlaka() + " plakalý " + this.ogs.getSinif() +" geçmiþtir.");
					this.Odeme();
					this.kayit();			
					}
				else {
					System.out.println(this.ogs.getOtomobil().getPlaka() + " plakalý aracýnýzýn OGS cihazý bulunmadýðý için geçiþ yapýlamadý.");
				}
			}
			else if(this.ogs.getMinibus() != null) {
				if(this.ogs.getMinibus().getOgs() != null) {
					this.ogs.setTarih(this.TarihBelirle());
					System.out.println(this.ogs.getTarih() + " tarihinde " + this.ogs.getMinibus().getPlaka() + " plakalý "  + this.ogs.getSinif() + " geçmiþtir.");
					this.Odeme();
					this.kayit();	
				}
				else {
					System.out.println(this.ogs.getMinibus().getPlaka() + " plakalý aracýnýzýn OGS cihazý bulunmadýðý için geçiþ yapýlamadý.");
				}
			}
			else {
				if(this.ogs.getOtobus().getOgs() != null) {
					this.ogs.setTarih(this.TarihBelirle());
					System.out.println(this.ogs.getTarih() + " tarihinde " + this.ogs.getOtobus().getPlaka() + " plakalý "  + this.ogs.getSinif() + " geçmiþtir.");
					this.Odeme();
					this.kayit();	
				}
				else {
					System.out.println(this.ogs.getOtobus().getPlaka() + " plakalý aracýnýzýn OGS cihazý bulunmadýðý için geçiþ yapýlamadý.");
				}
			}
			System.out.println();
		}
	//Odeme fonksiyonu araçtan ödeme alýr.
	public void Odeme() {
		if(this.ogs.getOtomobil() != null) {
			if(this.ogs.getBakiye() >= 10) {
				System.out.println("Geçiþ ücreti: 10 TL");
				double miktar = 10;
				this.ogs.bakiyeAzalt(miktar);
				kazanc += 10;
				System.out.println("Kalan bakiye: " + this.ogs.getBakiye());
			}
			else {
				System.out.println("OGS bakiyeniz yetersizdir. En kýsa zamanda hesabýnýza para yükleyiniz!");
				System.out.println("Hesaba yükleme yapýlmamasý durumunda ceza alýcaksýnýz.");	
				double miktar = 10;
				this.ogs.bakiyeAzalt(miktar);
				kazanc += 10;
				System.out.println("Kalan bakiye: " + this.ogs.getBakiye());
			}
		}	
		else if(this.ogs.getMinibus() != null) {
			if(this.ogs.getBakiye() >= 15) {
				System.out.println("Geçiþ ücreti: 15 TL");
				double miktar = 15;
				this.ogs.bakiyeAzalt(miktar);
				kazanc += 15;
				System.out.println("Kalan bakiye: " + this.ogs.getBakiye());
			}
			else {
				System.out.println("OGS bakiyeniz yetersizdir. En kýsa zamanda hesabýnýza para yükleyiniz!");
				System.out.println("Hesaba yükleme yapýlmamasý durumunda ceza alýcaksýnýz.");	
				double miktar = 15;
				this.ogs.bakiyeAzalt(miktar);
				kazanc += 15;
				System.out.println("Kalan bakiye: " + this.ogs.getBakiye());
			}
		}
		else {
			if(this.ogs.getBakiye() >= 20) {
				System.out.println("Geçiþ ücreti: 20 TL");
				double miktar = 20;
				this.ogs.bakiyeAzalt(miktar);
				kazanc += 20;
				System.out.println("Kalan bakiye: " + this.ogs.getBakiye());
			}
			else {
				System.out.println("OGS bakiyeniz yetersizdir. En kýsa zamanda hesabýnýza para yükleyiniz!");
				System.out.println("Hesaba yükleme yapýlmamasý durumunda ceza alýcaksýnýz.");	
				double miktar = 20;
				this.ogs.bakiyeAzalt(miktar);
				kazanc += 20;
				System.out.println("Kalan bakiye: " + this.ogs.getBakiye());
			}
		}
	}
	//kayit fonksiyonu araç geçtiði zaman aracýn bilgilerini kaydeder.
	public void kayit() {
		if(this.ogs.getOtomobil() != null) {
			if(this.ogs.getOtomobil().getOgs() != null) {
				for(int i = 0; i < OGS.getGecenAracSayisi(); i++ ) {
					if(gecenAraclar[i] == null) {
						gecenAraclar[i] = this.ogs.getOtomobil().getPlaka() + "\t " + this.ogs.getIsim() + "\t " + this.ogs.getSoyIsim() + "\t\t " + this.ogs.getSinif() + "\t " + this.ogs.getTarih();
						break;
					}
				}
			}
		}
		else if(this.ogs.getMinibus() != null) {
			if(this.ogs.getMinibus().getOgs() != null) {
				for(int i = 0; i < OGS.getGecenAracSayisi(); i++ ) {
					if(gecenAraclar[i] == null) {
						gecenAraclar[i] = this.ogs.getMinibus().getPlaka() + "\t " + this.ogs.getIsim() + "\t " + this.ogs.getSoyIsim() + "\t\t " + this.ogs.getSinif() + "\t " + this.ogs.getTarih();
						break;
					}
				}
			}
		}
		else {
			if(this.ogs.getOtobus().getOgs() != null) {
				for(int i = 0; i < OGS.getGecenAracSayisi(); i++ ) {
					if(gecenAraclar[i] == null) {
						gecenAraclar[i] = this.ogs.getOtobus().getPlaka() + "\t " + this.ogs.getIsim() + "\t " + this.ogs.getSoyIsim() + "\t\t " + this.ogs.getSinif() + "\t\t " + this.ogs.getTarih();
						break;
					}
				}
			}
		}
	}
}