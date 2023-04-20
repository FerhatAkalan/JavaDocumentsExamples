
public class Insan {
	private String isim;
	private String TCKimlik;
	private Kedi kedi;
	private Akvaryum akvaryum;
	private String evcilHayvanİsmi;
	public Insan(String isim, String TCKimlik) {
		this.isim = isim;
		this.TCKimlik = TCKimlik;
	}
	public String getIsim() {
		return isim;
	}
	public String getTCKimlik() {
		return TCKimlik;
	}
	//Eksik metod 1
	public void setIsim(String isim) {
		this.isim = isim;
	}
	//Eksik metod 2
	public void setTCKimlik(String TCKimlik) {
		this.TCKimlik = TCKimlik;
	}
	public String getEvcilHayvan() {
		if(this.kedi != null) {
			evcilHayvanİsmi = "kedimin adı " + kedi.getIsim() + ".";
		}
		else if(this.akvaryum != null){
			evcilHayvanİsmi = "akvaryumda "+ akvaryum.getBalikSayisi() + " balık besliyorum.";
		}
		else {
			evcilHayvanİsmi = "evcil hayvanım yok." ;
		}
		return evcilHayvanİsmi;
	}
	public void setEvcilHayvan(Kedi kedi) {
		this.kedi = kedi;
	}
	public void setEvcilHayvan(Akvaryum akvaryum) {
		this.akvaryum = akvaryum;
	}
	//kendiniTanit metodu
	public String kendiniTanıt() {
		return "Merhaba adım " + isim + " " + this.getEvcilHayvan();
	}
}
