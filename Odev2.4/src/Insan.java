
public class Insan {
	private String isim;
	private String TCKimlik;
	private Kedi kedi;
	private Akvaryum akvaryum;
	private String evcilHayvan�smi;
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
			evcilHayvan�smi = "kedimin ad� " + kedi.getIsim() + ".";
		}
		else if(this.akvaryum != null){
			evcilHayvan�smi = "akvaryumda "+ akvaryum.getBalikSayisi() + " bal�k besliyorum.";
		}
		else {
			evcilHayvan�smi = "evcil hayvan�m yok." ;
		}
		return evcilHayvan�smi;
	}
	public void setEvcilHayvan(Kedi kedi) {
		this.kedi = kedi;
	}
	public void setEvcilHayvan(Akvaryum akvaryum) {
		this.akvaryum = akvaryum;
	}
	//kendiniTanit metodu
	public String kendiniTan�t() {
		return "Merhaba ad�m " + isim + " " + this.getEvcilHayvan();
	}
}
