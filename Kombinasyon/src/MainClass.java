import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n, r;
		double sonuc;
		System.out.println("N'in R'li kombinasyonu");
		System.out.print("N sayısını giriniz: ");
		n = scn.nextInt();
		System.out.print("R sayısını giriniz: ");
		r = scn.nextInt();
		sonuc = Faktoriyel(n) / (Faktoriyel(r) * (Faktoriyel(n - r)));
		System.out.println("Kombinasyonun sonucu: " + sonuc);
		scn.close();
	}

	public static int Faktoriyel(int number) {

		if (number <= 1) {
			return 1;
		} else {
			return number * Faktoriyel(number - 1);
		}

	}
}
