import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		int[] list = { 10, 20, 20, 10, 10, 20, 5, 20 };
		Arrays.sort(list);
		int count = 0;
		int tempNum = list[0];

		System.out.println("Tekrar sayıları: ");
		for (int i = 0; i < list.length; i++) {
			if (i == 0 || tempNum != list[i]) {
				for (int j : list) {
					if (j == list[i]) {
						count++;
						tempNum = list[i];
					}
				}
				System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi");
				count = 0;
			}
		}

	}
}
