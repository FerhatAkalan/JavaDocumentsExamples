import java.util.Scanner;

public class Yonetici {
	private String sys_kul;
	private String sys_sif;
	private OgrenciKayit[] ogrenci = new OgrenciKayit[5];
	private OgrenciKayit ogrenci1;
	Scanner input = new Scanner(System.in);
	public Yonetici(String sys_kul, String sys_sif) {
		this.sys_kul = sys_kul;
		this.sys_sif = sys_sif;
	}
	public Yonetici() {
		
	}
	public String getSys_kul() {
		return sys_kul;
	}
	public void setSys_kul(String sys_kul) {
		this.sys_kul = sys_kul;
	}
	public String getSys_sif() {
		return sys_sif;
	}
	public void setSys_sif(String sys_sif) {
		this.sys_sif = sys_sif;
	}
	public OgrenciKayit[] getOgrenci() {
		return ogrenci;
	}
	public void setOgrenci(OgrenciKayit ogrenci) {
		for(int a = 0; a < this.ogrenci.length; a++){
			if(this.ogrenci[a] == null) {
				this.ogrenci[a] = this.ogrenci1;
				break;
			}
		} 
	}
	public OgrenciKayit getOgrenci1() {
		return ogrenci1;
	}
	public void setOgrenci1(OgrenciKayit ogrenci1) {
		this.ogrenci1 = ogrenci1;
	}
	public void setDers() {
		for(int a = 0; a < this.ogrenci.length; a++){
			if(this.getOgrenci()[a].getSch_number() == Otomasyon.getNumara())
			if(this.ogrenci[a] != null) {
				System.out.println("Notlarý harf cinsinden giriniz! ");
				input = new Scanner(System.in);
				System.out.println("Türkçe: ");
				String turkceNot = input.nextLine();
				this.ogrenci[a].setTurkceNot(turkceNot);
				System.out.println("Matematik: ");
				String matematikNot = input.nextLine();
				this.ogrenci[a].setMatematikNot(matematikNot);
				System.out.println("Biyoloji: ");
				String biyolojiNot = input.nextLine();
				this.ogrenci[a].setBiyolojiNot(biyolojiNot);
				break;
			}
		} 
	}
	public void setDevamsizlik() {
		for(int a = 0; a < this.ogrenci.length; a++){
			if(this.getOgrenci()[a].getSch_number().equals(Otomasyon.getNumara()))
			if(this.ogrenci[a] != null) {
				System.out.println("Devamsýzlýk sayýsýný giriniz: ");
				int devamsizlik = input.nextInt();
				this.getOgrenci()[a].setDevamsizlikSayisi(devamsizlik);
				break;
			}
		} 
	}
}