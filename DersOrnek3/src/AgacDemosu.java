
public class AgacDemosu {
	public static final int GIRINTI = 5;
	public static final int AGAC_UST_GENISLIK = 21;
	public static final int AGAC_ALT_GENISLIK = 4;
	public static final int	AGAC_ALT_YUKSEKLÝK = 4;
	
	public static void main(String[] args) {
		agacCiz(AGAC_UST_GENISLIK ,AGAC_ALT_GENISLIK ,AGAC_ALT_YUKSEKLÝK );
		
	}

	private static void agacCiz(int ustGenislik, int altGenislik, int altYukseklik) {
		System.out.println(" Köknar Aðacý ");
		UcgenArayuzu agacUst = new Ucgen(GIRINTI, ustGenislik);
		ustCiz(agacUst);
		DikdortgenArayuzu agacGovde = new Dikdortgen(GIRINTI + ((ustGenislik/2) - (altGenislik/2)), altYukseklik, altGenislik);
		govdeCiz(agacGovde);
	}
	private static void ustCiz(UcgenArayuzu agacUst) {
		agacUst.asagiCiz(1);
	}
	private static void govdeCiz(DikdortgenArayuzu agacGovde) {
		agacGovde.burayaCiz();
	}
	

}
