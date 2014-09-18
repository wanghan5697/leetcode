package online;

import java.util.ArrayList;

public class PermutationSequence {
	public String getPermutation(int n, int k) {

		if (n <= 0) {
			return "";
		}
		k--;

		StringBuilder sb = new StringBuilder();
		int factorial = 1;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 2; i < n; i++) {
			factorial *= i;
		}
		for (int i = 1; i <= n; i++) {
			nums.add(i);
		}
		int round = n - 1;
		while (round >= 0) {
			int index = k / factorial;
			k %= factorial;
			sb.append(nums.get(index));
			nums.remove(index);
			if (round > 0)
				factorial /= round;
			round--;
		}
		return sb.toString();

	}

}