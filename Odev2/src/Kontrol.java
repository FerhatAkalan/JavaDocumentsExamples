import java.util.Scanner;
public class Kontrol {
	private static int a;
	private static int nokta;
	private static int aSag;
	private static String s1;
	private static boolean aVar = true;
	private static boolean noktaVar = true;
	private static boolean uzunlukVar = true;
	private static boolean aSagVar = true;
	private static boolean cevap;
	private static boolean cevapIp = true;
	private static boolean sayi = true;
	private static boolean sayiMi = true;
	public static boolean ePostaKontrol(String ePosta) {
		//Girilen eposta adresinde "@" karakteri "@", karakterinin solunda en az 1 harf, 
		//"@" karakterinin solunda en az nokta dahil karakter olup olmadýgýný kontrol edilir.
		//Kontrol edilen eposta adresinin doðru olup olmadýðýný anlamak için ekrana cevap döndürülür.
		a = ePosta.indexOf("@");
		nokta = ePosta.indexOf(".", 1);
		aSag = ePosta.indexOf("@") - 1;
		s1 = ePosta.substring(a+1, ePosta.length());
		if(a == -1) {
			aVar = false;
		}
		if(nokta == -1) {
			noktaVar = false;
		}
		if(s1.length() < 5) {
			uzunlukVar = false;
		}
		if(aSag < 0 ) {
			aSagVar = false;
		}
		cevap = (aVar == true && noktaVar == true && uzunlukVar == true && aSagVar == true);
		return cevap;
	}
	public static boolean IpKontrol(String ip) {
		//Girilen ip adresininde sayý olup olmadýgýný kontrol edilir.
		//Ýp adresi sayi ve uzunluðu doðru ise ip adresindeki sayilarýn 0-255 aralýðýnda olduðunu kontrol edilir.
		//Kontol edilen ip adresi doðru olup olmadýðýný anlamak için ekrana cevapIp döndürülür.
		String[] s2 = ip.split("\\.");
		for(int j = 0; j < s2.length; j++) 
		{
			String s3 = s2[j];
			for(int e = 0 ; e < 1 ; e++) 
			{
				char[] harf = s3.toCharArray();
				for(int h = 0; h < harf.length ; h++) 
				{
					char d = harf[h];
					sayiMi = Character.isDigit(d);
					if(sayiMi == false) {
						sayi = false;
					}
				}
			}
		}
		if(s2.length == 4 && sayi == true) 
		{
			for(int i = 0; i < s2.length; i++) 
			{
				int deger = Integer.valueOf(s2[i]);
				if(deger < 0 || deger > 255) 
				{	
					cevapIp = false;
				}
			}
		}
		else 
		{
			cevapIp = false;
		}
		return cevapIp;
	}
	public static void main(String[] args) {
		String posta, posta2, posta3;
		String ip, ip2, ip3;
		posta = "alican@gmail.com";
		posta2 = "a@b.com";
		posta3 = "a@b.c";
		System.out.println(ePostaKontrol(posta));
		System.out.println(ePostaKontrol(posta2));
		System.out.println(ePostaKontrol(posta3));
		ip = "123.45.67.8";
		ip2 = "123.45.678.9";
		System.out.println(IpKontrol(ip));
		System.out.println(IpKontrol(ip2));
	}
}
