package Ders3;

import java.util.Scanner;

public class Ders3 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir say� giriniz: ");
		
		int a = scan.nextInt();
		
		System.out.println("Girdiginiz sayi: " + a);
		
		System.out.println("Bir yaz� giriniz: ");
		
		String c = scan.nextLine();

		System.out.println(c);
		
		
	}

}
