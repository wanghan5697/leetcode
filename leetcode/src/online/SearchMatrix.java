package online;

public class SearchMatrix {

	public boolean searchMatrix(int[][] matrix, int target) {

		if (matrix == null) {
			return false;
		}

		int m = matrix.length; // horizental
		int n = matrix[0].length; // vertical
		int mid = 0;
		int start = 0, end = m - 1;

		while (start <= end) {
			mid = (start + end) / 2;
			if (matrix[mid][0] == target) {
				return true;
			}
			if (matrix[mid][0] < target) {
				start = mid + 1;
			} else if (matrix[mid][0] > target) {
				end = mid - 1;
			}

		}
		
		int targetRow = end;
		start = 0;
		end = n - 1;
		while (start <= end) {
			mid = (start+end)/2;

			if (matrix[targetRow][mid] == target) {
				return true;
			} else if (matrix[targetRow][mid] < target) {
				start = mid + 1;
			} else
				end = mid - 1;
		}

		return false;
	}

	public static void main(String args[]){
		int matrix[][]={{1,   3,  5,  7},
		                {10, 11, 16, 20},
		                {23, 30, 34, 50}};
	System.out.println( new SearchMatrix().searchMatrix(matrix, 16));
	   
	}
}
