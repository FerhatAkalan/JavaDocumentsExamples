import java.util.Scanner;

public class FalsePosition {
	public static double bagilHata;
	public static double yaklasikBagilHata = 100;
	public static double altLimit;
	public static double ustLimit;
	public static double yeniLimit;
	
	public static double Fonksiyon(double x){
        return (Math.sqrt((9.81*x)/0.25))*(Math.tanh((Math.sqrt((9.81*0.25)/x))*4))-36;
    }
	public void HataYakalama(){
	    Scanner scan = new Scanner(System.in);
	    //Alt limit al�n�r.
	    System.out.println("Alt limiti giriniz(Xl):");
	    altLimit = scan.nextDouble();
	    //�st limit al�n�r ve de�ere atan�r.
	    System.out.println("�st limiti giriniz(Xu):");
	    ustLimit= scan.nextDouble();
	    //Ba��l hata de�eri
	    System.out.println("Ba��l hata de�eri giriniz:");
	    bagilHata=scan.nextDouble();
	    while( yaklasikBagilHata > bagilHata){
	    	if(Fonksiyon(altLimit)*Fonksiyon(ustLimit)>0){
	    		ustLimit= yeniLimit;
		        yaklasikBagilHata();
	    	}
	    }
	}
	public static double yaklasikBagilHata(){
		return yaklasikBagilHata=Math.abs(((ustLimit-altLimit)/altLimit)*100);   
	}
	public double yeniLimit(){
		return yeniLimit= ustLimit-((Fonksiyon(ustLimit)*(altLimit-ustLimit)/Fonksiyon(altLimit)-Fonksiyon(ustLimit)));
	}
	public static void main(String[] args) {
	    while( yaklasikBagilHata > bagilHata){
	    	if(Fonksiyon(altLimit)*Fonksiyon(ustLimit)>0){
	    		ustLimit= yeniLimit;
		        yaklasikBagilHata();
	    	}
	    }
		FalsePosition f = new FalsePosition();
        f.HataYakalama();
	}
}
