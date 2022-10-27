import java.util.Scanner;

public class MainClass {
	@SuppressWarnings(value = "unused")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int adet = 0, toplam = 0;
		System.out.print("Bir sayı girin: ");
		int num = scn.nextInt();
		while (num != 0) {
			toplam += (num % 10);
			num /= 10;
			++adet;
		}
		System.out.println("Basamakların toplamı: " + toplam);
		scn.close();
	}

}
