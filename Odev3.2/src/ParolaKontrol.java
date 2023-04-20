import java.util.Scanner;
public class ParolaKontrol {
	private static boolean uzunluk;
	private static boolean rakam;
	private static boolean sayiMi;
	private static boolean cevap;
	private static int kacRakam;
	private static String cevap2;
	private static boolean harfMi;
	private static boolean harfVar;
	private static boolean gecersizKarakter = false;
	public static String SifreKontrol(String parola) {
		char[] harf = parola.toCharArray();
		for(int i = 0; i < harf.length ; i++) 
		{
			char a = harf[i];
			sayiMi = Character.isDigit(harf[i]);
			harfMi = Character.isLetter(a);
			if(sayiMi == true) {
				kacRakam++;
			}
			if(harfMi == true) {
				harfVar = true;
			}
			if(sayiMi == false && harfMi == false) {
				gecersizKarakter = true;
			}
		}
		if(parola.length() >= 8) {
			uzunluk = true;
		}
		else {
			System.out.println("Parola en az sekiz karakterden oluþmalýdýr.");
		}
		if(harfVar == false || gecersizKarakter == true) {
			System.out.println("Parola yalnýzca harflerden ve rakamlardan oluþmalýdýr.");
		}
		if(kacRakam >= 2) {
			rakam = true;
		}
		else {
			System.out.println("Parola en az iki rakam içermelidir.");
		}
		cevap = (uzunluk == true && rakam == true && harfVar == true && gecersizKarakter == false);
		if(cevap == true) {
			cevap2 = "Parola geçerlidir: " + parola;
		}
		else{
			cevap2 = "Parola geçersizdir: " + parola;
		}
		return cevap2;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1. Bir parola en az sekiz karakterden oluþmalýdýr.");
		System.out.println("2. Bir parola yalnýzca harflerden ve rakamlardan oluþmalýdýr.");
		System.out.println("3. Bir parola en az iki rakam içermelidir.");
		System.out.println();
		System.out.println("Bir parola giriniz: ");
		String parola1 = input.nextLine();
		System.out.println(SifreKontrol(parola1));
	}
}