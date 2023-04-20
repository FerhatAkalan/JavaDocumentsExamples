package DersOrnek;
//For dongusu ornegi
public class DersOrnek9 {

	public static void main(String[] args) {
		int N = 5, M = 4;
		int i, j;
		for(i = 1 ; i <= N ; i++)
		{
			for(j = 1 ; j <= M ; j++)
			{
				System.out.print( "(" + i + "," + j + ") " );
			}
			System.out.println();
		}
		int toplam = 0;
		for(int n = 1 ; n<=10 ; n++)
		{
			toplam = toplam + (n*n);
		}
		System.out.println(toplam);
		

	}

}
