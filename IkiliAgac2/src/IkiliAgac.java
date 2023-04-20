import java.util.Stack;

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
		AgacDugumu altinci = new AgacDugumu(6);
		AgacDugumu yedinci = new AgacDugumu(7);
		
		kok = birinci;
		birinci.sol = ikinci;
		birinci.sag = ucuncu;
		ikinci.sol = dorduncu;
		ikinci.sag = besinci;
		ucuncu.sol = altinci;
		ucuncu.sag = yedinci;
		
	}
	
	public void kokBasta(AgacDugumu kok) {
		if(kok == null) {
			return;
		}
		Stack<AgacDugumu> yigit = new Stack<>();
		yigit.push(kok);
		while(!yigit.isEmpty()) {
			AgacDugumu gecici = yigit.pop();
			System.out.print(gecici.veri + " ");
			if(gecici.sag != null) {
				yigit.push(gecici.sag);
			}
			if(gecici.sol != null) {
				yigit.push(gecici.sol);
			}
		}
	}
	
	public void kokOrtada(AgacDugumu kok) {
		if(kok == null) {
			return;
		}
		Stack<AgacDugumu> yigit = new Stack<>();
		AgacDugumu gecici = kok;
		while(!yigit.isEmpty() || gecici != null) {
			if(gecici != null) {
				yigit.push(gecici);
				gecici = gecici.sol;
			}
			else {
				gecici = yigit.pop();
				System.out.print(gecici.veri + " ");
				gecici = gecici.sag;
			}
		}
	}
	
	public void kokSonda(AgacDugumu kok) {
		AgacDugumu simdiki = kok;
		Stack<AgacDugumu> yigit = new Stack<>();
		while(simdiki != null || !yigit.isEmpty()) {
			if(simdiki != null) {
				yigit.push(simdiki);
				simdiki = simdiki.sol;
			}
			else {
				AgacDugumu gecici = yigit.peek().sag;
				if(gecici == null) {
					gecici = yigit.pop();
					System.out.print(gecici.veri + " ");
					while(!yigit.isEmpty() && gecici == yigit.peek().sag) {
						gecici = yigit.pop();
						System.out.print(gecici.veri + " ");
					}
				}
				else {
					simdiki = gecici;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		IkiliAgac ia = new IkiliAgac();
		ia.ikiliAgacOlustur();
		
		System.out.print("Kök basta: ");
		ia.kokBasta(ia.kok);
		System.out.println();
		
		System.out.print("Kök ortada: ");
		ia.kokOrtada(ia.kok);
		System.out.println();
		
		System.out.print("Kök sonda: ");
		ia.kokSonda(ia.kok);
	}
}
