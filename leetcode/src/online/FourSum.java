package online;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FourSum {
	public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

		if (num == null || num.length < 4) {
			return res;
		}
		HashSet<ArrayList<Integer>> hashSet = new HashSet<ArrayList<Integer>>();
		Arrays.sort(num);
		for (int i = 0; i <= num.length - 4; i++) {
			for (int j = i + 1; j <= num.length - 3; i++) {
				int low = j + 1;
				int high = num.length - 1;
				while (low < high) {
					int sum = num[i] + num[j] + num[low] + num[high];
					if (sum == target) {
						ArrayList<Integer> unit = new ArrayList<Integer>();
						unit.add(num[i]);
						unit.add(num[j]);
						unit.add(num[low]);
						unit.add(num[high]);

						if (!hashSet.contains(unit)) {
							res.add(unit);
							hashSet.add(unit);
						}
						low++;
						high--;
					} else if (sum < target) {
						low++;
					} else {
						high--;
					}

				}

			}
		}
		return res;

	}
}
