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
		System.out.println("�st limit giriniz: ");
		double ustLimit = input.nextDouble();
		System.out.println("Ba��l hatay� giriniz: ");
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
	    		System.out.println("Program �al��maz.");
	    	}
	    }
	    System.out.println();
		System.out.println("Ba��l hata: " + bagilHata);
		System.out.println();
		System.out.println("K�k : " + yeniLimit2);
		System.out.println();
		System.out.println("�terasyon say�s� : " + iterasyonSayaci);
	}

	public static void main(String[] args) {
		
		HataYakalama();

	}

}
