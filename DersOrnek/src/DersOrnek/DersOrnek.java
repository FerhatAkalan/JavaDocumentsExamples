package DersOrnek;

import java.util.Scanner;
//if else ornek
public class DersOrnek {

	public static void main(String[] args) {
		
		String s1, s2;
		System.out.println("�ki sat�r metin giriniz: ");
		Scanner keyboard = new Scanner(System.in);
		s1 = keyboard.nextLine();
		s2 = keyboard.nextLine();
		if (s1.equals(s2))
		{
			System.out.println("�ki sat�r birbirinie e�ittir.");
		}
		else
		{
			System.out.println("�ki sat�r birbirine e�it de�ildir!");
		}
		if (s2.equals(s1))
		{
			System.out.println("�ki sat�r birbirine e�ittir.");
		}
		else
		{
			System.out.println("�ki sat�r birbirine e�it de�ildir!");
		}
		if (s1.equalsIgnoreCase(s2))
		{
			System.out.println("Ancak b�y�k k�c�k harf ayr�m� g�zetilmediginde iki sat�r birbirine e�ittir");
		}
		else
		{
			System.out.println ("B�y�k / k���k harf ayr�m� g�zetilmedi�inde dahi iki sat�r birbirine e�it de�ildir.");
		}
	}

}
