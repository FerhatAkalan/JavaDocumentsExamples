public class FaturaTest {

	public static void main(String[] args) {
		Fatura fatura1 = new Fatura("1234", "Kalem", 5, 3);
		System.out.println("Sat�n al�nan ��enin numaras�: " + fatura1.getOgeNumarasi());
		System.out.println("Sat�n al�nan ��enin a��klamas�: " + fatura1.getOgeAciklamasi());
		System.out.println("Sat�n al�nan ��enin miktar�: " + fatura1.getOgeMiktari());
		System.out.println("��e ba��na fiyat: " + fatura1.getOgeBasinaFiyat());
		System.out.println();
		System.out.println("Fatura tutar�: " + fatura1.faturaTutari());
	}
}

