
public class OtomatikSilah {

	private int seriAtisSayisi;
	private Sarjor sarjor;
	
	public OtomatikSilah(int seriAtisSayisi) {
		this.seriAtisSayisi = seriAtisSayisi;
	}

	public void atesEt() {
		if((this.sarjor.getMevcutMermi() > 0) && (this.sarjor.getMevcutMermi() <= this.sarjor.getMermiKapasitesi())) {
			for(int sayac = 0; sayac < seriAtisSayisi; sayac++) {
				this.sarjor.mermiAtesle();
			}
			System.out.println("Otomatik Silahtan " + this.seriAtisSayisi  + " mermi ateþlendi.");
			System.out.println("Kalan mermi: " + this.sarjor.getMevcutMermi());
		}
	}
	public void yenidenDoldur() {
		this.sarjor.sarjorDoldur();
	}
	public int getSeriAtisSayisi() {
		return seriAtisSayisi;
	}
	public Sarjor getSarjor() {
		return sarjor;
	}
	public void setSarjor(Sarjor sarjor) {
		this.sarjor = sarjor;
	}	
}