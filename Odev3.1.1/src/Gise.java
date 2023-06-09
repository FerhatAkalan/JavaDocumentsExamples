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
		System.out.println(this.otomobil.getPlaka() + " plakal� arac�n�z�n OGS cihaz� bulunmad��� i�in ge�i� yap�lamad�.");
		System.out.println();
	}
	public Gise(Minibus minibus) {
		this.minibus = minibus;
		System.out.println(this.minibus.getPlaka() + " plakal� arac�n�z�n OGS cihaz� bulunmad��� i�in ge�i� yap�lamad�.");
		System.out.println();
	}
	public Gise(Otobus otobus) {
		this.otobus = otobus;
		System.out.println(this.otobus.getPlaka() + " plakal� arac�n�z�n OGS cihaz� bulunmad��� i�in ge�i� yap�lamad�.");
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
	//Gecis fonksiyonu ara� ge�i� yapt��� zaman �deme ve kay�t fonksiyonunu �al��t�r�r. Ara�tan �deme al�r ve kayd�n� yapar.
	public void Gecis() {
			
			if(this.ogs.getOtomobil() != null) {
				if(this.ogs.getOtomobil().getOgs() != null) {
					this.ogs.setTarih(this.TarihBelirle());
					System.out.println(this.ogs.getTarih() + " tarihinde " + this.ogs.getOtomobil().getPlaka() + " plakal� " + this.ogs.getSinif() +" ge�mi�tir.");
					this.Odeme();
					this.kayit();			
					}
				else {
					System.out.println(this.ogs.getOtomobil().getPlaka() + " plakal� arac�n�z�n OGS cihaz� bulunmad��� i�in ge�i� yap�lamad�.");
				}
			}
			else if(this.ogs.getMinibus() != null) {
				if(this.ogs.getMinibus().getOgs() != null) {
					this.ogs.setTarih(this.TarihBelirle());
					System.out.println(this.ogs.getTarih() + " tarihinde " + this.ogs.getMinibus().getPlaka() + " plakal� "  + this.ogs.getSinif() + " ge�mi�tir.");
					this.Odeme();
					this.kayit();	
				}
				else {
					System.out.println(this.ogs.getMinibus().getPlaka() + " plakal� arac�n�z�n OGS cihaz� bulunmad��� i�in ge�i� yap�lamad�.");
				}
			}
			else {
				if(this.ogs.getOtobus().getOgs() != null) {
					this.ogs.setTarih(this.TarihBelirle());
					System.out.println(this.ogs.getTarih() + " tarihinde " + this.ogs.getOtobus().getPlaka() + " plakal� "  + this.ogs.getSinif() + " ge�mi�tir.");
					this.Odeme();
					this.kayit();	
				}
				else {
					System.out.println(this.ogs.getOtobus().getPlaka() + " plakal� arac�n�z�n OGS cihaz� bulunmad��� i�in ge�i� yap�lamad�.");
				}
			}
			System.out.println();
		}
	//Odeme fonksiyonu ara�tan �deme al�r.
	public void Odeme() {
		if(this.ogs.getOtomobil() != null) {
			if(this.ogs.getBakiye() >= 10) {
				System.out.println("Ge�i� �creti: 10 TL");
				double miktar = 10;
				this.ogs.bakiyeAzalt(miktar);
				kazanc += 10;
				System.out.println("Kalan bakiye: " + this.ogs.getBakiye());
			}
			else {
				System.out.println("OGS bakiyeniz yetersizdir. En k�sa zamanda hesab�n�za para y�kleyiniz!");
				System.out.println("Hesaba y�kleme yap�lmamas� durumunda ceza al�caks�n�z.");	
				double miktar = 10;
				this.ogs.bakiyeAzalt(miktar);
				kazanc += 10;
				System.out.println("Kalan bakiye: " + this.ogs.getBakiye());
			}
		}	
		else if(this.ogs.getMinibus() != null) {
			if(this.ogs.getBakiye() >= 15) {
				System.out.println("Ge�i� �creti: 15 TL");
				double miktar = 15;
				this.ogs.bakiyeAzalt(miktar);
				kazanc += 15;
				System.out.println("Kalan bakiye: " + this.ogs.getBakiye());
			}
			else {
				System.out.println("OGS bakiyeniz yetersizdir. En k�sa zamanda hesab�n�za para y�kleyiniz!");
				System.out.println("Hesaba y�kleme yap�lmamas� durumunda ceza al�caks�n�z.");	
				double miktar = 15;
				this.ogs.bakiyeAzalt(miktar);
				kazanc += 15;
				System.out.println("Kalan bakiye: " + this.ogs.getBakiye());
			}
		}
		else {
			if(this.ogs.getBakiye() >= 20) {
				System.out.println("Ge�i� �creti: 20 TL");
				double miktar = 20;
				this.ogs.bakiyeAzalt(miktar);
				kazanc += 20;
				System.out.println("Kalan bakiye: " + this.ogs.getBakiye());
			}
			else {
				System.out.println("OGS bakiyeniz yetersizdir. En k�sa zamanda hesab�n�za para y�kleyiniz!");
				System.out.println("Hesaba y�kleme yap�lmamas� durumunda ceza al�caks�n�z.");	
				double miktar = 20;
				this.ogs.bakiyeAzalt(miktar);
				kazanc += 20;
				System.out.println("Kalan bakiye: " + this.ogs.getBakiye());
			}
		}
	}
	//kayit fonksiyonu ara� ge�ti�i zaman arac�n bilgilerini kaydeder.
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