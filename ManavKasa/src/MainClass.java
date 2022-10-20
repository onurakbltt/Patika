import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int a, e, d, m, p;
		double toplam, armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;

		System.out.print("Kaç kilo armut alacaksınız? ");
		a = scn.nextInt();
		System.out.print("Kaç kilo elma alacaksınız? ");
		e = scn.nextInt();
		System.out.print("Kaç kilo domates alacaksınız? ");
		d = scn.nextInt();
		System.out.print("Kaç kilo muz alacaksınız? ");
		m = scn.nextInt();
		System.out.print("Kaç kilo patlıcan alacaksınız? ");
		p = scn.nextInt();

		toplam = (a * armut) + (e * elma) + (d * domates) + (m * muz) + (p * patlican);

		System.out.println("Toplam tutarınız: " + toplam);
		scn.close();
	}

}
