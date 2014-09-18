package online;

public class SearchInRotatedSortedArrayII {

    public boolean search(int[] A, int target) {
    	if (A.length <= 0) {
			return false;
		}
		int start = 0, end = A.length - 1;
		return searchRec(A, start, end, target);
	}

	public boolean searchRec(int[] A, int start, int end, int target) {
		int mid = (start + end) / 2;

		if (A[mid] == target) {
			return true;
		}
		if (start > end) {
			return false;
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
				boolean res = searchRec(A, start, mid - 1, target); // search both
																// halves

				if (res == false) { // if left side is not the target localated ,
									// search right
					return searchRec(A, mid + 1, end, target);
				} else
					return res;
			}

		}
		return false;

    
    }
}
