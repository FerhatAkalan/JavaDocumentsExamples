import java.util.Stack;

public class SonrakiBuyukEleman {
	public static int[] sonrakiBuyukEleman(int[] dizi) {
		int[] sonuc = new int[dizi.length];
		Stack <Integer> yigit = new Stack<>();
		for(int i = dizi.length - 1; i>=0;i--) {
			if(!yigit.isEmpty() && yigit.peek() <= dizi[i]) {
				yigit.pop();
			}
			if(yigit.isEmpty()) {
				sonuc[i] = -1;
			}
			else {
				sonuc[i] = yigit.peek();
			}
			yigit.push(dizi[i]);
		}
		return sonuc;
		
	}
	public static void main(String[] args) {
		int[] dizi = new int[6];
		int[] sonuc = new int[6];
		System.out.println(sonrakiBuyukEleman(dizi));
	}

}
