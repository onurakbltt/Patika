import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int a, b, c;
		double u, alan;
		Scanner scn = new Scanner(System.in);
		System.out.print("A kenarını giriniz: ");
		a = scn.nextInt();
		System.out.print("B kenarını giriniz: ");
		b = scn.nextInt();
		System.out.print("C kenarını giriniz: ");
		c = scn.nextInt();

		u = (a + b + c) / 2;
		alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
		System.out.println("Üçgenin alanı: " + alan);
	}
}
