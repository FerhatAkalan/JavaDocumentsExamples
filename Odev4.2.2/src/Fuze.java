
public class Fuze {
	private double menzil;
	private double agirlik;
	private String sinif;
	
	public Fuze(double menzil, double agirlik, String sinif) {
		this.menzil = menzil;
		this.agirlik = agirlik;
		this.sinif = sinif;
	}

	public double getMenzil() {
		return menzil;
	}

	public void setMenzil(double menzil) {
		this.menzil = menzil;
	}

	public double getAgirlik() {
		return agirlik;
	}

	public void setAgirlik(double agirlik) {
		this.agirlik = agirlik;
	}

	public String getSinif() {
		return sinif;
	}

	public void setSinif(String sinif) {
		this.sinif = sinif;
	}
}