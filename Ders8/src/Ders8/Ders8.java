package Ders8;

import java.util.Scanner;
//switch case 
public class Ders8 {

	public static void main(String[] args) {
		/*
		 * switch case 
		 * switch(operation){
		 * case durum1:
		 * 		break;
		 * case durum2:
		 * 		break;
		 * 
		 * 
		 * default:
		 * 		break;
		 * 
		 * }
		 */
		Scanner scan = new Scanner(System.in);
		int bakiye = 1000;
		int islem = 0;
		String sys_kullanýcý = "Ahmet";
		int sys_sifre = 12345;
		System.out.println("Kullanýcý adý: ");
		String kullanýcý = scan.nextLine();
		System.out.println("Þifre: ");
		int sifre = scan.nextInt();
	
		while(islem != 4) {
			if(sys_kullanýcý.equals(kullanýcý) && sys_sifre == sifre) {
				System.out.println("Hoþgeldin "+ sys_kullanýcý +" Ýþlem seçiniz.");
				System.out.println("1: Bakiye Görüntüle | 2: Para Yatýrma | 3: Para Çekme | 4: Sistemden Çýkýþ");
				
				islem = scan.nextInt();
				switch(islem) {
					case 1:
						System.out.println("Bakiyeniz: " + bakiye + " TL'dir" );
						break;
						
					case 2:
						System.out.println("Ne kadar yatýracaksýnýz?");
						int miktar = scan.nextInt();
						bakiye += miktar;
						System.out.println("Bakiyeniz: " + bakiye + " TL'dir");
						break;
						
					case 3:
						System.out.println("Ne kadar çekeceksiniz?");
						miktar = scan.nextInt();
						if(miktar > bakiye) {
							System.out.println("Yetersiz bakiye!");
						}
						else {
							bakiye -=miktar;
							System.out.println("Bakiyeniz " + bakiye + "TL'dir");
						}
						break;
						
					case 4:
						System.out.println("Sistemden Çýkýlýyor...");
						break;
						
					default:
						System.out.println("Geçersiz iþlem");
						break;
				}
			
			}
			
			else if (sys_kullanýcý.equals(kullanýcý) && sys_sifre != sifre) {
				System.out.println("Yanlýþ þifre!");
				break;
			}
			else if (!(sys_kullanýcý.equals(kullanýcý)) && sys_sifre == sifre) {
				System.out.println("Kullanýcý adý yanlýþ!");
				break;
			}
			else {
				System.out.println("Kullanýcý adý ve þifre yanlýþ!");
				break;
			}
		}
		System.out.println("Çýkýþ yapýlmýþtýr.");
	
		
		
	}

}
