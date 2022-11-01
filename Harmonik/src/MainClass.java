import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("N sayısını giriniz: ");
		int n = scn.nextInt();
		double result = 0.0;
		for (double i = 0; i <= n; i++) {
			result += (1 / n);
		}
		System.out.println(result);
		scn.close();
	}

}
