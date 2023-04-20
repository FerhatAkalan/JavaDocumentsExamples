package DersOrnek;

import java.util.Scanner;

public class DersOrnek2 {
//if else ornek
	public static void main(String[] args) {
		int sayisalNot;
		char harfliNot;
		System.out.println("Sayýsal not giriniz: ");
		Scanner keyboard = new Scanner(System.in);
		sayisalNot = keyboard.nextInt();
		if(sayisalNot >= 90) {
			harfliNot = 'A';
		}
		else if(sayisalNot >= 80) {
			harfliNot = 'B';
		}
		else if(sayisalNot >= 70) {
			harfliNot = 'C';
		}
		else if(sayisalNot >= 60) {
			harfliNot = 'D';
		}
		else {
			harfliNot = 'F';
		}
		System.out.println("Sayýsal not: " + sayisalNot);
		System.out.println("Harfli not: " + harfliNot);
	}

}
