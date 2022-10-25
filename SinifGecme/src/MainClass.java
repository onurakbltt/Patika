import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int mat, fizik, turkce, kimya, muzik, toplam = 0, dersSayisi = 0;
		float avg;

		System.out.print("Matematk notunu giriniz: ");
		mat = scn.nextInt();
		if (mat < 0 || mat > 100) {
			System.out.println("Gecerli not değil !! Ortalamaya dahil edilmedi...");
		} else {
			toplam += mat;
			dersSayisi += 1;
		}

		System.out.print("Fizik notunu giriniz: ");
		fizik = scn.nextInt();
		if (fizik < 0 || fizik > 100) {
			System.out.println("Gecerli not değil !! Ortalamaya dahil edilmedi...");
		} else {
			toplam += mat;
			dersSayisi += 1;
		}

		System.out.print("Türkçe notunu giriniz: ");
		turkce = scn.nextInt();
		if (turkce < 0 || turkce > 100) {
			System.out.println("Gecerli not değil !! Ortalamaya dahil edilmedi...");
		} else {
			toplam += mat;
			dersSayisi += 1;
		}

		System.out.print("Kimya notunu giriniz: ");
		kimya = scn.nextInt();
		if (kimya < 0 || kimya > 100) {
			System.out.println("Gecerli not değil !! Ortalamaya dahil edilmedi...");
		} else {
			toplam += mat;
			dersSayisi += 1;
		}

		System.out.print("Müzik notunu giriniz: ");
		muzik = scn.nextInt();
		if (muzik < 0 || muzik > 100) {
			System.out.println("Gecerli not değil !! Ortalamaya dahil edilmedi...");
		} else {
			toplam += mat;
			dersSayisi += 1;
		}

		avg = toplam / dersSayisi;
		System.out.println("Ortalama:" + avg);

		if (avg >= 55) {
			System.out.println("Sınıfı geçtin");
		} else {
			System.out.println("Sınıfta kaldın");
		}
		scn.close();
	}

}
