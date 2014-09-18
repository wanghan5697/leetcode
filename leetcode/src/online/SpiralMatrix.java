package online;

import java.util.ArrayList;

public class SpiralMatrix {

	public ArrayList<Integer> spiralOrder(int[][] matrix) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (matrix == null || matrix.length == 0) {
			return result;
		}
		int row = matrix.length;
		int col = matrix[0].length;

		int x = 0, y = 0;
		while (row > 0 && col > 0) {

			if (row == 1) {
				for (int i = 0; i < col; i++) {

					result.add(matrix[x][y++]);

				}
				break;

			} else if (col == 1) {
				for (int j = 0; j < row; j++) {
					result.add(matrix[x++][y]);
				}
				break;
			}
			// top ->move right
			for (int i = 0; i < col - 1; i++) {
				result.add(matrix[x][y++]);
			}
			// right->move down
			for (int i = 0; i < row - 1; i++) {
				result.add(matrix[x++][y]);
			}
			// bottom->move left
			for (int i = 0; i < col - 1; i++) {
				result.add(matrix[x][y--]);
			}
			// left->move up
			for (int i = 0; i < row - 1; i++) {
				result.add(matrix[x--][y]);
			}
			x++;
			y++;
			row = row - 2;
			col = col - 2;

		}
		return result;

	}

	public static void main(String args[]) {
		int[][] matrix = { { 1, 2, 3, 4 } };
		System.out.print(new SpiralMatrix().spiralOrder(matrix));

	}
}
