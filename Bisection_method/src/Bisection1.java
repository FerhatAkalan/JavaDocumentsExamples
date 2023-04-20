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
		System.out.println("Üst limit giriniz: ");
		double üstLimit = input.nextDouble();
		System.out.println("Baðýl hatayý giriniz: ");
		verilenBagilHata = input.nextDouble();

		
		if(fonksiyon(altLimit)*fonksiyon(üstLimit) < 0) {
			while(bagilHata > verilenBagilHata) {
				yeniLimit = (altLimit + üstLimit) / 2;
				if(fonksiyon(altLimit)*fonksiyon(yeniLimit) < 0) {
					üstLimit = yeniLimit;
					System.out.println("üstLimit: " + üstLimit);
					yeniLimit2 = (altLimit + üstLimit) / 2;
					if(iterasyonSayaci != 1 ) {
						bagilHata = Math.abs(((yeniLimit2 - yeniLimit) / yeniLimit2)*100);	
					}
				}
				else {
					altLimit = yeniLimit;
					System.out.println("altLimit: " + altLimit);
					yeniLimit2 = (altLimit + üstLimit) / 2;
					if(iterasyonSayaci != 1 ) {
						bagilHata = Math.abs(((yeniLimit2 - yeniLimit) / yeniLimit2)*100);
					}
				}
				iterasyonSayaci += 1 ;
			}
			
		}
		else {
			System.out.println("Program çalýþmaz");
		
		}
		
		System.out.println();
		System.out.println("Baðýl hata: " + bagilHata);
		System.out.println();
		System.out.println("Kök : " + yeniLimit2);
		System.out.println();
		System.out.println("Ýterasyon sayýsý : " + iterasyonSayaci);
	}
	public static void main(String[] args) {
		/*System.out.println("Kökü bulunacak tanýmlayýnýz. Fonksiyon deðiþkeni olarak 'x' kullanýnýz.");
		System.out.println("");
		System.out.println("Örneðin: Math.sqrt((9.81*x)/0.25)*Math.tanh((Math.sqrt((9.81*0.25)/x))*4) - 36");
		
		fonksiyon1 = input.nextLine();*/
		bisection();
	}
}