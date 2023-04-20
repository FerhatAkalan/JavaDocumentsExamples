
public class AnaProgram {

	public static void main(String[] args) {
		Fuze fuze1 = new Fuze(50, 100, "Hava");
		Fuze fuze2 = new Fuze(50, 100, "Hava");
		Fuze fuze3 = new Fuze(50, 100, "Kara");
		UAV uav1 = new UAV(500, 700);
		
		uav1.setFuze(fuze1);
		uav1.setFuze(fuze2);
		uav1.setFuze(fuze3);
		System.out.println();
		uav1.havalan();
		uav1.fuzeAtesle();
	}
}