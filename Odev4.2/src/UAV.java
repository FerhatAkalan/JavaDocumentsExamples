import java.util.Scanner;

public class UAV{
	
	private double bosAgirlik;
	private double maxAgirlik;
	private double agirlik;
	private Fuze fuze;
	
	public UAV(double bosAgirlik, double maxAgirlik) {
		this.bosAgirlik = bosAgirlik;
		this.maxAgirlik = maxAgirlik;
	}

	public void fuzeAtesle() {
		Scanner input = new Scanner(System.in);
		if(this.fuze != null && this.fuze.getSinif().equals("Hava")) {
			int hedefMenzili= input.nextInt();
			if(fuze.getMenzil() >= hedefMenzili) {
			System.out.println("Füze ateþlenmiþtir.");
			this.fuze = null;
			}
			else {
				System.out.println("Hedef çok uzakta!");
			}
		}
		else {
			System.out.println("Füze ateþlenemedi. Füze yok.");
		}
		
	}
	public double getBosAgirlik() {
		return bosAgirlik;
	}
	public void setBosAgirlik(double bosAgirlik) {
		this.bosAgirlik = bosAgirlik;
	}
	public double getMaxAgirlik() {
		return maxAgirlik;
	}
	public void setMaxAgirlik(double maxAgirlik) {
		this.maxAgirlik = maxAgirlik;
	}
	public Fuze getFuze() {
		return fuze;
	}
	public void setFuze(Fuze fuze) {
		agirlik = this.bosAgirlik + fuze.getAgirlik();
		if(this.agirlik <= this.maxAgirlik ) {
			this.fuze = fuze;
		}
		else {
			System.out.println("Maksimum aðýrlýk aþýldý!");
			System.exit(0);
		}
		if(this.fuze.getSinif().equals("Kara")) {
			System.out.println("Füze sýnýfýnýn hava olmasý gerekir!");
			this.fuze = null;
		}
		
	}
	

}
