import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int mesafe, yas, tip;
		double ucret, mesafeBasi = 0.10;
		System.out.print("Mesafeyi kilometre cinsinden giriniz: ");
		mesafe = scn.nextInt();
		System.out.print("Yaşınızı giriniz: ");
		yas = scn.nextInt();
		System.out.print("Yolculuk tipini giriniz(1 => Tek Yön, 2 => Gidiş Dönüş) ");
		tip = scn.nextInt();

		if ((mesafe > 0) && (yas > 0)) {
			ucret = mesafe * mesafeBasi;
			if (yas < 12) {
				ucret = ucret - (ucret * 0.50);
			} else if (yas > 12 && yas < 24) {
				ucret = ucret - (ucret * 0.10);
			} else if (yas > 65) {
				ucret = ucret - (ucret * 0.30);
			}
			if (tip == 2) {
				ucret = (ucret - (ucret * 0.20)) * 2;
			}
			System.out.println("Toplam tutar " + ucret);
		} else {
			System.out.println("Hatalı veri girdiniz");
		}
		scn.close();
	}

}
