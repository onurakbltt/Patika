import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		boolean artikMi;
		System.out.print("Yılı giriniz: ");
		int yil = scn.nextInt();

		if (yil % 4 == 0) {
			if (yil % 100 == 0) {
				if (yil % 400 == 0) {
					artikMi = true;
				} else {
					artikMi = false;
				}
			} else {
				artikMi = true;
			}
		} else {
			artikMi = false;
		}
		if (artikMi) {
			System.out.println(yil + " bir artık yıldır");
		} else {
			System.out.println(yil + " bir artık yıl değildir");
		}
		scn.close();
	}
}
