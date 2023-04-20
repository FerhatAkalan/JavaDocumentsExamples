package DersOrnek;

import java.util.Scanner;
//if else ornek
public class DersOrnek {

	public static void main(String[] args) {
		
		String s1, s2;
		System.out.println("Ýki satýr metin giriniz: ");
		Scanner keyboard = new Scanner(System.in);
		s1 = keyboard.nextLine();
		s2 = keyboard.nextLine();
		if (s1.equals(s2))
		{
			System.out.println("Ýki satýr birbirinie eþittir.");
		}
		else
		{
			System.out.println("Ýki satýr birbirine eþit deðildir!");
		}
		if (s2.equals(s1))
		{
			System.out.println("Ýki satýr birbirine eþittir.");
		}
		else
		{
			System.out.println("Ýki satýr birbirine eþit deðildir!");
		}
		if (s1.equalsIgnoreCase(s2))
		{
			System.out.println("Ancak büyük kücük harf ayrýmý gözetilmediginde iki satýr birbirine eþittir");
		}
		else
		{
			System.out.println ("Büyük / küçük harf ayrýmý gözetilmediðinde dahi iki satýr birbirine eþit deðildir.");
		}
	}

}
