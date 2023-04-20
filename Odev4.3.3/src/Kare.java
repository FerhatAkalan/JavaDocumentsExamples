
public class Kare extends Sekil {
	private Nokta nokta;
	private Kenar kenar;
	public Kare(Nokta nokta, Kenar kenar) {
		this.nokta = nokta;
		this.kenar = kenar;
	}
	
	public double alanHesapla() {
		System.out.print("Karenin alaný: ");
		return kenar.getUzunluk()*kenar.getUzunluk();
	}
	public Kenar getKenar() {
		return kenar;
	}
}