
public class AnaProgram {

	public static void main(String[] args) {
		Fuze fuze1 = new Fuze(50, 100, "Hava");
		Fuze fuze2 = new Fuze(50, 100, "Kara");
		UAV uav1 = new UAV(500, 700);
		UAV uav2 = new UAV(500, 700);
		uav1.setFuze(fuze1);
		uav1.fuzeAtesle();
		System.out.println();
		uav2.setFuze(fuze2);
		uav2.fuzeAtesle();
		

	}

}
