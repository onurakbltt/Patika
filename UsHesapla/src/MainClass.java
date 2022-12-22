import java.util.Scanner;

public class MainClass {

	static double usBul(int base, int pow) {
		if (pow == 0)
			return 1;
		else if (pow < 0)
			return (1 / (double) base) * (double) usBul(base, pow + 1);
		else
			return base * usBul(base, pow - 1);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int base, pow;
		System.out.print("Taban değeri giriniz: ");
		base = input.nextInt();
		System.out.print("Üs değerini giriniz: ");
		pow = input.nextInt();
		System.out.println(usBul(base, pow));
	}

}
