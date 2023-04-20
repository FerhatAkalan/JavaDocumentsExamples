
public class Daire extends Cember {

	public Daire(double yaricap) {
		super(yaricap);
	}
	public double alanHesapla() {
		
		return (2*Math.PI*this.getYaricap()*this.getYaricap());
	}
	
}