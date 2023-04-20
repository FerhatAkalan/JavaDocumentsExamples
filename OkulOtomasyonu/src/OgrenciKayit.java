
public class OgrenciKayit {
	private String name;
	private String surname;
	private String sch_number;
	private String kayitTarihi;
	private int disiplin;
	private int devamsizlikSayisi;
	private String turkceNot = "Girilmedi";
	private String matematikNot = "Girilmedi";
	private String biyolojiNot = "Girilmedi";
	
	
	
	public OgrenciKayit(String name, String surname, String sch_number, String kayitTarihi, int disiplin) {
		this.name = name;
		this.surname = surname;
		this.sch_number = sch_number;
		this.kayitTarihi = kayitTarihi;
		this.disiplin = disiplin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSch_number() {
		return sch_number;
	}

	public void setSch_number(String sch_number) {
		this.sch_number = sch_number;
	}

	public String getKayitTarihi() {
		return kayitTarihi;
	}

	public void setKayitTarihi(String kayitTarihi) {
		this.kayitTarihi = kayitTarihi;
	}

	public int getDisiplin() {
		return disiplin;
	}

	public void setDisiplin(int disiplin) {
		this.disiplin = disiplin;
	}

	public String getTurkceNot() {
		return turkceNot;
	}

	public void setTurkceNot(String turkceNot) {
		this.turkceNot = turkceNot;
	}

	public String getMatematikNot() {
		return matematikNot;
	}

	public void setMatematikNot(String matematikNot) {
		this.matematikNot = matematikNot;
	}

	public String getBiyolojiNot() {
		return biyolojiNot;
	}

	public void setBiyolojiNot(String biyolojiNot) {
		this.biyolojiNot = biyolojiNot;
	}

	public int getDevamsizlikSayisi() {
		return devamsizlikSayisi;
	}

	public void setDevamsizlikSayisi(int devamsizlikSayisi) {
		this.devamsizlikSayisi += devamsizlikSayisi;
	}
	
	

}