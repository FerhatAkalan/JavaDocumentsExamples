import java.util.Scanner;
public class Akvaryum {
	private int balikSayisi;
	public Akvaryum(int balikSayisi) {
		this.balikSayisi = balikSayisi;
	}
	public void balikEkle() {
		Scanner input = new Scanner(System.in);
		System.out.println("Eklenecek bal�k say�s�n� giriniz: ");
		int miktar = input.nextInt();
		balikSayisi += miktar;
	}
	public void balikSil(int adet) {
		balikSayisi -= adet;
	}
	public int getBalikSayisi() {
		return balikSayisi;
	}
}
