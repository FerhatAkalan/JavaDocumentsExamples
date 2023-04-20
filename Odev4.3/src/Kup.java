
public class Kup {
	private Kare kare;
	
	public Kup(Kare kare) {
		this.kare = kare;
	}
	
	public double alanHesapla() {
		return 6*(kare.getKenar())*(kare.getKenar());
	}
	public double hacimHesapla() {
		return (kare.getKenar())*(kare.getKenar())*(kare.getKenar());
	}
	public Kare getKare1() {
		return kare;
	}
	public void setKare1(Kare kare1) {
		this.kare = kare;
	}
}
