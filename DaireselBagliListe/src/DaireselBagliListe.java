import java.util.NoSuchElementException;

public class DaireselBagliListe {
	private ListeDugumu son;
	private int uzunluk;
	
	private class ListeDugumu{
		private int veri;
		private ListeDugumu sonraki;
		
		public ListeDugumu(int veri) {
			this.veri = veri;
		}
	}
	public DaireselBagliListe(){
		son = null;
		uzunluk = 0;
	}
	public int listeUzunlugu() {
		return uzunluk;
	}
	public boolean bosMu() {
		return uzunluk == 0;
	}
	public void daireselBagliListeOlustur() {
		ListeDugumu birinci = new ListeDugumu(1);
		ListeDugumu ikinci = new ListeDugumu(5);
		ListeDugumu ucuncu = new ListeDugumu(10);
		ListeDugumu dorduncu = new ListeDugumu(15);
		
		birinci.sonraki = ikinci;
		ikinci.sonraki = ucuncu;
		ucuncu.sonraki = dorduncu;
		dorduncu.sonraki = birinci;
		
		son = dorduncu;
	}
	public void yazdir() {
		if(son == null) {
			return;
		}
		ListeDugumu simdiki = son.sonraki;
		while(simdiki != son) {
			System.out.print(simdiki.veri + " ");
			simdiki = simdiki.sonraki;
		}
		System.out.print(simdiki.veri + " ");
	}
	public void basaEkle(int deger) {
		ListeDugumu gecici = new ListeDugumu(deger);
		if(son == null) {
			son = gecici;
		}
		else {
			gecici.sonraki = son.sonraki;
		}
		son.sonraki = gecici;
		uzunluk++;
	}
	public void sonaEkle(int deger) {
		ListeDugumu gecici = new ListeDugumu(deger);
		if(son == null) {
			son = gecici;
			son.sonraki = son;
		}
		else {
			gecici.sonraki = son.sonraki;
			son.sonraki = gecici;
			son = gecici;
		}
		uzunluk++;
	}
	public ListeDugumu ilkDugumuSil() {
		if(bosMu()) {
			throw new NoSuchElementException("Dairesel baðlý liste zaten boþ!");
		}
		ListeDugumu gecici = son.sonraki;
		if(son.sonraki == son) {
			son = null;
		}
		else {
			son.sonraki = gecici.sonraki;
		}
		gecici.sonraki = null;
		uzunluk--;
		return gecici;
	}
	
	public static void main(String[] args) {
		DaireselBagliListe dbl = new DaireselBagliListe();
		dbl.daireselBagliListeOlustur();
		dbl.basaEkle(10);
		dbl.basaEkle(15);
		dbl.basaEkle(25);
		dbl.yazdir();
	}

}
