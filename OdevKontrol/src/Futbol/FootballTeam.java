package Futbol;

public class FootballTeam {
	private String takiminAdi;
	private int galibiyetSayisi;
	private int maglubiyetSayisi;
	
	public FootballTeam(String takiminAdi, int galibiyetSayisi, int maglubiyetSayisi) {
		this.takiminAdi = takiminAdi;
		this.galibiyetSayisi = galibiyetSayisi;
		this.maglubiyetSayisi = maglubiyetSayisi;
	}
	public FootballTeam(String takiminAdi) {
		this(takiminAdi, 0, 0);
	}
	public String getTakiminAdi() {
		return takiminAdi;
	}
	public int getGalibiyetSayisi() {
		return galibiyetSayisi;
	}
	public int getMaglubiyetSayisi() {
		return maglubiyetSayisi;
	}
	void galibiyetSayisiArtir() {
		this.galibiyetSayisi += 1;
	}
	void maglubiyetSayisiArtir() {
		this.maglubiyetSayisi += 1;
	}
	public boolean iyiSicil() {
		if(this.galibiyetSayisi > this.maglubiyetSayisi) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		FootballTeam takim1 = new FootballTeam("Barcelona",3,5);
		System.out.println("Takımın Galibiyet Sayısı: " + takim1.getGalibiyetSayisi());
		System.out.println("Takımın Mağlubiyet Sayısı: " + takim1.getMaglubiyetSayisi());
		System.out.println("Takımın Sicili: " + takim1.iyiSicil());
		takim1.galibiyetSayisiArtir();
		takim1.galibiyetSayisiArtir();
		takim1.galibiyetSayisiArtir();
		System.out.println();
		System.out.println("Takımın Galibiyet Sayısı: " + takim1.getGalibiyetSayisi());
		System.out.println("Takımın Mağlubiyet Sayısı: " + takim1.getMaglubiyetSayisi());
		System.out.println("Takımın Sicili: " + takim1.iyiSicil());
	}
}
