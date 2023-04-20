
public class Baslangic {
	int x;
	
	public static void degistir(int a) {
		a +=10;
	}
	
	
	public void degistir2(Baslangic m1) {
		m1.x += 10;
		
		
	}
	public static void degistir3(int[] dizi) {
		dizi[0] += 10;
		
	}
	public static void main(String[] args) {
		int a =5;
		System.out.println("ilk deger: " + a);
		degistir(a);
		System.out.println("son deger: " + a);
		
		
		Baslangic m1 = new Baslangic();
		m1.x = 10;
		System.out.println("Ýlk deger: " + m1.x);
		m1.degistir2(m1);
		System.out.println("Son deger: " + m1.x);
		
		int[] dizi = {1,2,3,4,5};
		System.out.println("Ýlk deger " + dizi[0]);
		degistir3(dizi);
		System.out.println("Son deger " + dizi[0]);
	}

}
