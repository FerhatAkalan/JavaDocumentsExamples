
public class Kup extends Sekil{
	private Nokta nokta;
	private Kare kare;
	public Kup(Nokta nokta, Kare kare) {
		this.nokta = nokta;
		this.kare = kare;
	}
	public double alanHesapla() {
		System.out.print("Küpün alaný: ");
		return 6*kare.getKenar().getUzunluk()*kare.getKenar().getUzunluk();
	}
}