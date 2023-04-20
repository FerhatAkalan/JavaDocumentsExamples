
public class Silah  {
	
	private int menzil;
	private Sarjor sarjor;
	
	public Silah(int menzil) {
		this.menzil = menzil;
	}
	public void atesEt(int hedefMenzil) {
		if(hedefMenzil <= this.menzil) {
			if((this.sarjor.getMevcutMermi() > 0) && (this.sarjor.getMevcutMermi() <= this.sarjor.getMermiKapasitesi())) {
				this.sarjor.mermiAtesle();
				System.out.println("Silahtan mermi ateþlendi.");
				System.out.println("Kalan mermi: " + this.sarjor.getMevcutMermi());
			}
		}
		else {
			System.out.println("Hedef çok uzakta!");
		}	
	}
	public void yenidenDoldur() {
		this.sarjor.sarjorDoldur();
	}
	public void setSarjor(Sarjor sarjor) {
		this.sarjor = sarjor;
	}
	public Sarjor getSarjor() {
		return sarjor;
	}
	public int getMenzil() {
		return menzil;
	}
	public void setMenzil(int menzil) {
		this.menzil = menzil;
	}
}