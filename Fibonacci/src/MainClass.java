import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sum = 0, a = 0, b = 1;
		System.out.print("Eleman sayısını giriniz: ");
		int n = input.nextInt();

		for (int i = 0; i <= n; i++) {
			sum = a + b;
			System.out.print(a + " ");
			a = b;
			b = sum;
		}
	}

}
