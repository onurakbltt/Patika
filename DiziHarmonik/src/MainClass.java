
public class MainClass {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };

		double sum = 0;
		for (int i = 1; i < numbers.length; i++) {
			sum += (1.0 / i);
		}

		System.out.println(sum);
	}
}
