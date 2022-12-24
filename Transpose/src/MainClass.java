
public class MainClass {

	public static void main(String[] args) {
		int[] sayilar1 = { 1, 2, 3 };
		int[] sayilar2 = { 4, 5, 6 };
		int[][] matris = new int[][] { sayilar1, sayilar2 };

		int[][] transpose = new int[matris[0].length][matris.length];
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[0].length; j++) {
				transpose[j][i] = matris[i][j];
			}
		}

		System.out.println("Matris: ");
		for (int i[] : matris) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("\nTranspose: ");
		for (int i[] : transpose) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
