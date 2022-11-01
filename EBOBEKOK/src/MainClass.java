import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("n1 sayısını giriniz: ");
		int n1 = scn.nextInt();

		System.out.print("n2 sayısını giriniz: ");
		int n2 = scn.nextInt();
		int ebob = 0, min = Math.min(n1, n2), count = 0;

		while (count <= min) {
			count++;
			if (n1 % count == 0 && n2 % count == 0) {
				ebob = count;
			}

		}
		System.out.println("EBOB: " + ebob);
		System.out.println("EKOK: " + ((n1 * n2) / ebob));

		scn.close();
	}
}
