package DersOrnek;
enum FilmDerecesi {MUKEMMEL, ORTALAMA, KOTU};
// Switch case ornek
public class DersOrnek4 {

	public static void main(String[] args) {
		
		FilmDerecesi derece;
		derece = FilmDerecesi.ORTALAMA;
		switch(derece) 
		{
			case MUKEMMEL:
				System.out.println("Bu filmi mutlaka izlemelisin.");
				break;
			case ORTALAMA:
				System.out.println("Bu film idare eder.");
				break;
			case KOTU:
				System.out.println("Bu film izlemeye deðmez.");
				break;
			default:
				System.out.println("Derecelendirme dýþý.");
				break;
		}

	}

}
