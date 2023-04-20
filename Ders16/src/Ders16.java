
public class Ders16 {
	public static int ucİleCarp(int a ) {
		return a*3;
	}
	
	public static int ikiTopla(int a) {
		return a+2;
		
	}
	public static int dortCikart(int a) {
		return a-4;
	}
	public static void main(String[] args) {
		
		System.out.println("Sonuç: " + dortCikart(ikiTopla(ucİleCarp(4))));
							
	}

}
