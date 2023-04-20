
public class Ucgen extends SekilTemelleri implements UcgenArayuzu {
	private int taban;
	public Ucgen() {
		super();
		taban = 0;
	}
	public Ucgen(int belirliKonum, int belirliTaban) {
		super(belirliKonum);
		taban = belirliTaban;
	}
	public void set(int yeniTaban) {
		taban = yeniTaban;
	}
	public void asagiCiz() {
		ustCiz();
		tabanCiz();
	}
	private void tabanCiz() {
		bosluklariAtla(getKonum());
		for(int sayac = 0; sayac < taban; sayac++)
			System.out.print('*');
		System.out.println();
	}
	private void ustCiz() {
		int satirBasi = getKonum() + taban/2;
		bosluklariAtla(satirBasi);
		System.out.println('*');
		int satirSayisi = taban / 2 - 1;
		int icGenislik = 1;
		for(int sayac = 0; sayac < satirSayisi; sayac++) {
			satirBasi--;
			bosluklariAtla(satirBasi);
			System.out.print('*');
			bosluklariAtla(icGenislik);
			System.out.println('*');
			icGenislik = icGenislik + 2;
		}
	}
	private void bosluklariAtla(int adet) {
		for(int sayac = 0; sayac < adet; sayac++) {
			System.out.print(' ');
		}
	}
}