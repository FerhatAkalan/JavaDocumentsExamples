

public class TekYonluBagliListe {
	private ListeDugumu ilk;
	
	public class ListeDugumu{
		private int veri;
		private ListeDugumu sonraki;
		
		public ListeDugumu(int veri) {
			this.veri = veri;
			this.sonraki= null;
		}
	}
	
	public void yazdir() {
		ListeDugumu simdiki = ilk;
		while(simdiki != null) {
			System.out.print(simdiki.veri + " --> ");
			simdiki = simdiki.sonraki;
		}
		System.out.println("null");
	}
	
	public int uzunluk() {
		if(ilk == null) {
			return 0;
		}
		int sayac = 0;
		ListeDugumu simdiki = ilk;
		while(simdiki != null) {
			sayac++;
			simdiki = simdiki.sonraki;
		}
		return sayac;
	}
	
	public void basaEkle(int deger) {
		ListeDugumu yeniDugum = new ListeDugumu(deger);
		yeniDugum.sonraki = ilk;
		ilk = yeniDugum;
	}
	
	public void sonaEkle(int deger) {
		ListeDugumu yeniDugum = new ListeDugumu(deger);
		if(ilk == null) {
			ilk = yeniDugum;
			return;
		}
		ListeDugumu simdiki = ilk;
		while(simdiki.sonraki != null) {
			simdiki = simdiki.sonraki;
		}
		simdiki.sonraki = yeniDugum;
	}
	public void ekle(int konum, int deger) {
		ListeDugumu yeniDugum = new ListeDugumu(deger);
		if(konum == 1) {
			yeniDugum.sonraki = ilk;
			ilk = yeniDugum;
		}
		else {
			ListeDugumu oncekiDugum = ilk;
			int sayac = 1;
			while(sayac < konum - 1) {
				oncekiDugum = oncekiDugum.sonraki;
				sayac++;
			}
			ListeDugumu simdiki = oncekiDugum.sonraki;
			yeniDugum.sonraki = simdiki;
			oncekiDugum.sonraki = yeniDugum;
		}
	}
	public ListeDugumu ilkDugumuSil() {
		if(ilk == null) {
			return null;
		}
		ListeDugumu gecici = ilk;
		ilk = ilk.sonraki;
		gecici.sonraki = null;
		return gecici;
	}
	public ListeDugumu sonDugumuSil() {
		if(ilk == null || ilk.sonraki == null) {
			return ilk;
		}
		ListeDugumu simdiki = ilk;
		ListeDugumu onceki = null;
		while(simdiki.sonraki != null) {
			onceki = simdiki;
			simdiki = simdiki.sonraki;
		}
		onceki.sonraki = null;
		return simdiki;
	}
	public void sil(int konum) {
		if(konum == 1) {
			ilk = ilk.sonraki;
		}
		else {
			ListeDugumu onceki = ilk;
			int sayac = 1;
			while(sayac < konum - 1) {
				onceki = onceki.sonraki;
				sayac++;
			}
			ListeDugumu simdiki = onceki.sonraki;
			onceki.sonraki = simdiki.sonraki;
		}
	}
	public boolean ara(ListeDugumu ilk, int aramaAnahtari) {
		if(ilk == null) {
			return false;
		}
		ListeDugumu simdiki = ilk;
		while(simdiki != null) {
			if(simdiki.veri == aramaAnahtari) {
				return true;
			}
			simdiki = simdiki.sonraki;
		}
		return false;
	}
	public ListeDugumu tersineCevir(ListeDugumu ilk) {
		if(ilk == null) {
			return ilk;
		}
		ListeDugumu simdiki = ilk;
		ListeDugumu onceki = null;
		ListeDugumu sonraki = null;
		while(simdiki != null) {
			sonraki = simdiki.sonraki;
			simdiki.sonraki = onceki;
			onceki = simdiki;
			simdiki = sonraki;
		}
		return onceki;
	}
	public static void main(String[] args) {
		TekYonluBagliListe tybl= new TekYonluBagliListe();
		
		tybl.ekle(1 , 3); // 3 ----> null
		tybl.ekle(2 , 5); // 3 ----> 5 ----> null
		tybl.ekle(1 , 2); // 2 ----> 3 ----> 5 ----> null
		tybl.ekle(2 , 4); // 2 ----> 4 ----> 3 ----> 5 ----> null
		tybl.ekle(5 , 7); // 2 ----> 4 ----> 3 ----> 5 ----> 7 ----> null
		tybl.yazdir();
		int aramaAnahtari = 1;
				
		if(tybl.ara(tybl.ilk, aramaAnahtari )) {
			System.out.println("Arama anahtarý "+ aramaAnahtari + " bulundu");
		}
		else {
			System.out.println("Arama anahtarý "+ aramaAnahtari + " bulunamadý");
		}
		
		
		tybl.ilk = tybl.tersineCevir(tybl.ilk);
		tybl.yazdir();
	}
}
