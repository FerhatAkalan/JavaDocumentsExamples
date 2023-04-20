
public class YeniDizi {
	
	public static void diziTopla(int[] dizi1, int[]dizi2) {
		if(dizi1.length > dizi2.length) {
			int[] dizi3 = new int[dizi1.length];
			for(int sayac = 0; sayac < dizi1.length;sayac++) {
				try {
					dizi3[sayac] = dizi1[sayac] + dizi2[sayac];
				}
				catch(ArrayIndexOutOfBoundsException e){
					dizi3[sayac] = dizi1[sayac];
				}
			}
			System.out.print("Yeni dizinin elemanlarý: ");
			System.out.print("{");
			for(int sayac = 0; sayac < dizi3.length;sayac++) {
				System.out.print(dizi3[sayac]);
				if(sayac != (dizi3.length-1)) {
					System.out.print(",");
				}
			}
			System.out.print("}");
		}
		else {
			int[] dizi3 = new int[dizi2.length];
			for(int sayac = 0; sayac < dizi2.length;sayac++) {
				try {
					dizi3[sayac] = dizi1[sayac] + dizi2[sayac];
				}
				catch(ArrayIndexOutOfBoundsException e){
					dizi3[sayac] = dizi2[sayac];
				}
			}
			System.out.print("Yeni dizinin elemanlarý: ");
			System.out.print("{");
			for(int sayac = 0; sayac < dizi3.length ;sayac++) {
				System.out.print(dizi3[sayac]);
				if(sayac != (dizi3.length-1)) {
					System.out.print(",");
				}	
			}
			System.out.print("}");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] dizi1 = {1, 2, 3};
		int[] dizi2 = {5, 1, 2};
		
		int[] dizi3 = {1, 2, 3};
		int[] dizi4 = {5};
		
		int[] dizi5 = {1};
		int[] dizi6 = {5,1,2};
		
		int[] dizi7 = {};
		int[] dizi8 = {};
		
		diziTopla(dizi1, dizi2);
		diziTopla(dizi3, dizi4);
		diziTopla(dizi5, dizi6);
		diziTopla(dizi7, dizi8);

	}
}