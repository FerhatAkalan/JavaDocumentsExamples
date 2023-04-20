
public class Ogrenci extends Kisi {
	private int ogrenciNo;
	public Ogrenci() {
		super();
		ogrenciNo = 0; // Henüz öðrenci numarasý yok
	}
	public Ogrenci(String ilkIsim, int ilkOgrenciNo) {
		super(ilkIsim);
		ogrenciNo = ilkOgrenciNo;
	}
	public int getOgrenciNo() {
		return ogrenciNo;
	}
	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}
	public void reset(String yeniIsim, int yeniOgrenciNo) {
		setIsim(yeniIsim);
		ogrenciNo = yeniOgrenciNo;
	}
	public void ciktiYazdir() {
		System.out.println("Ýsim: " + getIsim());
		System.out.println("Öðrenci numarasý: " + ogrenciNo);
	}
	public boolean equals(Ogrenci digerOgrenci) {
		return this.ayniIsimMi(digerOgrenci) && (this.ogrenciNo == digerOgrenci.ogrenciNo);
	}

}
