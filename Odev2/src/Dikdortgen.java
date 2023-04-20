import java.util.Scanner;
public class Dikdortgen {
	private static int uzunKenar, kisaKenar;
	public static void dikdortgenOlustur() {
		Scanner input = new Scanner(System.in);
		System.out.println("A kenarýnýn uzunluðunu giriniz: ");
		uzunKenar = input.nextInt();
		System.out.println("B kenarýnýn uzunluðunu giriniz: ");
		kisaKenar = input.nextInt();
		for(int b = 0 ; b < kisaKenar; b++) 
		{
			for(int a = 0; a < uzunKenar ; a++ ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i = 1; i <= kisaKenar ; i++) 
		{
			if(i == 1 || i == kisaKenar) 
			{
				for(int n = 1; n <= uzunKenar ; n++ ) 
				{
					System.out.print("*");
				}
				System.out.println();
			}
			else 
			{
				for(int n = 1; n <= uzunKenar ; n++ ) 
				{
					if(n == 1 || n == uzunKenar) 
					{
						System.out.print("*");

					}
					else 
					{
						System.out.print(" ");

					}
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		dikdortgenOlustur();
	}

}
