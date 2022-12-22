import java.util.Scanner;

public class MainClass {

	static int pattern(int number, int tempNumber, int stopNumber) {
		if (number > 0) {
			System.out.print(number + " ");
			return pattern(number - 5, tempNumber - 5, stopNumber);
		}
		if (tempNumber <= stopNumber) {
			System.out.print(tempNumber + " ");
			return pattern(number, tempNumber + 5, stopNumber);
		}
		return stopNumber;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter a positive number: ");
			number = scanner.nextInt();
			pattern(number, number, number);
			System.out.println();
		} while (number > 0);
	}
}
