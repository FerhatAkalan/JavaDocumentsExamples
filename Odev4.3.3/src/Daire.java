
public class Daire extends Sekil{
	private Nokta nokta;
	private int yaricap;
	public Daire(Nokta nokta, int yaricap) {
		this.nokta = nokta;
		this.yaricap = yaricap;
	}
	
	public double alanHesapla() {
		System.out.print("Dairenin alaný: ");
		return Math.PI*yaricap*yaricap;
	}
}
