import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int num1, num2, select;

		Scanner scn = new Scanner(System.in);

		System.out.print("İlk sayıyı giriniz: ");
		num1 = scn.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		num2 = scn.nextInt();

		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		System.out.print("Seçiminiz:");
		select = scn.nextInt();

		switch (select) {
		case 1: {
			System.out.println("Toplama: " + (num1 + num2));
			break;
		}
		case 2: {
			System.out.println("Çıkarma: " + (num1 - num2));
			break;
		}
		case 3: {
			System.out.println("Çarpma: " + (num1 * num2));
			break;
		}
		case 4: {
			if (num2 != 0) {
				System.out.println("Bölme: " + (num1 / num2));
			} else {
				System.out.println("Bir sayı sıfıra bölünemez!");
			}
			break;
		}
		default:
			System.out.println("Yanlış seçim yaptınız.");
		}
		scn.close();
	}

}
