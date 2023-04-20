
public class MaxOK {
	Integer[] heap;
	int n;

	public MaxOK(int kapasite) {
		heap = new Integer[kapasite + 1];
		n = 0;
	}

	public boolean bosMu() {
		return n == 0;
	}

	public int buyukluk() {
		return n;
	}

	public void ekle(int x) {
		if (n == heap.length - 1) {
			buyut(2 * heap.length);
		}
		n++;
		heap[n] = x;
		yuzdur(n);
	}

	private void buyut(int kapasite) {
		Integer[] gecici = new Integer[kapasite];
		for(int i = 0; i < heap.length; i++) {
			gecici[i] = heap[i];
		}
		heap = gecici;

	}
	
	private void yuzdur(int k) {
		while(k > 1 && heap[k/2] < heap[k]) {
			int gecici = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = gecici;
			k = k / 2;
		}
	}
	
	public void yazdir() {
		for(int i = 1; i <= n; i++) {
			System.out.print(heap[i] + " ");
		}
	}
	
	public int silMax() {
		int max = heap[1];
		yerDegistir(1,n);
		n--;
		batir(1);
		heap[n+1] = null;
		if(n > 0 && (n == (heap.length - 1) / 4) ) {
			kucult(heap.length / 2);
		}
		return max;
	}
	
	public void yerDegistir(int a, int b) {
		int gecici = heap[a];
		heap[a] = heap[b];
		heap[b] = gecici;
	}
	
	public void kucult(int kapasite) {
		Integer[] gecici = new Integer[kapasite];
		for(int i = 0; i < heap.length; i++) {
			gecici[i] = heap[i];
		}
		heap = gecici;
	}
	
	public void batir(int k) {
		while(2 * k <= n) {
			int j = 2 * k;
			if(j < n && heap[j] < heap[j + 1]) {
				j++;
			}
			if(heap[k] >= heap[j]) {
				break;
			}
			yerDegistir(k, j);
			k = j;
		}
	}
	public static void main(String[] args) {
		MaxOK ok = new MaxOK(3);
		ok.ekle(4);
		ok.ekle(5);
		ok.ekle(2);
		ok.ekle(6);
		ok.ekle(1);
		ok.ekle(3);
		System.out.println(ok.buyukluk());
		ok.yazdir();
		System.out.println();
		ok.silMax();
		ok.yazdir();

	}

}
