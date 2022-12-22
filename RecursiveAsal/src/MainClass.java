import java.util.Scanner;

public class MainClass {

	static boolean isPrime(int number, int a) {
		if (number <= 2)
			return (number == 2) ? true : false;
		if (number == a)
			return true;
		if (number % a == 0)
			return false;
		return isPrime(number, a + 1);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, a = 2;

		do {
			System.out.print("Bir sayı giriniz: ");
			number = input.nextInt();

			if (isPrime(number, a))
				System.out.println(number + " sayısı asal sayıdır");
			else
				System.out.println(number + " sayısı asal sayı değidir.");
		} while (number >= 0);
	}
}
