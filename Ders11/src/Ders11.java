
public class Ders11 {

	public static void main(String[] args) {
		/**
		 * for(baslatma; ko�ul; art�rma,azaltma){
		 * 		
		 * 		i�lemler
		 * } 
		 */
		
		for(int i=0 ; i < 5; i++) {
			
			for(int j = 0 ; j < 5; j++) {
				System.out.println("i = " + i + " j = " + j);
			}
			
			
		}
		System.out.println("D�ng� bitti");
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
