
public class IkiliAgac {
	
	private AgacDugumu kok;
	
	private class AgacDugumu{
		private int veri;
		private AgacDugumu sol;
		private AgacDugumu sag;
		
		public AgacDugumu(int veri) {
			this.veri = veri;
		}
	}
	
	public void ikiliAgacOlustur() {
			AgacDugumu birinci = new AgacDugumu(1);
			AgacDugumu ikinci = new AgacDugumu(2);
			AgacDugumu ucuncu = new AgacDugumu(3);
			AgacDugumu dorduncu = new AgacDugumu(4);
			AgacDugumu besinci = new AgacDugumu(5);
			
			kok = birinci;
			birinci.sol = ikinci;
			birinci.sag = ucuncu;
			
			ikinci.sol = dorduncu;
			ikinci.sag = besinci;
	}
	public  void kokBasta(AgacDugumu kok) {
		if(kok == null) {
			return;
		}
		System.out.print(kok.veri + " ");
		kokBasta(kok.sol);
		kokBasta(kok.sag);
	}
	public void kokOrtada(AgacDugumu kok) {
		if(kok == null) {
			return;
		}
		kokOrtada(kok.sol);
		System.out.print(kok.veri + " ");
		kokOrtada(kok.sag);
	}
	public void kokSonda(AgacDugumu kok) {
		if(kok == null) {
			return;
		}
		kokSonda(kok.sol);
		kokSonda(kok.sag);
		System.out.print(kok.veri + " ");
	}
	public static void main(String[] args) {
		IkiliAgac ia = new IkiliAgac();
		ia.ikiliAgacOlustur();
		
		System.out.print("Kök baþta: ");
		ia.kokBasta(ia.kok);
		System.out.println();
		
		System.out.print("Kök ortada: ");
		ia.kokOrtada(ia.kok);
		System.out.println();
		
		System.out.print("Kök sonda: ");
		ia.kokSonda(ia.kok);
	}
}
