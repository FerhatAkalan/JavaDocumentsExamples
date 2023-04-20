
public class AnaProgram {
	public static void main(String[] args) {
		Kedi kedi1 = new Kedi("Pamuk");
		Kedi kedi2 = new Kedi("Duman");
		Akvaryum akvaryum1 = new Akvaryum(6);
		Insan insan1 = new Insan("Ali", "12345678910");
		Insan insan2 = new Insan("Ayþe", "12345678911");
		Insan insan3 = new Insan("Zeynep", "12345678912");
		Insan insan4 = new Insan("Ahmet", "12345678913");
		insan1.setEvcilHayvan(kedi1);
		insan2.setEvcilHayvan(kedi2);
		insan3.setEvcilHayvan(akvaryum1);
		System.out.println("Ýsim: " + insan1.getIsim() + "	TCKimlik: " + insan1.getTCKimlik());
		System.out.println("Ýsim: " + insan2.getIsim() + "	TCKimlik: " + insan2.getTCKimlik());
		System.out.println("Ýsim: " + insan3.getIsim() + "	TCKimlik: " + insan3.getTCKimlik());
		System.out.println("Ýsim: " + insan4.getIsim() + "	TCKimlik: " + insan4.getTCKimlik());
		System.out.println();
		System.out.println(insan1.kendiniTanýt());
		System.out.println(insan2.kendiniTanýt());
		System.out.println(insan3.kendiniTanýt());
		System.out.println(insan4.kendiniTanýt());
	}
}
