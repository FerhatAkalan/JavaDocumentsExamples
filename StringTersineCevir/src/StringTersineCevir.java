import java.util.Stack;

public class StringTersineCevir {
	
	public static String tersineCevir(String str) {
		Stack <Character> yigit = new Stack<>();
		char[] karakterler = str.toCharArray();
		
		for(char c: karakterler) {
			yigit.push(c);
		}
		for(int i = 0; i < str.length() ; i++) {
			karakterler[i] = yigit.pop();
		}
		return new String(karakterler);
	}
	public static void main(String[] args) {
		String str = "ABC";
		System.out.println("Tersine çevirmeden önce: " + str);
		System.out.println("Tersine çevirdikten sonra: " + tersineCevir(str));
	}

}
