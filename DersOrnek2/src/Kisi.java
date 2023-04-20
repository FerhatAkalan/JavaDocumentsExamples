
public class Kisi {
	private String isim, soyisim;
	
	public Kisi() {
		//isim = "Henüz isim yok";
		this("Henüz isim yok");
	}
	public Kisi(String yeniIsim) {
		isim = yeniIsim;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}

	public void ciktiYazdir() {
		System.out.println("Ýsim: " + isim);
		System.out.println("Soyisim: " + soyisim);
	}
	public boolean ayniIsimMi(Kisi digerKisi) {
		return this.isim.equalsIgnoreCase(digerKisi.isim);
	}
	public static void main(String[] args) {
		Kisi kisi1 = new Kisi();
		kisi1.ciktiYazdir();
		Ogrenci ogrenci1 = new Ogrenci();
		ogrenci1.setIsim("Ali");
		ogrenci1.setOgrenciNo(1234);
		ogrenci1.ciktiYazdir();
	}
	
	
}