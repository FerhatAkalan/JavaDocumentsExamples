
public class Anaprogram {

	public static void main(String[] args) {
		Otomobil otomobil1 = new Otomobil("12AB34");
		Otomobil otomobil2 = new Otomobil("56CD78");
		Minibus minibus1 = new Minibus("90AB12");
		Otobus otobus1 = new Otobus("34CD56");

		OGS ogs1 = new OGS("Ayþe" , "Su" , 100, otomobil1);
		otomobil1.setOgs(ogs1);

		OGS ogs2 = new OGS("Mehmet" , "Can" , 250, minibus1);
		minibus1.setOgs(ogs2) ;
		
		OGS ogs3 = new OGS("Ali" , "Can" , 300, otobus1);
		otobus1.setOgs(ogs3);
		
		OGS ogs4 = new OGS("Zeynep" , "Su" , 250, otomobil2);
	
		ogs1.Gecis();
		ogs2.Gecis();
		ogs3.Gecis();
		ogs4.Gecis();	
		Yonetim.Rapor();
	}
}
