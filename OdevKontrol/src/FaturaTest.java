public class FaturaTest {

	public static void main(String[] args) {
		Fatura fatura1 = new Fatura("1234", "Kalem", 5, 3);
		System.out.println("Satın alınan öğenin numarası: " + fatura1.getOgeNumarasi());
		System.out.println("Satın alınan öğenin açıklaması: " + fatura1.getOgeAciklamasi());
		System.out.println("Satın alınan öğenin miktarı: " + fatura1.getOgeMiktari());
		System.out.println("Öğe başına fiyat: " + fatura1.getOgeBasinaFiyat());
		System.out.println();
		System.out.println("Fatura tutarı: " + fatura1.faturaTutari());
	}
}

