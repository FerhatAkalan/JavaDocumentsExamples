
public class ZamanKarmasikligi {
	public static void main(String[] args) {
		double simdi = System.currentTimeMillis();
		ZamanKarmasikligi demo = new ZamanKarmasikligi();
		System.out.println(demo.toplambul(999999999));
		System.out.println("Geçen süre: " + (System.currentTimeMillis() - simdi) + " milisaniye");
	}
	
	public double toplambul(int n) {
		return n * (n+1) / 2;
	}

}
