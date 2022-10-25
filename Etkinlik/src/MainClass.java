import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int heat;

		Scanner scn = new Scanner(System.in);
		System.out.print("Hava sıcaklığını giriniz: ");
		heat = scn.nextInt();

		if (heat < 5) {
			System.out.println("Kayak yapabilirsiniz");
		} else if (heat >= 5 && heat < 10) {
			System.out.println("Sinemaya gidebilirsiniz");
		} else if (heat >= 10 && heat < 15) {
			System.out.println("Piknik yapabilirsiniz");
			System.out.println("Sinemaya gidebilirsiniz");
		} else if (heat >= 15 && heat < 25) {
			System.out.println("Piknik yapabilirsiniz");
		} else {
			System.out.println("Yüzebilirsiniz");
		}

		scn.close();
	}

}
