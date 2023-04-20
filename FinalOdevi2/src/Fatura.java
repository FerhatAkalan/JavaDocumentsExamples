
public class Fatura {
	private String ogeNumarasi;
	private String ogeAciklamasi;
	private int ogeMiktari;
	private double ogeBasinaFiyat;
	
	public Fatura(String ogeNumarasi, String ogeAciklamasi, int ogeMiktari, double ogeBasinaFiyat) {
		this.ogeNumarasi = ogeNumarasi;
		this.ogeAciklamasi = ogeAciklamasi;
		this.ogeMiktari = ogeMiktari;
		this.ogeBasinaFiyat = ogeBasinaFiyat;
	}
	
	public String getOgeNumarasi() {
		return ogeNumarasi;
	}

	public void setOgeNumarasi(String ogeNumarasi) {
		this.ogeNumarasi = ogeNumarasi;
	}

	public String getOgeAciklamasi() {
		return ogeAciklamasi;
	}

	public void setOgeAciklamasi(String ogeAciklamasi) {
		this.ogeAciklamasi = ogeAciklamasi;
	}

	public int getOgeMiktari() {
		return ogeMiktari;
	}

	public void setOgeMiktari(int ogeMiktari) {
		this.ogeMiktari = ogeMiktari;
	}

	public double getOgeBasinaFiyat() {
		return ogeBasinaFiyat;
	}

	public void setOgeBasinaFiyat(double ogeBasinaFiyat) {
		this.ogeBasinaFiyat = ogeBasinaFiyat;
	}
	public double faturaTutari() {
		double faturaTutari;
		if(this.ogeMiktari < 0 || this.ogeBasinaFiyat < 0) {
			this.ogeMiktari = 0;
			this.ogeBasinaFiyat = 0.0;
			faturaTutari = this.ogeBasinaFiyat*this.ogeMiktari;
		}
		else {
			faturaTutari = this.ogeBasinaFiyat*this.ogeMiktari;
		}
		return faturaTutari;
	}
}