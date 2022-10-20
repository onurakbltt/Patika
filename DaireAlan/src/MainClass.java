import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int r, alfa;
		double alan, pi = Math.PI;
		Scanner scn = new Scanner(System.in);
		System.out.print("Dairenin yarıçapını giriniz: ");
		r = scn.nextInt();
		System.out.print("Daire diliminin merkez açı ölçüsünü giriniz: ");
		alfa = scn.nextInt();

		alan = (pi * (r * r) * alfa) / 360;
		System.out.println("Daire diliminin alanı: " + alan);
		scn.close();
	}

}
