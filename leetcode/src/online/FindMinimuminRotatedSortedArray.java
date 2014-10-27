package online;

public class FindMinimuminRotatedSortedArray {
	public int findMin(int[] num) {
		if (num == null || num.length == 0) {
			return -1;
		}
		int start = 0;
		int end = num.length - 1;
		int min = num[0];
		while (start < end - 1) { // avoid start = end position comparsion .
			int mid = (start + end) / 2;
			if (num[start] < num[mid]) {
				min = Math.min(min, num[start]);
				start = mid + 1;
			} else if (num[start] > num[mid]) {
				min = Math.min(min, num[mid]);
				end = mid - 1;
			} else {
				start++;
			}
		}
		min = Math.min(min, num[end]);
		min = Math.min(min, num[start]);
		return min;

	}

	public static void main(String args[]) {
		int num[] = { 4, 5, 6, 7, 8, 1, 2 };
		int result = new FindMinimuminRotatedSortedArray().findMin(num);
		System.out.println(result);
	}

}
