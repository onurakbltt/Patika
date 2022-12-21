import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, total = 0;

		System.out.print("Enter a number: ");
		number = input.nextInt();

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}
		if (total == number) {
			System.out.println(number + " is perfect number");
		} else {
			System.out.println(number + " is not perfect number");
		}
	}

}
