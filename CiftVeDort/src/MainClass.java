import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num, sum = 0;

		do {
			System.out.print("Sayı giriniz: ");
			num = scn.nextInt();
			if (num % 4 == 0) {
				sum += num;
			}
		} while (num % 2 == 0);
		System.out.println("Toplam: " + sum);
		scn.close();
	}

}
