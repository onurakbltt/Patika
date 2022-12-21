import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = input.nextInt();

		for (int i = 0; i <= n; i++) {
			for (int b = n; b > (n - i); b--) {
				System.out.print(" ");
			}
			for (int c = 1; c <= (2 * (n - i) - 1); c++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
