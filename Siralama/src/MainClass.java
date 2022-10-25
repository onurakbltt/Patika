import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int a, b, c;

		System.out.print("İlk sayıyı giriniz: ");
		a = scn.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		b = scn.nextInt();
		System.out.print("Üçüncü sayıyı giriniz: ");
		c = scn.nextInt();

		if ((a > b) && (a > c)) {
			if (b > c) {
				System.out.println("c < b < a");
			} else {
				System.out.println("b < c < a");
			}
		} else if ((b > a) && (b > c)) {
			if (a > c) {
				System.out.println("c < a < b");
			} else {
				System.out.println("a < c < b");
			}
		} else {
			if (a > b) {
				System.out.println("b < a < c");
			} else {
				System.out.println("a < b < c");
			}
		}

		scn.close();
	}

}
