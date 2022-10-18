import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		double tutar, kdvOran1 = 0.18, kdvOran2 = 0.08;

		Scanner scn = new Scanner(System.in);
		System.out.print("Ücret tutarını girin: ");
		tutar = scn.nextDouble();

		double kdvTutar1 = tutar * kdvOran1;
		double kdvTutar2 = tutar * kdvOran2;

		double toplamTutar1 = tutar + kdvTutar1;
		double toplamTutar2 = tutar + kdvTutar2;

		if (tutar > 0 && tutar < 1000) {
			System.out.println("Toplam tutarınız: " + toplamTutar1);
		} else {
			System.out.println("Toplam tutarınız: " + toplamTutar2);
		}
		scn.close();
	}

}
