
public class Dikdortgen extends SekilTemelleri implements DikdortgenArayuzu {
	
	private int yukseklik;
	private int genislik;
	public Dikdortgen() {
		super();
		yukseklik = 0;
		genislik = 0;
	}
	public Dikdortgen(int belirliKonum, int belirliYukseklik, int belirliGenislik) {
		super(belirliKonum);
		yukseklik = belirliYukseklik;
		genislik = belirliGenislik;
	}
	
	public void set(int yeniYukseklik, int yeniGenislik) {
		yukseklik = yeniYukseklik;
		genislik = yeniGenislik;
	}
	public void burayaCiz() {
		yatayCizgiCiz();
		yanlariCiz();
		yatayCizgiCiz();
	}
	private void yatayCizgiCiz() {
		bosluklariAtla(getKonum());
		for(int sayac = 0; sayac < genislik; sayac++)
			System.out.print('-');
		System.out.println();
		
	}
	private void yanlariCiz() {
		for(int sayac = 0; sayac < yukseklik - 2; sayac++)
			yanCizgiCiz();
	}
	private void yanCizgiCiz() {
		bosluklariAtla(getKonum());
		System.out.print('|');
		bosluklariAtla(genislik - 2);
		System.out.println('|');
	}

	private void bosluklariAtla(int adet) {
		for(int sayac = 0; sayac < adet; sayac++)
			System.out.print(' ');
	}
	

}
