package zsgs;

import java.util.Scanner;

public class MatrixTranspose {
	public static void matrixTranspose(int[][] matrix, int row, int column) {

		for (int i = 0; i < row; i++) {
			for (int j = i + 1; j < column; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;

			}
		}
		printMatrix(matrix);
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the row");
		int row = scan.nextInt();
		System.out.println("Enter the column");
		int col = scan.nextInt();
		int[][] matrixTranspose = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrixTranspose[i][j] = scan.nextInt();
			}
		}
		matrixTranspose(matrixTranspose, row, col);

	}

}
