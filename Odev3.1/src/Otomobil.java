
public class Otomobil {
	private String plaka;
	private String sinif;
	private OGS ogs;
	public Otomobil(String plaka) {
		this.setPlaka(plaka);
		this.setSinif("otomobil");
	}
	public String getPlaka() {
		return plaka;
	}
	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}
	public String getSinif() {
		return sinif;
	}
	public void setSinif(String sinif) {
		this.sinif = sinif;
	}
	public OGS getOgs() {
		return ogs;
	}
	public void setOgs(OGS ogs) {
		this.ogs = ogs;
		OGS.setGecenAracSayisi(OGS.getGecenAracSayisi() + 1);

	}
	
}
