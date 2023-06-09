
public class TekYonluBagliListe {
	
		
	private static class ListeDugumu{
		private int veri;
		private ListeDugumu sonraki;
		
		public ListeDugumu(int veri) {
			this.veri = veri;
			this.sonraki = null;
		}

	}
	private ListeDugumu ilk;
	public void yazd�r() {
		int sayac = 1;
		ListeDugumu simdiki = ilk;
		while(simdiki != null) {
			if(sayac %2 == 0) {
				System.out.print(simdiki.veri  + " --> ");
				simdiki = simdiki.sonraki;
				sayac++;
			}
			else {
				simdiki = simdiki.sonraki;
				sayac++;
			}
		}
		System.out.println("null");
	}
	//Benim tek olanlar� listeleme metodum
	public static void teklisteleYunus(TekYonluBagliListe tybl)
	{
		//En sonda null de�er �ekece�i i�in bu exception'u handle edecek bir Try-Catch blo�u yazd�m
		try 
		{
			//�lk d���mden sonrakini �ekerek ge�i�i bir nesne olu�turuyoruz
			ListeDugumu simdiki = tybl.ilk.sonraki;
			while(true)
			{
				//�ekti�imiz nesnenin verisini yazd�r�yoruz
				System.out.print(simdiki.veri + " --> ");
				//�ki sonraki nesneyi ge�ici nesnemize at�yoruz
				simdiki = simdiki.sonraki.sonraki;
			
			}
		
		}
		//Hata ortaya ��kt��� zaman null de�eri bulmu�uzdur. Bu nedenle null buldu�umuzu yazd�raca��z
		catch(Exception e)
			{
				System.out.println("null");	
			}

	}

	//Benim �ift olanlar� listeleme metodum
	public static void ciftlisteleYunus(TekYonluBagliListe tybl)
	{
			//En sonda null de�er �ekece�i i�in bu exception'u handle edecek bir Try-Catch blo�u yazd�m
			try 
			{
				//�lk d���m� �ekerek ge�i�i bir nesne olu�turuyoruz
				ListeDugumu simdiki = tybl.ilk;
				while(true)
				{
					//�ekti�imiz nesnenin verisini yazd�r�yoruz
					System.out.print(simdiki.veri + " --> ");
					//�ki sonraki nesneyi ge�ici nesnemize at�yoruz
					simdiki = simdiki.sonraki.sonraki;	
				}
		
			}
			//Hata ortaya ��kt��� zaman null de�eri bulmu�uzdur. Bu nedenle null buldu�umuzu yazd�raca��z
			catch(Exception e)
			{
				System.out.println("null");	
			}

	}

	//Erkan G�ler'in �ift olanlar� listeleme metodu
	public static void ciftlisteleErkan(TekYonluBagliListe tybl)
	{
		//�lk d���m� �ekerek ge�i�i bir nesne olu�turuyoruz
		ListeDugumu simdiki = tybl.ilk;
		//Ge�ici nesnemizden bir sonraki ve iki sonraki nesnemiz null olmad��� s�rece d�ng�ye giriyoruz 
		while(simdiki.sonraki!=null&&simdiki.sonraki.sonraki!=null)
		{		
			//�ekti�imiz nesnenin verisini yazd�r�yoruz
			System.out.print(simdiki.veri + " --> ");
			//�ki sonraki nesneyi ge�ici nesnemize at�yoruz
			simdiki = simdiki.sonraki.sonraki;	
		}
		//D�ng� bitti�ine g�re null de�erine ula�m���zd�r. Bunu yazd�r�yoruz.
		System.out.println("null");
	}

	//Erkan G�ler'in tek olanlar� listeleme metodu
	public static void teklisteleErkan(TekYonluBagliListe tybl)
	{
		ListeDugumu simdiki = tybl.ilk.sonraki;
		while(simdiki.sonraki!=null&&simdiki.sonraki.sonraki!=null)
		{		
			//�ekti�imiz nesnenin verisini yazd�r�yoruz
			System.out.print(simdiki.veri + " --> ");
			//�ki sonraki nesneyi ge�ici nesnemize at�yoruz
			simdiki = simdiki.sonraki.sonraki;	
		}
		//D�ng� bitti�ine g�re null de�erine ula�m���zd�r. Bunu yazd�r�yoruz.
		System.out.println("null");
	}

	public static void main(String[] args) {
		/*double simdi = System.currentTimeMillis();
		TekYonluBagliListe tybl = new TekYonluBagliListe();
		tybl.ilk = new ListeDugumu(10);
		ListeDugumu ikinci = new ListeDugumu(1);
		ListeDugumu ucuncu = new ListeDugumu(8);
		ListeDugumu dorduncu = new ListeDugumu(11);
		tybl.ilk.sonraki = ikinci;
		ikinci.sonraki = ucuncu;
		ucuncu.sonraki = dorduncu;
		tybl.yazd�r();
		System.out.println("Ge�en S�re: " + (System.currentTimeMillis() - simdi) + " milisaniye.");*/
		System.out.println();
		int yapilacaktest=100;
		int ListeDugumuAdet=100; 
		TekYonluBagliListe tybl = new TekYonluBagliListe();	
		tybl.ilk = new ListeDugumu(0);
		int sayac=1;
		ListeDugumu tempLD1=tybl.ilk;
		while(sayac<=ListeDugumuAdet)
		{
			tempLD1.sonraki=new ListeDugumu(sayac);
			tempLD1=tempLD1.sonraki;
			sayac++;
		}
		int kalantest=yapilacaktest;
		System.out.println("Demo Veri Haz�rl�klar� Tamamland�. Saya� Ba�lat�l�yor.");
		System.out.println("Yap�lacak Test Adeti:"+yapilacaktest);
		double totalsure=0;while(kalantest>0)
		{
			double simdi = System.currentTimeMillis();
			ciftlisteleYunus(tybl);
			double sure=System.currentTimeMillis() - simdi;
			System.out.println("Ge�en s�re: "+sure+ " milisaniye");
			totalsure+=sure;
			kalantest-=1;
		}
		System.out.println("Test Bitti");
		System.out.println("Sonu�lar --> Toplam S�re (ms): "+totalsure+" Ortalama S�re (ms): "+totalsure/yapilacaktest+" Yap�lan Test:"+yapilacaktest);
	}
	

	}

