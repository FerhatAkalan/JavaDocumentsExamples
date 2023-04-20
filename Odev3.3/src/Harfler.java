import java.util.Scanner;

public class Harfler {
	private static int sesliHarf = 0;
	private static int sessizHarf;
	private static boolean harfMi;
	private static char[] sesli = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I','O', 'U'};
	public static void harfSay(String cumle) {
		char[] harf = cumle.toCharArray();
		String cumle2 = "";
		for(int i = 0; i < harf.length ; i++) {
			harfMi = Character.isLetter(harf[i]);
			if(harfMi == true) {
				cumle2 += harf[i];
				for(int a = 0; a < sesli.length; a++) {
					if(harf[i] == sesli[a]) {
						sesliHarf++;
						break;
					}
				}
			}
		}
		sessizHarf = cumle2.length() - sesliHarf;
		System.out.println();
		System.out.println("Sesli harf sayýsý: " + sesliHarf);
		System.out.println("Sessiz harf sayýsý: " + sessizHarf);	
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bir string giriniz: ");
		String cumle = input.nextLine();
		harfSay(cumle);
	}
}
