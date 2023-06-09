
public class Hesap {
	private String[] hesaplar = new String[10];
	private String isim;
	private String soy�sim;
	private int hesapNo;
	private double bakiye;
	private String hesapTipi;
	
	public Hesap(String isim, String soy�sim, int hesapNo, String hesapTipi) {
		this.isim = isim;
		this.soy�sim = soy�sim;
		this.hesapNo = hesapNo;
		this.bakiye = 0;
		this.hesapTipi = hesapTipi;
		for(int i = 0; i < 10; i++) {
			if(hesaplar[i] == null) {
				hesaplar[i] = this.isim + "\t" + this.soy�sim + "\t" + this.hesapNo + "\t" + this.hesapTipi;
				break;
			}
		}
	}
	
	public void hesapBilgi(){
		if(this.hesaplar[9] == null) {
			System.out.println("Hesap sahibinin ismi    : " + this.isim);
			System.out.println("Hesap sahibinin soyismi : " + this.soy�sim);
			System.out.println("Hesap numaras�          : " + this.hesapNo);
			System.out.println("Hesap bakiyesi          : " + this.bakiye);
			System.out.println("Hesap tipi              : " + this.hesapTipi);
			for(int i = 0; i<10;i++) {
				System.out.println(hesaplar[i]);
			}
		}
		else {
			System.out.println("10 M��teri doldu.");
		}
	}
	
	public void paraYatir(double miktar) {
		if(miktar > 0) {
			this.bakiye += miktar;
			System.out.printf("Hesab�n�za %.2f TL para yat�r�l�yor...\n", miktar);
			System.out.println("Hesap bakiyesi: " + this.bakiye);
		}
	}
	public void paraCek(double miktar) {
		if(this.bakiye > 0) {
			this.bakiye -= miktar;
			System.out.printf("Hesab�n�zdan %.2f TL para �ekiliyor...\n", miktar);
			System.out.println("Hesap bakiyesi: " + this.bakiye);
		}
		else {
			System.out.println("Yetersiz bakiye!");
		}
	}
	

}