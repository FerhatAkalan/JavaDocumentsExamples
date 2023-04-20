
public class Cember {
	
	private double yaricap;
	
	public  Cember(double yaricap) {
		this.yaricap = yaricap;
	}
	public double cevreHesapla() {
		return (2*Math.PI*this.yaricap);
	}
	public double getYaricap() {
		return yaricap;
	}
	public void setYaricap(int yaricap) {
		this.yaricap = yaricap;
	}
}