import java.util.Random;
public class Barbut {
	private static int zar1;
	private static int zar2;
	private static int toplam;
	public static int zarAt() 
	{
		Random rastgele = new Random();
		zar1 = rastgele.nextInt(7);
		zar2 = rastgele.nextInt(7);
		toplam = zar1 + zar2;
		return toplam;
	}
	public static void main(String[] args) {
		zarAt();
		if(toplam == 7 || toplam == 11) 
		{
			System.out.println("Oyuncunun attýðý zar " + zar1 + " " + "+ " + zar2 + " = " + toplam );
			System.out.println("Oyuncu kazandý !");
		}
		else if(toplam == 2  || toplam == 3 || toplam == 12 )
		{
			System.out.println("Oyuncunun attýðý zar " + zar1 + " " + "+ " + zar2 + " = " + toplam );
			System.out.println("Oyuncu kaybetti !");
		}
		else 
		{
			int puan; 
			puan = toplam;
			System.out.println("Oyuncunun attýðý zar " + zar1 + " " + "+ " + zar2 + " = " + toplam);
			System.out.println("Oyuncunun puaný: " + puan);
			while(true) 
			{
				int yeniToplam = zarAt();
				if(puan == yeniToplam) 
				{
					System.out.println("Oyuncunun attýðý zar " + zar1 + " " + "+ " + zar2 + " = " + yeniToplam);
					System.out.println("Oyuncu kazandý !");
					break;
				}
				else if(yeniToplam == 7) 
				{
					System.out.println("Oyuncunun attýðý zar " + zar1 + " " + "+ " + zar2 + " = " + yeniToplam);
					System.out.println("Oyuncu kaybetti !");
					break;
				}
				else {
					System.out.println("Oyuncunun attýðý zar " + zar1 + " " + "+ " + zar2 + " = " + yeniToplam);
				}
			}
		}
	}
}
