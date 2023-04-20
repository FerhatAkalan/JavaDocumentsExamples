//OGS sýnýf
public class OGS {
	private String numara;
	private String isim;
	private String soyIsim;
	private String sinif;
	private String tarih;
	private double bakiye;
	private Otomobil otomobil;
	private Minibus minibus;
	private Otobus otobus;
	private static int gecenAracSayisi;
	
	public OGS(String isim, String soyIsim, double bakiye, Otomobil otomobil) {
		this.setIsim(isim);
		this.setSoyIsim(soyIsim);
		this.bakiye = bakiye;
		this.otomobil = otomobil;
		this.setSinif(otomobil.getSinif());
		this.numara = otomobil.getPlaka();
	}
	public OGS(String isim, String soyIsim, double bakiye, Minibus minibus) {
		this.setIsim(isim);
		this.setSoyIsim(soyIsim);
		this.bakiye = bakiye;
		this.minibus = minibus;
		this.setSinif(minibus.getSinif());
		this.numara = minibus.getPlaka();
	}
	public OGS(String isim, String soyIsim, double bakiye, Otobus otobus) {
		this.setIsim(isim);
		this.setSoyIsim(soyIsim);
		this.bakiye = bakiye;
		this.otobus = otobus;
		this.setSinif(otobus.getSinif());
		this.numara = otobus.getPlaka();
	}
	public String getNumara() {
		return numara;
	}
	public void setNumara(String numara) {
		this.numara = numara;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyIsim() {
		return soyIsim;
	}
	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}
	public String getSinif() {
		return sinif;
	}
	public void setSinif(String sinif) {
		this.sinif = sinif;
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
	public void bakiyeAzalt(double bakiye) {
		this.bakiye -= bakiye;
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
	public static int getGecenAracSayisi() {
		return gecenAracSayisi;
	}
	public static void setGecenAracSayisi(int gecenAracSayisi) {
		OGS.gecenAracSayisi += gecenAracSayisi;
	}
}