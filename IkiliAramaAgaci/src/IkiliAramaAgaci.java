
public class IkiliAramaAgaci {
	
	private AgacDugumu kok;
	
	private class AgacDugumu{
		
		private int veri;
		private AgacDugumu sol;
		private AgacDugumu sag;
		
		public AgacDugumu(int veri) {
			this.veri = veri;
		}
		
	}
	
	public void ekle(int deger) {
		kok = ekle(kok, deger);
	}
	
	public AgacDugumu ekle(AgacDugumu kok, int deger) {
		if(kok == null) {
			kok = new AgacDugumu(deger);
			return kok;
		}
		if(deger < kok.veri) {
			kok.sol = ekle(kok.sol, deger);
		}
		else {
			kok.sag = ekle(kok.sag, deger);
		}
		return kok;
	}
	
	public void kokOrtada() {
		kokOrtada(kok);
	}
	
	public void kokOrtada(AgacDugumu kok) {
		if(kok == null) {
			return;
		}
		kokOrtada(kok.sol);
		System.out.print(kok.veri + " ");
		kokOrtada(kok.sag);
	}
	
	public AgacDugumu ara(int anahtar) {
		return ara(kok, anahtar);
	}
	
	public AgacDugumu ara(AgacDugumu kok, int anahtar) {
		if(kok == null || kok.veri == anahtar) {
			return kok;
		}
		if(anahtar < kok.veri) {
			return ara(kok.sol, anahtar);
		}
		else {
			return ara(kok.sag, anahtar);
		}
	}
	
	public static void main(String[] args) {
		IkiliAramaAgaci iaa = new IkiliAramaAgaci();
		iaa.ekle(5);
		iaa.ekle(3);
		iaa.ekle(7);
		iaa.ekle(1);
		
		iaa.kokOrtada();
		System.out.println();
		
		int anahtar = 3;
		if(iaa.ara(anahtar) != null) {
			System.out.println("Anahtar \"" + anahtar + "\" bulundu!");
		}
		else {
			System.out.println("Anahtar \"" + anahtar + "\" bulunamadý!");
		}
		anahtar = 10;
		if(iaa.ara(anahtar) != null) {
			System.out.println("Anahtar \"" + anahtar + "\" bulundu!");
		}
		else {
			System.out.println("Anahtar \"" + anahtar + "\" bulunamadý!");
		}
	}
	

}
