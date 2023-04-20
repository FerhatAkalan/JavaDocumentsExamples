
public class Sarjor {
	
	private int mermiKapasitesi;
	private int mevcutMermi;
	
	public Sarjor(int mermiKapasitesi, int mevcutMermi) {
		if((mevcutMermi >= 0) && (mevcutMermi <= mermiKapasitesi)) {
			this.mermiKapasitesi = mermiKapasitesi;
			this.mevcutMermi = mevcutMermi;
		}
		else {
			System.out.println("Mevcut mermi, negatif olamaz, mermi kapasitesini aþamaz!");
		}
	}
	public void mermiAtesle() {
		
		if((this.mevcutMermi > 0) && (this.mevcutMermi <= this.mermiKapasitesi)) {
			this.mevcutMermi -= 1;
		}
	}
	public void sarjorDoldur() {
		if((this.mevcutMermi >= 0) && (this.mevcutMermi < this.mermiKapasitesi)) {
			this.mevcutMermi += this.mermiKapasitesi - this.mevcutMermi;
			System.out.println("Þarjör dolduruluyor..");
			System.out.println("Yeni mermi sayisi : " + this.mevcutMermi);
		}
	}
	public int getMermiKapasitesi() {
		return mermiKapasitesi;
	}
	public void setMermiKapasitesi(int mermiKapasitesi) {
		this.mermiKapasitesi = mermiKapasitesi;
	}
	public int getMevcutMermi() {
		return mevcutMermi;
	}
	public void setMevcutMermi(int mevcutMermi) {
		this.mevcutMermi = mevcutMermi;
	}
}