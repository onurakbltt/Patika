import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

	int rowNumber;
	int colNumber;
	int mines;
	String[][] board;
	String[][] mineBoard;

	public MineSweeper(int rowNumber, int colNumber) {
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		this.board = new String[rowNumber][colNumber];
		this.mineBoard = new String[rowNumber][colNumber];
		this.mines = (rowNumber * colNumber) / 4;
	}

	public void fillBoard() {
		Random rand = new Random();
		int randRow;
		int randCol;

		for (int i = 0; i < mines; i++) {
			randRow = rand.nextInt(rowNumber);
			randCol = rand.nextInt(colNumber);
			if (mineBoard[randRow][randCol] != "*") {
				mineBoard[randRow][randCol] = "*";
			} else {
				i--;
			}
		}
		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < colNumber; j++) {
				if (mineBoard[i][j] != "*") {
					mineBoard[i][j] = "-";
				}
			}
		}
		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < colNumber; j++) {
				board[i][j] = "-";
			}
		}
	}

	public void printBoard() {
		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < colNumber; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("======================");
	}

	public void printMineBoard() {
		for (int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < colNumber; j++) {
				System.out.print(mineBoard[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("======================");
	}

	public void run() {
		Scanner input = new Scanner(System.in);
		int moveCount = ((rowNumber * colNumber) - mines);
		fillBoard();
		System.out.println("Mayınların Konumu");
		printMineBoard();
		System.out.println("Mayın Tarlası Oyununu Hoşgeldiniz!");
		printBoard();

		while (moveCount > 0) {
			System.out.print("Satır giriniz: ");
			int row = input.nextInt();
			System.out.print("Sütun giriniz: ");
			int col = input.nextInt();

			if ((row < 0 || row >= rowNumber) || (col < 0 || col >= colNumber)) {
				System.out.println("Hatalı Hamle");
				continue;
			}
			if (mineBoard[row][col] == "*") {
				System.out.println("Game Over");
				break;
			} else {
				int mineCounter = 0;
				if (mineBoard[row][col] != "*") {
					if (row != 0) {
						if (mineBoard[row - 1][col] == "*") {
							mineCounter++;
						}
						if (col != 0) {
							if (mineBoard[row - 1][col - 1] == "*") {
								mineCounter++;
							}
						}
					}
					if (row != rowNumber - 1) {
						if (mineBoard[row + 1][col] == "*")
							mineCounter++;
						if (col != colNumber - 1) {
							if (mineBoard[row + 1][col + 1] == "*") {
								mineCounter++;
							}
						}
					}
					if (col != 0) {
						if (mineBoard[row][col - 1] == "*")
							mineCounter++;
						if (row != rowNumber - 1) {
							if (mineBoard[row + 1][col - 1] == "*") {
								mineCounter++;
							}
						}
					}
					if (col != colNumber - 1) {
						if (mineBoard[row][col + 1] == "*")
							mineCounter++;
						if (row != 0) {
							if (mineBoard[row - 1][col + 1] == "*") {
								mineCounter++;
							}
						}
					}
					board[row][col] = Integer.toString(mineCounter);
				}
			}
			moveCount--;
			printBoard();
		}
		if (moveCount == 0) {
			System.out.println("Tebrikler Kazandınız!!!");
		}
	}

}
