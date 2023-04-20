package DersOrnek;

import java.util.Scanner;
//Yinelemeden önce sor tekniði
public class DersOrnek11 {

	public static void main(String[] args) {
		int not;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Sayýsal not giriniz: ");
		not = keyboard.nextInt();

		while(not > 0) 
		{
			not = keyboard.nextInt();
			
		}
		System.out.println("Döngü tamamlandý.");

	}

}
