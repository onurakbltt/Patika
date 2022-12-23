import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };

		System.out.print("Bir sayı giriniz: ");
		int num = input.nextInt();

		System.out.println("Dizi: " + Arrays.toString(list));
		System.out.println("Girilen Sayı: " + num);

		Arrays.sort(list);
		int min = list[0];
		int max = list[list.length - 1];

		for (int j : list) {
			if (j > min && j < num)
				min = j;
		}

		for (int j : list) {
			if (j < max && j > num)
				max = j;
		}

		System.out.println("Girilen Sayıdan Küçük En Yakın Sayı: " + min);
		System.out.println("Girilen Sayıdan Büyük En Yakın Sayı: " + max);
	}

}
