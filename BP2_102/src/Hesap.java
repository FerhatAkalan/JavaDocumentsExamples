
public class Hesap {
	private String isim;
	private double bakiye;
	public static int hesapSayisi = 0;
	public Hesap(String isim, double bakiye) 
	{
		this.isim = isim;
		if (bakiye > 0.0)
			this.bakiye = bakiye;
		else
			this.bakiye = 0;
		hesapSayisi++;
	}
	
	public void paraYatir(double miktar)
	{
		if(miktar > 0.0) 
			bakiye += miktar;
	}
	public double getBakiye() 
	{
		return bakiye;
	}
	public String getIsim() 
	{
		return isim;
	}
	public static int getHesapSayisi() {
		return hesapSayisi;
	}

	public void setIsim(String isim) 
	{
		this.isim = isim;
	}
	public void setBakiye(int bakiye) 
	{
		this.bakiye = bakiye;
	}
	
}
