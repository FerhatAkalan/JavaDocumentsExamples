package DersOrnek;

import java.util.Scanner;
//Yinelemeden �nce sor tekni�i
public class DersOrnek11 {

	public static void main(String[] args) {
		int not;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Say�sal not giriniz: ");
		not = keyboard.nextInt();

		while(not > 0) 
		{
			not = keyboard.nextInt();
			
		}
		System.out.println("D�ng� tamamland�.");

	}

}
