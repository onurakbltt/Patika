import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n, k;
		int total = 1;
		System.out.print("Üssü alınacak sayı: ");
		n = scn.nextInt();
		System.out.print("Üs olacak sayı: ");
		k = scn.nextInt();

		for (int i = 1; i <= k; i++) {
			total *= n;
		}
		System.out.println(n + " üssü " + k + " : " + total);
		scn.close();
	}

}
