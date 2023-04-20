
public class Minibus {

	private String plaka;
	private String sinif;
	private OGS ogs;
	public Minibus(String plaka) {
		this.setPlaka(plaka);
		this.setSinif("Minibüs");
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
		OGS.setGecenAracSayisi(1);
	}
}