import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num, total = 0, count = 0;
		double avg;
		System.out.print("Bir sayı giriniz: ");
		num = scn.nextInt();

		for (int i = 1; i <= num; i++) {
			if ((i % 3 == 0) && (i % 4 == 0)) {
				total += i;
				count++;
			}
		}
		avg = total / count;
		System.out.println("3'e ve 4'e bölünen sayıların ortalaması: " + avg);
		scn.close();
	}

}
