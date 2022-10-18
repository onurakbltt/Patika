import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int toplam, mat, fizik, kimya, turkce, tarih, muzik;
		double ortalama, dersSayisi;
		Scanner scn = new Scanner(System.in);
		System.out.print("Kaç adet dersiniz var? ");
		dersSayisi = scn.nextDouble();
		System.out.print("Matematik notunuz: ");
		mat = scn.nextInt();
		System.out.print("Fizik notunuz: ");
		fizik = scn.nextInt();
		System.out.print("Kimya notunuz: ");
		kimya = scn.nextInt();
		System.out.print("Türkçe notunuz: ");
		turkce = scn.nextInt();
		System.out.print("Tarih notunuz: ");
		tarih = scn.nextInt();
		System.out.print("Müzik notunuz: ");
		muzik = scn.nextInt();

		toplam = (mat + fizik + kimya + turkce + tarih + muzik);
		ortalama = toplam / dersSayisi;

		boolean kosul = ortalama >= 60;
		String gectiMi = kosul ? "Sınıfı Geçtin" : "Sınıfta Kaldın";
		System.out.println(gectiMi);
		scn.close();
	}
}
