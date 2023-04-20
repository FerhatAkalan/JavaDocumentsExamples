
public class AnaProgram {

	public static void main(String[] args) {
		Sarjor sarjor1 = new Sarjor(20, 10);
		sarjor1.mermiAtesle();
		System.out.println("Þarjörden mermi ateþlendi\nKalan mermi: " + sarjor1.getMevcutMermi());
		sarjor1.sarjorDoldur();
		System.out.println();
		
		Sarjor sarjor2 = new Sarjor(30, 20);
		Silah silah1 = new Silah(50);
		silah1.setSarjor(sarjor2);
		silah1.atesEt(30);
		silah1.yenidenDoldur();
		System.out.println();
		
		Sarjor sarjor3 = new Sarjor(50, 30);
		OtomatikSilah otomatiksilah = new OtomatikSilah(5);
		otomatiksilah.setSarjor(sarjor3);
		otomatiksilah.atesEt();
		otomatiksilah.yenidenDoldur();
		System.out.println();
	}
}