import java.util.Scanner;

public class UAV{

	private double bosAgirlik;
	private double maxAgirlik;
	private double agirlik;
	private Fuze[] fuze = new Fuze[2];
	private Scanner input = new Scanner(System.in);
	private boolean havalan;
	private int fuzeSayisi1 = 0;
	
	
	public UAV(double bosAgirlik, double maxAgirlik) {
		this.bosAgirlik = bosAgirlik;
		this.maxAgirlik = maxAgirlik;
		this.agirlik = bosAgirlik;
	}

	public void fuzeAtesle() {
		int fuzeSayisi = 0;
		if(havalan == true) {
			for(int sayac = 0; sayac < fuze.length ; sayac++) {
				if(this.fuze[sayac] != null) {
					fuzeSayisi +=1;
				}
			}
			System.out.println("Cephanelikte bulunan f�ze say�s�: " + fuzeSayisi);
			System.out.println("Ka� tane f�ze ate�lemek istiyorsunuz: ");
			int sayi = input.nextInt();
			while(sayi > fuzeSayisi) {
				System.out.println("Girdi�iniz say� �ok y�ksek.");
				System.out.println("Cephanelikte bulunan f�ze say�s�: " + fuzeSayisi);
				System.out.println("Ka� tane f�ze ate�lemek istiyorsunuz: ");
				sayi = input.nextInt();
			}
			for(int sayac = 0; sayac < sayi ; sayac++) {
				
				if(this.fuze[sayac] != null) {
					System.out.println("F�ze " + (sayac+1) + " ate�lenmi�tir.");
					this.fuze[sayac] = null;
				}
				else {
					System.out.println("Fuze yok!");
				}
			}
			int kalanFuzeSayisi = 0;
			for(int a = 0; a < fuze.length ; a++) {
				if(this.fuze[a] != null) {
					kalanFuzeSayisi++;
				}
			}
			System.out.println("Kalan f�ze sayisi: " + kalanFuzeSayisi);
		}
		else {
			System.out.println("UAV havalanmadan f�ze ate�leyemez!");
		}
	}
	public void setFuze(Fuze fuze) {
		this.fuzeSayisi1++;
		if(this.fuzeSayisi1 > this.fuze.length) {
			System.out.println("UAV en fazla 2 f�ze alabilir.");
		}
		else {
			for(int sayac = 0 ; sayac < this.fuze.length; sayac++) {
				if(this.fuze[sayac] == null) {
					this.agirlik += fuze.getAgirlik();
					if(this.agirlik <= this.maxAgirlik ) {
						this.fuze[sayac] = fuze;
						if(this.fuze[sayac].getSinif().equals("Hava")) {
							System.out.println("F�ze " + (sayac+1) + " y�klendi.");
						}
						else {
							System.out.println("F�ze s�n�f�n�n hava olmas� gerekir!");
							this.fuze[sayac] = null;
							fuzeSayisi1--;
							this.agirlik -= fuze.getAgirlik();
						}
					}
					else {
						System.out.println("F�ze " + (sayac+1) + " y�klenemedi.");
						System.out.println("Maksimum a��rl�k a��ld�!");
						System.out.println("UAV maksimum kalk�� a��rl���: " + this.getMaxAgirlik());
						System.out.println("UAV a��rl���: " + this.getAgirlik());
						System.exit(0);
					}
					break;
				}
			}
		}
	}
	public void havalan() {
		String izin;
		System.out.println("UAV havalans�n m�? (Evet/Hay�r)");
		izin = input.nextLine();
		if(izin.equalsIgnoreCase("Evet")) {
			this.havalan = true;
		}
		else {
			this.havalan = false;
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

	public double getAgirlik() {
		return agirlik;
	}

	public void setAgirlik(double agirlik) {
		this.agirlik = agirlik;
	}
}