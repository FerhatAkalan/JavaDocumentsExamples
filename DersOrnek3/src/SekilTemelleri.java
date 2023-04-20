
public class SekilTemelleri implements SekilArayuzu 
{
	private int konum;
	
	public SekilTemelleri() {
		konum = 0;
	}
	public SekilTemelleri(int belirliKonum) {
		konum =  belirliKonum;
	}
	public void setKonum(int yeniKonum) {
		konum = yeniKonum;
	}
	public int getKonum() {
		return konum;
	}
	public void asagiCiz(int satirSayisi) {
		for(int sayac = 0; sayac < satirSayisi; sayac++)
			System.out.println();
		burayaCiz();
	}
	public void burayaCiz() {
		for(int sayac = 0; sayac < konum; sayac++) 
			System.out.print(' ');
		System.out.println('*');
	}
}