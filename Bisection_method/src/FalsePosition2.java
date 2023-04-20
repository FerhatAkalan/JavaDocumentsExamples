import java.util.Scanner;

public class FalsePosition2 {
	public static Scanner input = new Scanner(System.in);
	private static double bagilHata = 100;
	private static double verilenBagilHata;
	private static double yeniLimit;
	private static double yeniLimit2;
	private static double iterasyonSayaci = 1;
	
	public static double fonksiyon(double x){
        return (Math.sqrt((9.81*x)/0.25))*(Math.tanh((Math.sqrt((9.81*0.25)/x))*4))-36;
    }
	
	public static void HataYakalama(){
		System.out.println("Alt limiti giriniz: ");
		double altLimit = input.nextDouble();
		System.out.println("Üst limit giriniz: ");
		double ustLimit = input.nextDouble();
		System.out.println("Baðýl hatayý giriniz: ");
		verilenBagilHata = input.nextDouble();
	    while( bagilHata > verilenBagilHata){
			iterasyonSayaci += 1 ;

	    	if(fonksiyon(altLimit)*fonksiyon(ustLimit) < 0){
	    		yeniLimit = ustLimit - ((fonksiyon(ustLimit)*(altLimit-ustLimit)/fonksiyon(altLimit)-fonksiyon(ustLimit)));
				if(fonksiyon(altLimit)*fonksiyon(yeniLimit) < 0) {
					ustLimit = yeniLimit;
					yeniLimit2 = ustLimit - ((fonksiyon(ustLimit)*(altLimit-ustLimit)/fonksiyon(altLimit)-fonksiyon(ustLimit)));
					if(iterasyonSayaci != 1 ) {
						bagilHata = Math.abs(((yeniLimit2 - yeniLimit) / yeniLimit2)*100);
						
					}
				}
				else {
					altLimit = yeniLimit;
					yeniLimit2 = ustLimit - ((fonksiyon(ustLimit)*(altLimit-ustLimit)/fonksiyon(altLimit)-fonksiyon(ustLimit)));
					if(iterasyonSayaci != 1 ) {
						bagilHata = Math.abs(((yeniLimit2 - yeniLimit) / yeniLimit2)*100);

					}
				}
	    	}
	    	else {
	    		System.out.println("Program çalýþmaz.");
	    	}
	    }
	    System.out.println();
		System.out.println("Baðýl hata: " + bagilHata);
		System.out.println();
		System.out.println("Kök : " + yeniLimit2);
		System.out.println();
		System.out.println("Ýterasyon sayýsý : " + iterasyonSayaci);
	}

	public static void main(String[] args) {
		
		HataYakalama();

	}

}
