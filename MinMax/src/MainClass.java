import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count, number;
		int min = 0, max = 0;

		System.out.print("How many numbers will you enter? : ");
		count = input.nextInt();

		for (int i = 1; i <= count; i++) {
			System.out.print("Number " + i + " : ");
			number = input.nextInt();
			if (number >= max) {
				max = number;
			}
			if (number <= min) {
				min = number;
			}
		}
		System.out.print("The max value: " + max);
		System.out.println();
		System.out.print("The min value: " + min);
	}
}
