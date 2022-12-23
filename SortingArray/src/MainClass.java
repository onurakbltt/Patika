import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Dizinin boyutu n: ");
		int boyut = input.nextInt();
		int[] list = new int[boyut];

		System.out.println("Dizinin elemanlarını giriniz: ");
		for (int i = 0; i < boyut; i++) {
			System.out.print((i + 1) + ". eleman: ");
			int a = input.nextInt();
			list[i] = a;
		}

		Arrays.sort(list);
		for (int i : list) {
			System.out.print(i + " ");
		}
	}
}
