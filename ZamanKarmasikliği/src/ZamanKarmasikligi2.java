
public class ZamanKarmasikligi2 {
	public static void main(String[] args) {
		double simdi = System.currentTimeMillis();
		ZamanKarmasikligi demo = new ZamanKarmasikligi();
		System.out.println(demo.toplambul(999999999));
		System.out.println("Geçen süre: " + (System.currentTimeMillis() - simdi) + " milisaniye");
	}
	
	public int toplambul(int n) {
		int toplam = 0;
		for(int i = 1; i<=n; i++) {
			toplam += i;
		}
		return toplam;
	}

}