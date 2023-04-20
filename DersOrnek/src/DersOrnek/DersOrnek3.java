package DersOrnek;
//if else ornek exit metodu
public class DersOrnek3 {

	public static void main(String[] args) {
		int n1 = 7 , n2 = 6;
		int max;
		max = (n1>n2) ? n1:n2;
		System.out.println("max: " + max);
		
		int kazananSayisi, toplamIkramiye, pay;
		kazananSayisi = 0 ;
		toplamIkramiye = 100000;
		
		if (kazananSayisi == 0) 
		{
			System.out.println ("Hata: Sýfýra Bölme");
			System.exit(0);
			
		}
		else 
		{
			pay = toplamIkramiye / kazananSayisi;
			System.out.println ("Her bir talihli " + pay + " TL kazandý.");
		}
		
		
		
	}

}
