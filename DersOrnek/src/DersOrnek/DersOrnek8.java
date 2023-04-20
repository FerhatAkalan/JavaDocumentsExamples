package DersOrnek;
//Ýc ice donguler ornek
public class DersOrnek8 {

	public static void main(String[] args) {
		int M = 4, N = 5;
		int i = 1, j = 1;
		while (i<=N)
		{
			while (j<=M)
			{
				System.out.print( "(" + i + "," + j + ")" );
				j++;
			}
			System.out.println();
			j = 1;
			i++;
		}

	}

}
