import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int kilo;
		double vki, boy;
		System.out.print("Lütfen boyunuzu(metre cinsinde) giriniz: ");
		boy = scn.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz: ");
		kilo = scn.nextInt();

		vki = kilo / (boy * boy);

		System.out.println("Vücut Kitle İndeksiniz: " + vki);
		scn.close();
	}

}
