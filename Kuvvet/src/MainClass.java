import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num;
		System.out.print("Sayı giriniz: ");
		num = scn.nextInt();
		System.out.println("4'ün kuvvetleri");
		for (int i = 1; i < num; i *= 4) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("5'ün kuvvetleri");
		for (int i = 1; i < num; i *= 5) {
			System.out.print(i + " ");
		}
		scn.close();
	}
}
