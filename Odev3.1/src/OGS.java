import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OGS {
	private String isim;
	private String soyIsim;
	private String sinif;
	private Otomobil otomobil;
	private Minibus minibus;
	private Otobus otobus;
	private String tarih;
	private double bakiye;
	private static double kazanc = 0;
	private static int gecenAracSayisi;
	
	public OGS(String isim, String soyIsim, double bakiye, Otomobil otomobil) {
		this.setIsim(isim);
		this.setSoyIsim(soyIsim);
		this.bakiye = bakiye;
		this.otomobil = otomobil;
		this.setSinif(otomobil.getSinif());
	}
	public OGS(String isim, String soyIsim, double bakiye, Minibus minibus) {
		this.setIsim(isim);
		this.setSoyIsim(soyIsim);
		this.bakiye = bakiye;
		this.minibus = minibus;
		this.setSinif(minibus.getSinif());
	}
	public OGS(String isim, String soyIsim, double bakiye, Otobus otobus) {
		this.setIsim(isim);
		this.setSoyIsim(soyIsim);
		this.bakiye = bakiye;
		this.otobus = otobus;
		this.setSinif(otobus.getSinif());
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSinif() {
		return sinif;
	}
	public void setSinif(String sinif) {
		this.sinif = sinif;
	}
	public String getSoyIsim() {
		return soyIsim;
	}
	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}
	public String getTarih() {
		return tarih;
	}
	public void setTarih(String tarih) {
		this.tarih = tarih;
	}
	public double getBakiye() {
		return bakiye;
	}
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	public Otomobil getOtomobil() {
		return otomobil;
	}
	public void setOtomobil(Otomobil otomobil) {
		this.otomobil = otomobil;
	}
	public Minibus getMinibus() {
		return minibus;
	}
	public void setMinibus(Minibus minibus) {
		this.minibus = minibus;
	}
	public Otobus getOtobus() {
		return otobus;
	}
	public void setOtobus(Otobus otobus) {
		this.otobus = otobus;
	}
	public static double getKazanc() {
		return kazanc;
	}
	public static void setKazanc(double kazanc) {
		OGS.kazanc = kazanc;
	}
	public static int getGecenAracSayisi() {
		return gecenAracSayisi;
	}
	public static void setGecenAracSayisi(int gecenAracSayisi) {
		OGS.gecenAracSayisi = gecenAracSayisi;
	}
	public String TarihBelirle() {
		LocalDateTime tarih = LocalDateTime.now();
		DateTimeFormatter tarih2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return tarih2.format(tarih);
	}
	public void Odeme() {
		if(this.otomobil != null) {
			if(this.bakiye >= 10) {
				System.out.println("Ge�i� �creti: 10 TL");
				this.bakiye -= 10;
				kazanc += 10;
				System.out.println("Kalan bakiye: " + this.bakiye);
			}
			else {
				System.out.println("OGS bakiyeniz yetersizdir. En k�sa zamanda hesab�n�za para y�kleyiniz!");
				System.out.println("Hesaba y�kleme yap�lmamas� durumunda ceza al�caks�n�z.");	
				this.bakiye -= 10;
				kazanc += 10;
				System.out.println("Kalan bakiye: " + this.bakiye);
			}
		}	
		else if(this.minibus != null) {
			if(this.bakiye >= 15) {
				System.out.println("Ge�i� �creti: 15 TL");
				this.bakiye -= 15;
				kazanc += 15;
				System.out.println("Kalan bakiye: " + this.bakiye);
			}
			else {
				System.out.println("OGS bakiyeniz yetersizdir. En k�sa zamanda hesab�n�za para y�kleyiniz!");
				System.out.println("Hesaba y�kleme yap�lmamas� durumunda ceza al�caks�n�z.");	
				this.bakiye -= 15;
				kazanc += 15;
				System.out.println("Kalan bakiye: " + this.bakiye);
			}
		}
		else {
			if(this.bakiye >= 20) {
				System.out.println("Ge�i� �creti: 20 TL");
				this.bakiye -= 20;
				kazanc += 20;
				System.out.println("Kalan bakiye: " + this.bakiye);
			}
			else {
				System.out.println("OGS bakiyeniz yetersizdir. En k�sa zamanda hesab�n�za para y�kleyiniz!");
				System.out.println("Hesaba y�kleme yap�lmamas� durumunda ceza al�caks�n�z.");	
				this.bakiye -= 20;
				kazanc += 20;
				System.out.println("Kalan bakiye: " + this.bakiye);
			}
		}
	}
	public void Gecis() {
		
		if(this.otomobil != null) {
			if(this.otomobil.getOgs() != null) {
				this.tarih = this.TarihBelirle();
				System.out.println(this.tarih + " tarihinde " + this.otomobil.getPlaka() + " plakal� " + this.sinif +" ge�mi�tir.");
				this.Odeme();
				this.kayit();			
				}
			else {
				System.out.println(this.otomobil.getPlaka() + " plakal� arac�n�z�n OGS cihaz� bulunmad��� i�in ge�i� yap�lamad�.");
			}
		}
		else if(this.minibus != null) {
			if(this.minibus.getOgs() != null) {
				this.tarih = this.TarihBelirle();
				System.out.println(this.tarih + " tarihinde " + this.minibus.getPlaka() + " plakal� "  + this.sinif + " ge�mi�tir.");
				this.Odeme();
				this.kayit();	
			}
			else {
				System.out.println(this.otomobil.getPlaka() + " plakal� arac�n�z�n OGS cihaz� bulunmad��� i�in ge�i� yap�lamad�.");
			}
		}
		else {
			if(this.otobus.getOgs() != null) {
				this.tarih = this.TarihBelirle();
				System.out.println(this.tarih + " tarihinde " + this.otobus.getPlaka() + " plakal� "  + this.sinif + " ge�mi�tir.");
				this.Odeme();
				this.kayit();	
			}
			else {
				System.out.println(this.otobus.getPlaka() + " plakal� arac�n�z�n OGS cihaz� bulunmad��� i�in ge�i� yap�lamad�.");
			}
		}
		System.out.println();
	}
	public void kayit() {
		if(this.otomobil != null) {
			if(this.otomobil.getOgs() != null) {
				for(int i = 0; i <gecenAracSayisi; i++ ) {
					if(Yonetim.getGecenAraclar()[i] == null) {
						Yonetim.getGecenAraclar()[i] = this.otomobil.getPlaka() + "\t " + this.isim + "\t " + this.soyIsim + "\t\t " + this.sinif + "\t " + this.tarih;
						break;
					}
				}
			}
		}
		else if(this.minibus != null) {
			if(this.minibus.getOgs() != null) {
				for(int i = 0; i <gecenAracSayisi; i++ ) {
					if(Yonetim.getGecenAraclar()[i] == null) {
						Yonetim.getGecenAraclar()[i] = this.minibus.getPlaka() + "\t " + this.isim + "\t " + this.soyIsim + "\t\t " + this.sinif + "\t " + this.tarih;
						break;
					}
				}
			}
		}
		else {
			if(this.otobus.getOgs() != null) {
				for(int i = 0; i < gecenAracSayisi; i++ ) {
					if(Yonetim.getGecenAraclar()[i] == null) {
						Yonetim.getGecenAraclar()[i] = this.otobus.getPlaka() + "\t " + this.isim + "\t " + this.soyIsim + "\t\t " + this.sinif + "\t\t " + this.tarih;
						break;
					}
				}
			}
		}
	}
}
