
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
	public void yazdýr() {
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
	//Benim tek olanlarý listeleme metodum
	public static void teklisteleYunus(TekYonluBagliListe tybl)
	{
		//En sonda null deðer çekeceði için bu exception'u handle edecek bir Try-Catch bloðu yazdým
		try 
		{
			//Ýlk düðümden sonrakini çekerek geçiçi bir nesne oluþturuyoruz
			ListeDugumu simdiki = tybl.ilk.sonraki;
			while(true)
			{
				//Çektiðimiz nesnenin verisini yazdýrýyoruz
				System.out.print(simdiki.veri + " --> ");
				//Ýki sonraki nesneyi geçici nesnemize atýyoruz
				simdiki = simdiki.sonraki.sonraki;
			
			}
		
		}
		//Hata ortaya çýktýðý zaman null deðeri bulmuþuzdur. Bu nedenle null bulduðumuzu yazdýracaðýz
		catch(Exception e)
			{
				System.out.println("null");	
			}

	}

	//Benim çift olanlarý listeleme metodum
	public static void ciftlisteleYunus(TekYonluBagliListe tybl)
	{
			//En sonda null deðer çekeceði için bu exception'u handle edecek bir Try-Catch bloðu yazdým
			try 
			{
				//Ýlk düðümü çekerek geçiçi bir nesne oluþturuyoruz
				ListeDugumu simdiki = tybl.ilk;
				while(true)
				{
					//Çektiðimiz nesnenin verisini yazdýrýyoruz
					System.out.print(simdiki.veri + " --> ");
					//Ýki sonraki nesneyi geçici nesnemize atýyoruz
					simdiki = simdiki.sonraki.sonraki;	
				}
		
			}
			//Hata ortaya çýktýðý zaman null deðeri bulmuþuzdur. Bu nedenle null bulduðumuzu yazdýracaðýz
			catch(Exception e)
			{
				System.out.println("null");	
			}

	}

	//Erkan Güler'in çift olanlarý listeleme metodu
	public static void ciftlisteleErkan(TekYonluBagliListe tybl)
	{
		//Ýlk düðümü çekerek geçiçi bir nesne oluþturuyoruz
		ListeDugumu simdiki = tybl.ilk;
		//Geçici nesnemizden bir sonraki ve iki sonraki nesnemiz null olmadýðý sürece döngüye giriyoruz 
		while(simdiki.sonraki!=null&&simdiki.sonraki.sonraki!=null)
		{		
			//Çektiðimiz nesnenin verisini yazdýrýyoruz
			System.out.print(simdiki.veri + " --> ");
			//Ýki sonraki nesneyi geçici nesnemize atýyoruz
			simdiki = simdiki.sonraki.sonraki;	
		}
		//Döngü bittiðine göre null deðerine ulaþmýþýzdýr. Bunu yazdýrýyoruz.
		System.out.println("null");
	}

	//Erkan Güler'in tek olanlarý listeleme metodu
	public static void teklisteleErkan(TekYonluBagliListe tybl)
	{
		ListeDugumu simdiki = tybl.ilk.sonraki;
		while(simdiki.sonraki!=null&&simdiki.sonraki.sonraki!=null)
		{		
			//Çektiðimiz nesnenin verisini yazdýrýyoruz
			System.out.print(simdiki.veri + " --> ");
			//Ýki sonraki nesneyi geçici nesnemize atýyoruz
			simdiki = simdiki.sonraki.sonraki;	
		}
		//Döngü bittiðine göre null deðerine ulaþmýþýzdýr. Bunu yazdýrýyoruz.
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
		tybl.yazdýr();
		System.out.println("Geçen Süre: " + (System.currentTimeMillis() - simdi) + " milisaniye.");*/
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
		System.out.println("Demo Veri Hazýrlýklarý Tamamlandý. Sayaç Baþlatýlýyor.");
		System.out.println("Yapýlacak Test Adeti:"+yapilacaktest);
		double totalsure=0;while(kalantest>0)
		{
			double simdi = System.currentTimeMillis();
			ciftlisteleYunus(tybl);
			double sure=System.currentTimeMillis() - simdi;
			System.out.println("Geçen süre: "+sure+ " milisaniye");
			totalsure+=sure;
			kalantest-=1;
		}
		System.out.println("Test Bitti");
		System.out.println("Sonuçlar --> Toplam Süre (ms): "+totalsure+" Ortalama Süre (ms): "+totalsure/yapilacaktest+" Yapýlan Test:"+yapilacaktest);
	}
	

	}

