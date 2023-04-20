import java.util.NoSuchElementException;

public class CiftYonluBagliListe {
	private ListeDugumu ilk;
	private ListeDugumu son;
	private int uzunluk;
	
	private class ListeDugumu{
		private int veri;
		private ListeDugumu sonraki;
		private ListeDugumu onceki;
		
		public ListeDugumu(int veri) {
			this.veri = veri;
		}
	}
	public CiftYonluBagliListe() {
		this.ilk = null;
		this.son = null;
		this.uzunluk = 0;
	}
	public boolean bosMu() {
		return uzunluk == 0;
	}
	public int listeUzunlugu() {
		return uzunluk;
	}
	public void basaEkle(int deger) {
		ListeDugumu yeniDugum = new ListeDugumu(deger);
		if(bosMu()) {
			son = yeniDugum;
		}
		else {
			ilk.onceki = yeniDugum;
		}
		yeniDugum.sonraki = ilk;
		ilk = yeniDugum;
		uzunluk++;
	}
	public void sonaEkle(int deger) {
		ListeDugumu yeniDugum = new ListeDugumu(deger);
		if(bosMu()) {
			ilk = yeniDugum;
		}
		else {
			son.sonraki = yeniDugum;
		}
		yeniDugum.onceki = son;
		son = yeniDugum;
		uzunluk++;
	}
	public void ileriYondeYazdir() {
		if(ilk == null) {
			return;
		}
		ListeDugumu gecici = ilk;
		while(gecici != null) {
			System.out.print(gecici.veri + " --> ");
			gecici = gecici.sonraki;
		}
		System.out.println("null");
	}
	public void geriYondeYazdýr() {
		if(son == null) {
			return;
		}
		ListeDugumu gecici = son;
		while(gecici != null) {
			System.out.print(gecici.veri + " --> ");
			gecici = gecici.onceki;
		}
		System.out.println("null");
	}
	public ListeDugumu ilkDugumuSil() {
		if(bosMu()) {
			throw new NoSuchElementException();
		}
		ListeDugumu gecici = ilk;
		if(ilk == son) {
			son = null;
		}
		else {
			ilk.sonraki.onceki = null;
		}
		ilk = ilk.sonraki;
		gecici.sonraki = null;
		uzunluk--;
		return gecici;
	}
	public ListeDugumu sonDugumuSil() {
		if(bosMu()) {
			throw new NoSuchElementException();
		}
		ListeDugumu gecici = son;
		if(ilk == son) {
			son = null;
		}
		else {
			son.onceki.sonraki = null;
		}
		son = son.onceki;
		gecici.onceki = null;
		uzunluk--;
		return gecici;
	}
	public static void main(String[] args) {
		CiftYonluBagliListe cybl = new CiftYonluBagliListe();
		cybl.sonaEkle(1);
		cybl.sonaEkle(10);
		cybl.sonaEkle(15);
		cybl.sonaEkle(25);
		cybl.ileriYondeYazdir();
		cybl.geriYondeYazdýr();
		cybl.basaEkle(0);
		cybl.ileriYondeYazdir();
		cybl.ilkDugumuSil();
		cybl.ileriYondeYazdir();
		cybl.sonDugumuSil();
		cybl.ileriYondeYazdir();
		
	}
}
