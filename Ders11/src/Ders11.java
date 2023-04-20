
public class Ders11 {

	public static void main(String[] args) {
		/**
		 * for(baslatma; koþul; artýrma,azaltma){
		 * 		
		 * 		iþlemler
		 * } 
		 */
		
		for(int i=0 ; i < 5; i++) {
			
			for(int j = 0 ; j < 5; j++) {
				System.out.println("i = " + i + " j = " + j);
			}
			
			
		}
		System.out.println("Döngü bitti");
		int i = 0;
		int j = 0;
		while (i < 5) {
			j = 0;
			
			while(j < 5) {
				System.out.println("i= " + i + " j= " + j);
				j++;
			}
			i++;
		}
		
		
		
		
		

	}

}
