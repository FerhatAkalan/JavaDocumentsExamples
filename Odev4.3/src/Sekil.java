import java.util.Vector;

public class Sekil extends Hesaplama {
	private Vector vector;
	
	
	public static void main(String[] args) {
		Cember cember = new Cember(5);
		Daire daire = new Daire(10);
		Kare kare = new Kare(5); 
		Kup kup = new Kup(kare);
		Vector vector = new Vector();
		
		vector.add(cember);
		vector.add(daire);
		vector.add(kare);
		vector.add(kup);
		
		

		for(int sayac = 0; sayac < vector.size(); sayac++) {
			if(vector.get(sayac) instanceof Daire ) {
				hesaplama((Daire) vector.get(sayac));
				System.out.println();
			}
			else if(vector.get(sayac) instanceof Cember ) {
				hesaplama((Cember) vector.get(sayac));
				System.out.println();
			}
			else if(vector.get(sayac) instanceof Kare ) {
				hesaplama((Kare) vector.get(sayac));
				System.out.println();
			}
			else if(vector.get(sayac) instanceof Kup ) {
				hesaplama((Kup) vector.get(sayac));
				System.out.println();
			}
			
		}
	}
}