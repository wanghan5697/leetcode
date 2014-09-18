package online;

public class SearchInRotatedSortedArray {
	public int search(int[] A, int target) {
		if (A.length <= 0) {
			return -1;
		}
		int start = 0, end = A.length - 1;
		return searchRec(A, start, end, target);
	}

	public int searchRec(int[] A, int start, int end, int target) {
		int mid = (start + end) / 2;

		if (A[mid] == target) {
			return mid;
		}
		if (start > end) {
			return -1;
		}

		if (A[start] < A[mid]) { // left is normally ordered
			if (target >= A[start] && target <= A[mid]) {
				return searchRec(A, start, mid - 1, target); // search left
			} else
				return searchRec(A, mid + 1, end, target);

		} else if (A[mid] < A[start]) { // right is normally ordered;
			if (target >= A[mid] && target <= A[end]) {
				return searchRec(A, mid + 1, end, target); // search right
			} else
				return searchRec(A, start, mid - 1, target);

		} else if (A[start] == A[mid]) { // if left half is all repeat;
			if (A[end] != A[mid]) { // if right is different ,search right
				return searchRec(A, mid + 1, end, target);
			} else {
				int res = searchRec(A, start, mid - 1, target); // search both
																// halves

				if (res == -1) { // if left side is not the target localated ,
									// search right
					return searchRec(A, mid + 1, end, target);
				} else
					return res;
			}

		}
		return -1;
	}

	public static void main(String args[]) {
		int[] a = { 1, 3 };
		System.out.println(new SearchInRotatedSortedArray().search(a, 3));

	}
}
