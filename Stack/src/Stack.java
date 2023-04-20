import java.util.EmptyStackException;

public class Stack {
	private ListeDugumu top;
	private int uzunluk;
	
	private class ListeDugumu{
		private int veri;
		private ListeDugumu sonraki;
		
		public ListeDugumu(int veri) {
			this.veri = veri;
		}
	}
	public Stack() {
		top = null;
		uzunluk = 0;
	}
	public int stackUzunlugu() {
		return uzunluk;
	}
	public boolean bosMu() {
		return uzunluk == 0;
	}
	public void push(int veri) {
		ListeDugumu gecici = new ListeDugumu(veri);
		gecici.sonraki = top;
		top = gecici;
		uzunluk++;
	}
	public int pop() {
		if(bosMu()) {
			throw new EmptyStackException();
		}
		int sonuc = top.veri;
		top = top.sonraki;
		uzunluk--;
		return sonuc;
	}
	public  int peek() {
		if(bosMu()) {
			throw new EmptyStackException();
		}
		return top.veri;
	}
	
	public static void main(String[] args) {
		Stack yigit = new Stack();
		
		yigit.push(10);
		yigit.push(15);
		yigit.push(20);
		System.out.println(yigit.peek());
		yigit.pop();
		System.out.println(yigit.peek());
		yigit.pop();
		System.out.println(yigit.peek());
	}

}
