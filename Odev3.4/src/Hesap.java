
public class Hesap {
	private String isim;
	private String sifre;
	private double bakiye;
	
	public Hesap(String isim, String sifre, double bakiye) {
		this.isim = isim;
		this.sifre = sifre;
		if (bakiye > 0)
			this.bakiye = bakiye;
		else
			this.bakiye = 0;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	public double getBakiye() {
		return bakiye;
	}
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	public void paraYatir(double miktar)
	{
		if(miktar > 0) {
			bakiye += miktar;
			System.out.printf("Hesabýnýza %.2f TL yatýrýlýyor...\n", miktar);
			System.out.println("Bakiyeniz: " + this.bakiye);
		}
		else {
			System.out.println("Yatýracaðýnýz miktar pozitif olmalý!");
		}
	}
	public void paraCek(double miktar) {
		if(miktar <= this.bakiye) {
			bakiye -= miktar;
			System.out.printf("Hesabýnýzdan %.2f TL çekiliyor...\n", miktar);
			System.out.println("Kalan Bakiyeniz: " + this.bakiye);
		}
		else {
			System.out.println("Yetersiz bakiye!");
		}
	}
}