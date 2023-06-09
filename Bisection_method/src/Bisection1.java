import java.util.Scanner;

public class Bisection1 {
	
	public static Scanner input = new Scanner(System.in);
	private static double bagilHata = 100;
	private static double verilenBagilHata;
	private static double yeniLimit;
	private static double yeniLimit2;
	private static double iterasyonSayaci = 1;
	private static String fonksiyon1;
	
	public static double fonksiyon(double x) {
		return (Math.sqrt((9.81*x)/0.25))*(Math.tanh((Math.sqrt((9.81*0.25)/x))*4))-36;
	}
	
	public static void bisection() {

		System.out.println("Alt limiti giriniz: ");
		double altLimit = input.nextDouble();
		System.out.println("�st limit giriniz: ");
		double �stLimit = input.nextDouble();
		System.out.println("Ba��l hatay� giriniz: ");
		verilenBagilHata = input.nextDouble();

		
		if(fonksiyon(altLimit)*fonksiyon(�stLimit) < 0) {
			while(bagilHata > verilenBagilHata) {
				yeniLimit = (altLimit + �stLimit) / 2;
				if(fonksiyon(altLimit)*fonksiyon(yeniLimit) < 0) {
					�stLimit = yeniLimit;
					System.out.println("�stLimit: " + �stLimit);
					yeniLimit2 = (altLimit + �stLimit) / 2;
					if(iterasyonSayaci != 1 ) {
						bagilHata = Math.abs(((yeniLimit2 - yeniLimit) / yeniLimit2)*100);	
					}
				}
				else {
					altLimit = yeniLimit;
					System.out.println("altLimit: " + altLimit);
					yeniLimit2 = (altLimit + �stLimit) / 2;
					if(iterasyonSayaci != 1 ) {
						bagilHata = Math.abs(((yeniLimit2 - yeniLimit) / yeniLimit2)*100);
					}
				}
				iterasyonSayaci += 1 ;
			}
			
		}
		else {
			System.out.println("Program �al��maz");
		
		}
		
		System.out.println();
		System.out.println("Ba��l hata: " + bagilHata);
		System.out.println();
		System.out.println("K�k : " + yeniLimit2);
		System.out.println();
		System.out.println("�terasyon say�s� : " + iterasyonSayaci);
	}
	public static void main(String[] args) {
		/*System.out.println("K�k� bulunacak tan�mlay�n�z. Fonksiyon de�i�keni olarak 'x' kullan�n�z.");
		System.out.println("");
		System.out.println("�rne�in: Math.sqrt((9.81*x)/0.25)*Math.tanh((Math.sqrt((9.81*0.25)/x))*4) - 36");
		
		fonksiyon1 = input.nextLine();*/
		bisection();
	}
}