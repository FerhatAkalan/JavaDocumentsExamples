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
		String sys_kullan�c� = "Ahmet";
		int sys_sifre = 12345;
		System.out.println("Kullan�c� ad�: ");
		String kullan�c� = scan.nextLine();
		System.out.println("�ifre: ");
		int sifre = scan.nextInt();
	
		while(islem != 4) {
			if(sys_kullan�c�.equals(kullan�c�) && sys_sifre == sifre) {
				System.out.println("Ho�geldin "+ sys_kullan�c� +" ��lem se�iniz.");
				System.out.println("1: Bakiye G�r�nt�le | 2: Para Yat�rma | 3: Para �ekme | 4: Sistemden ��k��");
				
				islem = scan.nextInt();
				switch(islem) {
					case 1:
						System.out.println("Bakiyeniz: " + bakiye + " TL'dir" );
						break;
						
					case 2:
						System.out.println("Ne kadar yat�racaks�n�z?");
						int miktar = scan.nextInt();
						bakiye += miktar;
						System.out.println("Bakiyeniz: " + bakiye + " TL'dir");
						break;
						
					case 3:
						System.out.println("Ne kadar �ekeceksiniz?");
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
						System.out.println("Sistemden ��k�l�yor...");
						break;
						
					default:
						System.out.println("Ge�ersiz i�lem");
						break;
				}
			
			}
			
			else if (sys_kullan�c�.equals(kullan�c�) && sys_sifre != sifre) {
				System.out.println("Yanl�� �ifre!");
				break;
			}
			else if (!(sys_kullan�c�.equals(kullan�c�)) && sys_sifre == sifre) {
				System.out.println("Kullan�c� ad� yanl��!");
				break;
			}
			else {
				System.out.println("Kullan�c� ad� ve �ifre yanl��!");
				break;
			}
		}
		System.out.println("��k�� yap�lm��t�r.");
	
		
		
	}

}
