import java.util.Scanner;

public class ATM {
	private String sys_user = "BetulMUMCU";
	private int sys_pass = 613161;
	private String user;
	private int password;
	private double bakiye;
	Scanner input = new Scanner(System.in);

	
	public ATM(String sys_user, int sys_pass, double bakiye) {
		this.sys_user = sys_user;
		this.sys_pass = sys_pass;
		this.bakiye = bakiye;
	}
	
	public void bakiyeSorgula() {
	System.out.println("Mecvut Bakiye: " + this.bakiye);
	}
	public void paraYatir() {
		System.out.println("Yat�ralacak miktar� giriniz: ");
		double miktar = input.nextDouble();
		this.bakiye += miktar;
		System.out.println("Paran�z yat�r�l�yor...");
		System.out.println("Yeni bakiyeniz: " + this.bakiye);
		
	}
	public void paraCek() {
		System.out.println("En az 5 TL �ekilebilir.");
		System.out.println("�ekilecek miktar� giriniz: ");
		double miktar = input.nextDouble();
		if(this.bakiye >= miktar && miktar >= 5) {
			System.out.println("Paran�z haz�rlan�yor...");
			this.bakiye -= miktar;
			System.out.println("Yeni bakiyeniz: " + this.bakiye);
		}
		else {
			System.out.println("Yetersiz bakiye!");
		}
	}
	public void atm() {
		System.out.println("*---------------------|BETULM BANKA HO�GELD�N�Z|--------------------------*");
		System.out.print("Kullan�c� ad�: ");
		this.user = input.nextLine();
		System.out.print("�ifre: ");
		this.password = input.nextInt();
		if(this.user.equals(this.sys_user) && this.password == this.sys_pass) {
			System.out.println("Ho� Geldiniz " + this.sys_user);
			
			System.out.println("Bir i�lem se�iniz.");
			System.out.println("1: Bakiye Sorgulama | 2: Para �ekme | 3: Para Yat�rma | 4: ��k�� ");
			int islem = input.nextInt();
			
			while(islem != 4) {
				
				System.out.println("Bir i�lem se�iniz.");
				System.out.println("1: Bakiye Sorgulama | 2: Para �ekme | 3: Para Yat�rma | 4: ��k�� ");
				islem = input.nextInt();
				switch(islem) {
				case 1: 
					this.bakiyeSorgula();
					break;
				case 2: 
					this.paraCek();
					break;
				case 3: 
					this.paraYatir();
					break;
				case 4: 
					break;
				}
			}
			System.out.println("Sistemden ��k�l�yor...");
			
			
			
		}
		else {
			System.out.println("Kullan�c� ad� veya parola yanl��.");
			System.out.println("Sistemden ��k�l�yooreee...");
		}
	}
	
	public static void main(String[] args) {
		ATM banka = new ATM("Betul", 613161, 1000);
		banka.atm();
		
		
		
		
		
		
		
		
	}

}
