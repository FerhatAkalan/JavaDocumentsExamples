
public class AnaProgram {

	public static void main(String[] args) {
		                //Kullan�c� ad� | �ifre | Bakiye
		Hesap hesap1 = new Hesap("Ali", "1234", 100.75);
		Hesap hesap2 = new Hesap("Ay�e", "3456", 250.55);
		ATM atm1 = new ATM(hesap1);
		ATM atm2 = new ATM(hesap2);
		atm1.giris();
		atm2.giris();
	}
}
